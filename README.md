# be14-4th-Ideality-MyLocalDiary

1. 프로젝트 개요
My Local Diary란?
My Local Diary는 지도 기반 소셜 네트워크 서비스(SNS)입니다. 사용자는 나와 타인이 작성한 게시글을 지도에 마커 형태로 표시하여, 사람들이 간 장소의 위치를 한번에 지도로  확인할 수 있습니다.

2. 개발 동기
초기 아이디어 논의 과정에서 "동네 생활 정보 통합 서비스"라는 주제가 제안되었습니다. 예를 들어, 공사 중인 위험 지역이나 붕어빵을 파는 장소 같은 정보를 지도에 표시하는 방식이었습니다. 당시 서비스명 후보는 '싱크홀 피해서 붕어빵 먹기' 였습니다.

이 아이디어는 여러 현실적인 이유로 무산되었지만, 지도 기반이라는 핵심 컨셉은 유지하고 방향을 "지도 기반 다이어리(SNS)"로 전환하게 되었습니다.

초기 아이디어를 살리고자,

서비스 곳곳에 붕어빵 모티브를 사용했습니다. (예: 랜딩 페이지, 좋아요 아이콘)

지도 마커에 마우스를 올리면 싱크홀처럼 회오리 효과가 발생합니다.

그래서 최종 부제는
My Local Diary : 싱크홀 피해서 붕어빵 먹기
로 결정되었습니다.

3. 서비스 주요 기능
1) 마이페이지 (프로필) 기능
사용자가 설정한 프로필 음악이 자동으로 재생됩니다.
→ 싸이월드 감성을 재현했습니다.

마이페이지 내에도 작은 개인 지도가 표시되어, 사용자의 게시글 위치를 확인할 수 있습니다.

2) 지도 홈
로그인 후 기본 페이지는 지도 홈입니다.
지도에는 내가 작성한 글과 타인이 작성한 글이 마커로 표시됩니다.
오른쪽 사이드바에는 내가 팔로잉한 유저 목록이 실시간으로 보여집니다.

3) 팔로우 및 알림 기능
공개 계정은 팔로우 버튼 클릭 시 즉시 팔로우됩니다.
비공개 계정은 팔로우 요청을 보내고, 상대방이 수락하거나 거절할 수 있습니다.
팔로우가 완료되면 상대방에게 실시간 알림이 전송됩니다.

4) 스탬프 및 뱃지 시스템
게시글을 작성하면 특정 기준에 따라 스탬프를 획득할 수 있습니다.
스탬프를 카테고리별로 5개 모으면 뱃지를 받을 수 있습니다.
뱃지를 클릭하면 랜덤으로 고양이 소리가 재생되는 깜짝 요소도 추가했습니다.
## 🕹️ 기술 스택(예시, 수정 필요)

### Backend
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=for-the-badge)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-000000?style=for-the-badge&logo=JSON%20web%20tokens&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)

### Frontend
![Vue.js](https://img.shields.io/badge/Vue.js-4FC08D?style=for-the-badge&logo=vue.js&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)
![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)
![Axios](https://img.shields.io/badge/Axios-5A29E4?style=for-the-badge)
![Vue Router](https://img.shields.io/badge/Vue_Router-4FC08D?style=for-the-badge)
![Vuetify](https://img.shields.io/badge/Vuetify-1867C0?style=for-the-badge)

### Database
![MariaDB](https://img.shields.io/badge/MariaDB-003545?style=for-the-badge&logo=mariadb&logoColor=white)
![Redis](https://img.shields.io/badge/Redis-DC382D?style=for-the-badge&logo=redis&logoColor=white)

### AWS
![AWS](https://img.shields.io/badge/AWS-232F3E?style=for-the-badge&logo=amazonaws&logoColor=white)
![Kubernetes](https://img.shields.io/badge/Kubernetes-326CE5?style=for-the-badge&logo=kubernetes&logoColor=white)
![Amazon S3](https://img.shields.io/badge/Amazon_S3-569A31?style=for-the-badge&logo=amazonaws&logoColor=white)


### Tools
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)
![Figma](https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white)
![Discord](https://img.shields.io/badge/Discord-5865F2?style=for-the-badge&logo=discord&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)

## 📝 팀원별 회고 모음

### 🙋‍♀️ 팀원 A - @githubID_A

- **이번 프로젝트에서 맡은 역할**
  - 예: 프론트엔드 UI 개발, 로그인 기능 구현

- **잘한 점**
  - 예: 초기 기획 의도에 맞게 사용자 경험 중심의 UI 구현

- **아쉬운 점**
  - 예: Axios 에러 핸들링에서 예외 케이스를 더 고려했으면 좋았을 것

- **배운 점**
  - 예: Pinia 상태 관리 패턴, Composition API의 유용성

- **다음 프로젝트에 적용하고 싶은 점**
  - 예: 코드 리뷰를 주기적으로 진행하기

---

### 🙋‍♂️ 팀원 B - @githubID_B

- **이번 프로젝트에서 맡은 역할**
  - 예: 백엔드 API 설계, JWT 인증 구현

- **잘한 점**

- **아쉬운 점**

- **배운 점**

- **다음 프로젝트에 적용하고 싶은 점**

---

### 🙋 팀원 C - @githubID_C

_(아래 항목을 채워주세요)_

- **이번 프로젝트에서 맡은 역할**
- **잘한 점**
- **아쉬운 점**
- **배운 점**
- **다음 프로젝트에 적용하고 싶은 점**
