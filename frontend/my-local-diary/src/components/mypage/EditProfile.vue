<template>
  <div class="box">
    <div v-if="isLoading" class="loading-wrapper">
      <LoadingModal :today="new Date()" :message="fetchingUserMessage"/>
    </div>
    <div v-else>
      <h2 class="text-h5 font-weight-bold text-center mb-8" style="color: #ff6666">프로필 편집</h2>

      <!-- 프로필 이미지 -->
      <div class="d-flex flex-column align-center mb-4">
        <v-avatar size="100" class="mb-2">
          <img :src="localProfileImage" alt="프로필 이미지" style="width: 100%; height: 100%; object-fit: cover;" />
        </v-avatar>

        <div class="button-group">
          <input ref="fileInput" type="file" accept="image/*" class="hidden" @change="handleImageUpload" />
          <v-btn size="small" color="black" variant="outlined" @click="triggerFileInput">
            프로필 사진 변경
          </v-btn>
          <v-btn size="small" color="error" variant="text" class="ml-2" @click="resetProfileImage">
            프로필 사진 삭제
          </v-btn>
        </div>
      </div>

      <!-- 닉네임 -->
      <v-text-field label="닉네임" 
        v-model="nickname" 
        variant="outlined"
        dense
        class="mb-3"
        :error="!isNicknameAvailable"
        :hint="isNicknameAvailable ? '사용 가능한 닉네임입니다.' : '이미 사용 중인 닉네임입니다.'"/>

      <!-- 프로필 뮤직 -->
      <div class="d-flex flex-column  mb-4">
        <v-select
          style="width: 100%;"
          label="프로필 뮤직"
          :items="musicOptions"
          v-model="selectedMusic"
          prepend-inner-icon="mdi-music"
        />
        <div class="d-flex justify-end mt-2">
          <v-btn size="small" color="error" variant="text" @click="resetProfileMusic">
            프로필 뮤직 삭제
          </v-btn>
        </div>
      </div>


      <!-- 공개 범위 -->
      <div class="d-flex align-center justify-space-between my-4">
        <div>
          <div class="font-weight-medium">계정 공개 범위</div>
          <div class="text-caption">현재 {{ isPublic ? '공개' : '비공개' }} 상태입니다.</div>
        </div>
        <v-switch v-model="isPublic" hide-details />
      </div>

      <!-- 소개 -->
      <v-textarea label="소개" rows="4" v-model="bio" />

      <!-- 버튼 -->
      <v-btn color="black" 
      class="mt-6 button" 
      :disabled="!isFormValid" 
      @click="submitProfile">프로필 편집 완료</v-btn>

      <!-- 모달 -->
      <LoadingModal v-if="showModal" :today="new Date()"  :message="editProfileMessage"/>

    </div>
    
  </div>
</template>

<script setup>
import { ref, onMounted, watch, computed } from 'vue'
import { useRouter } from 'vue-router'
import { useUserStore } from '@/stores/userStore.js'
import axios from 'axios'
import LoadingModal from '@/components/common/LoadingModal.vue'

const router = useRouter()
const userStore = useUserStore()
const isLoading = ref(true)   // 초기 유저 데이터 가져올 때 로딩 
const showModal = ref(false)  // 편집 완료 시 로딩 
const fetchingUserMessage = ref(`${userStore.nickname} 님의 데이터 불러오는 중`)
const editProfileMessage = ref('저장 중')

// form 입력값
const nickname = ref('')
const selectedMusic = ref('')
const isPublic = ref(false)
const bio = ref('')
const localProfileImage = ref('/images/profile/defaultProfile.png')
const uploadedFile = ref(null) // 🔥 새로 선택한 파일 저장
const fileInput = ref(null)

// 닉네임 중복 체크 관련
let nicknameTimer = null
const isNicknameAvailable = ref(true)
const originalNickname = ref('') // ✅ 원래 닉네임 따로 저장
// 토큰
const token = userStore.token;

// 버튼 활성화
const isFormValid = computed(() => {
  return isNicknameAvailable.value && nickname.value.trim() !== ''
})
const musicOptions = [
  { title: 'aespa - Supernova', url: 'https://rococo-cocada-2c23e0.netlify.app/audio/aespa%20-%20Supernova.mp3' },
  { title: 'aespa - Armageddon', url: 'https://rococo-cocada-2c23e0.netlify.app/audio/aespa%20-%20Armageddon.mp3' },
  { title: '아일릿 - Lucky Girl Syndrome', url: 'https://rococo-cocada-2c23e0.netlify.app/audio/%EC%95%84%EC%9D%BC%EB%A6%BF%20-%20Lucky%20Girl%20Syndrome.flac' },
  { title: 'tws (투어스) - 첫 만남은 계획대로 되지 않아', url: 'https://rococo-cocada-2c23e0.netlify.app/audio/tws%20(%ED%88%AC%EC%96%B4%EC%8A%A4)-%EC%B2%AB%20%EB%A7%8C%EB%82%A8%EC%9D%80%20%EA%B3%84%ED%9A%8D%EB%8C%80%EB%A1%9C%20%EB%90%98%EC%A7%80%20%EC%95%8A%EC%95%84.mp3' },
  { title: '유정석 - 질풍가도', url: 'https://rococo-cocada-2c23e0.netlify.app/audio/%EC%9C%A0%EC%A0%95%EC%84%9D-%EC%A7%88%ED%92%8D%EA%B0%80%EB%8F%84.mp3' },
  { title: 'Charlie Puth - Dangerously', url: 'https://rococo-cocada-2c23e0.netlify.app/audio/Charlie%20Puth%20-%20Dangerously.mp3' },
  { title: 'Lauv - Steal The Show (From “엘리멘탈”)', url: 'https://rococo-cocada-2c23e0.netlify.app/audio/Lauv-Steal%20The%20Show%20(From%20%E2%80%9C%EC%97%98%EB%A6%AC%EB%A9%98%ED%83%88%E2%80%9D).mp3' },
  { title: 'Jeremy Zucker - comethru', url: 'https://rococo-cocada-2c23e0.netlify.app/audio/Zeremy%20Zucker%20-%20comethru.mp3' },
  { title: '스텔라장 - L’Amour, Les Baguettes, Paris-Stairs', url: 'https://rococo-cocada-2c23e0.netlify.app/audio/%EC%8A%A4%ED%85%94%EB%9D%BC%EC%9E%A5%20(Stella%20Jang)-L%E2%80%99Amour,%20Les%20Baguettes,%20Paris-Stairs.mp3' },
  { title: '전영호 - ButterFly (디지몬 어드벤처)', url: 'https://rococo-cocada-2c23e0.netlify.app/audio/%EC%A0%84%EC%98%81%ED%98%B8-%20ButterFly%20(%EB%94%94%EC%A7%80%EB%AA%AC%20%EC%96%B4%EB%93%9C%EB%B2%A4%EC%B2%98).mp3' },
  { title: '잔나비 - 주저하는 연인들을 위해', url: 'https://rococo-cocada-2c23e0.netlify.app/audio/%EC%9E%94%EB%82%98%EB%B9%84%20(JANNABI)%20-%20%EC%A3%BC%EC%A0%80%ED%95%98%EB%8A%94%20%EC%97%B0%EC%9D%B8%EB%93%A4%EC%9D%84%20%EC%9C%84%ED%95%B4.mp3' },
  { title: '잔나비 - 초록을 거머쥔 우리는', url: 'https://rococo-cocada-2c23e0.netlify.app/audio/%EC%9E%94%EB%82%98%EB%B9%84%20%EC%B4%88%EB%A1%9D%EC%9D%84%EA%B1%B0%EB%A8%B8%EC%A5%94%EC%9A%B0%EB%A6%AC%EB%8A%94.mp3' },
  { title: '박재범 - 좋아 (JOAH)', url: 'https://rococo-cocada-2c23e0.netlify.app/audio/%EB%B0%95%EC%9E%AC%EB%B2%94%20-%20%EC%A2%8B%EC%95%84%20(JOAH).mp3' },
  { title: '프리스타일 - Y', url: 'https://rococo-cocada-2c23e0.netlify.app/audio/Freestyle%20-%20Y.mp3' }
];
// onMounted
onMounted(async () => {
  isLoading.value = true
  await userStore.restoreUser()
  nickname.value = userStore.nickname
  selectedMusic.value = getFileNameFromUrl(userStore.profileMusic)
  isPublic.value = userStore.isPublic === 'TRUE'
  bio.value = userStore.bio
  localProfileImage.value = userStore.profileImage || '/images/profile/defaultProfile.png'
  isLoading.value = false
  originalNickname.value = nickname.value
})

// 🔥 파일 선택 (업로드 안 하고, 미리보기만)
const triggerFileInput = () => {
  fileInput.value.click()
}

// 닉네임 중복 체크
watch(nickname, (newName) => {
  clearTimeout(nicknameTimer)

  if (!newName) return

   // ✨ 원래 닉네임이면 체크하지 않고 통과
  if (newName === originalNickname.value) {
    isNicknameAvailable.value = true
    return
  }

  nicknameTimer = setTimeout(async () => {
    try {
      const res = await axios.get('http://localhost:8080/api/member/check-nickname', {
        params: { nickname: newName },
        headers: { Authorization: `Bearer ${token}` }
      })
      isNicknameAvailable.value = res.data.data.available
    } catch (e) {
      isNicknameAvailable.value = false
    }
  }, 500)
})

const handleImageUpload = (event) => {
  const file = event.target.files[0]
  if (file) {
    uploadedFile.value = file
    localProfileImage.value = URL.createObjectURL(file) // 미리보기
  }
}

// 🔥 프로필 사진 삭제
const resetProfileImage = () => {
  uploadedFile.value = null
  localProfileImage.value = '/images/profile/defaultProfile.png'
}

// 🔥 프로필 뮤직 삭제
const resetProfileMusic = () => {
  selectedMusic.value = ''
}

// 이미지를 보내기 위한 작업
function dataURLtoFile(dataUrl, filename) {
  const arr = dataUrl.split(',')
  const mime = arr[0].match(/:(.*?);/)[1]
  const bstr = atob(arr[1])
  let n = bstr.length
  const u8arr = new Uint8Array(n)
  while (n--) u8arr[n] = bstr.charCodeAt(n)
  return new File([u8arr], filename, { type: mime })
}

// 🔥 프로필 저장
const submitProfile = async () => {
  try {
    // 🔽 PATCH 요청 - 백엔드에서 S3 업로드까지 수행
    const patchForm = new FormData()
    patchForm.append('nickname', nickname.value)
    patchForm.append('profile_music', selectedMusic.value)
    patchForm.append('is_public', isPublic.value ? 'TRUE' : 'FALSE')
    patchForm.append('bio', bio.value)

    // ✅ 파일이 있을 경우에만 append
    if (uploadedFile.value) {
      patchForm.append('file', uploadedFile.value)
    }

    const patchResponse = await axios.patch('http://localhost:8080/api/member/profile', patchForm, {
      headers: {
        'Content-Type': 'multipart/form-data',
        Authorization: `Bearer ${token}`
      },
      withCredentials: true
    })

    console.log('🎉 프로필 업데이트 성공:', patchResponse.data)

    // 프로필 PATCH 성공 후
    await userStore.restoreUser(); // ✅ 수정된 정보 다시 불러오기

    showModal.value = true;
    setTimeout(() => {
      showModal.value = false;
      router.push(`/mypage/${userStore.id}`);
    }, 2000);

  } catch (error) {
    console.error('❌ 프로필 업데이트 실패:', error.response?.data || error.message)
    alert('프로필 수정 실패')
  }
}

// 파일명 추출
function getFileNameFromUrl(url) {
  if (!url) return ''
  return url.split('/').pop().replace(/\.[^/.]+$/, '')
}
</script>



<style scoped>
.box {
  padding: 8% 12%;
}

.font-weight-medium {
  font-weight: 500;
}

.button {
  width: fit-content;
  float: right;
}

.hidden {
  display: none;
}

.button-group {
  display: flex;
  gap: 8px;
  justify-content: center;
}

.mb-2 {
  border: 1px solid rgb(219, 219, 219);
}
</style>
