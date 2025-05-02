# be14-4th-Ideality-MyLocalDiary

| 이혜영 | 정민선 | 한석현 | 정동한 | 권민수 | 장시원 |
|--------|--------|--------|--------|--------|--------|
| <img src="https://github.com/user-attachments/assets/90d69166-6eee-4d9b-bdd0-ac230c4b42ef" width="200" height="200"> | <img src="https://github.com/user-attachments/assets/058daceb-2a13-4c5d-a6c6-59dfd3b5e62f" width="200" height="200"> | <img src="https://github.com/user-attachments/assets/c17d7bc2-4a71-4323-8fb4-7fb38f518daa" width="200" height="200"> | <img src="https://github.com/user-attachments/assets/2e2ec6dc-d653-4fbe-85a5-d8cb2706097b" width="200" height="200"> | <img src="https://github.com/user-attachments/assets/369c6510-e8bd-48f4-b7d4-c1ed56d4fcdb" width="200" height="200"> | <img src="https://github.com/user-attachments/assets/placeholder.png" width="200" height="200"> | <img src="https://github.com/user-attachments/assets/placeholder.png" width="200" height="200"> |
| ISTP | ESTP | ENFP | ESFP | ENFP | ??? |



## 1. 프로젝트 개요
My Local Diary란?
My Local Diary는 지도 기반 소셜 네트워크 서비스(SNS)입니다. 사용자는 나와 타인이 작성한 게시글을 지도에 마커 형태로 표시하여, 사람들이 간 장소의 위치를 한번에 지도로  확인할 수 있습니다.

## 2. 개발 동기
초기 아이디어 논의 과정에서 "동네 생활 정보 통합 서비스"라는 주제가 제안되었습니다. 예를 들어, 공사 중인 위험 지역이나 붕어빵을 파는 장소 같은 정보를 지도에 표시하는 방식이었습니다. 당시 서비스명 후보는 '싱크홀 피해서 붕어빵 먹기' 였습니다.

이 아이디어는 여러 현실적인 이유로 무산되었지만, 지도 기반이라는 핵심 컨셉은 유지하고 방향을 "지도 기반 다이어리(SNS)"로 전환하게 되었습니다.

초기 아이디어를 살리고자,

서비스 곳곳에 붕어빵 모티브를 사용했습니다. (예: 랜딩 페이지, 좋아요 아이콘)

지도 마커에 마우스를 올리면 싱크홀처럼 회오리 효과가 발생합니다.

그래서 최종 부제는
My Local Diary : 싱크홀 피해서 붕어빵 먹기
로 결정되었습니다.

## 3. 서비스 주요 기능
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


## DDD
### 도메인 도출
<img width="1117" alt="스크린샷 2025-05-02 오후 6 05 44" src="https://github.com/user-attachments/assets/eb487671-fb52-4800-b4be-19dc89b54e18" />

### Bounded Context
<img width="1099" alt="스크린샷 2025-05-02 오후 6 07 28" src="https://github.com/user-attachments/assets/c228d2e9-618d-46dc-bb68-1ed582a2c548" />


### 연관 관계
<img width="1289" alt="스크린샷 2025-05-02 오후 6 07 55" src="https://github.com/user-attachments/assets/a707ea82-fa65-4532-9187-48b31f56022a" />


## ERD
<img width="931" alt="스크린샷 2025-05-02 오후 6 00 18" src="https://github.com/user-attachments/assets/95a3671f-72d7-4c9d-8951-249729eaaf19" />


## 📝 팀원별 회고 모음

### 🙋‍♀️ 팀원 이혜영 - @Hailyee

우리 팀은 SNS 스타일의 프로젝트를 만들면서 팔로우/팔로잉 기능을 구현했고, 자연스럽게 실시간 알림이 필요했다. 이를 위해 **SSE(Server-Sent Events)**를 도입했고, 내가 이 부분을 맡게 되어 스스로 새로운 개념을 찾아보고 적용하는 경험을 할 수 있었다.

처음에는 FOLLOW 테이블에 저장된 데이터를 기반으로 NOTIFICATION 테이블을 갱신하고, 클라이언트에 실시간 이벤트를 보내는 구조를 만들었다. 백엔드와 프론트를 연결하는 과정에서 CORS 문제를 만났지만, 직접 설정을 수정해 해결하며 네트워크 통신에 대한 이해도 넓어졌다.

이번 경험을 통해 실시간 통신 흐름을 익힐 수 있었고, 더 나아가 WebSocket도 다뤄보고 싶다는 목표가 생겼다. 무엇보다 힘든 순간에도 웃으며 함께한 팀원들에게 감사한 마음이 크다.

---

### 🙋‍♀️ 팀원 B - @githubID_A

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

### 🙋‍♀️ 팀원 C - @githubID_A

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

### 🙋‍♀️ 팀원 D - @githubID_A

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

### 🙋‍♀️ 한석현 - @Hancoal

- **이번 프로젝트에서 맡은 역할**
  - 프론트엔드 UI 전체 설계 및 구현 (Vue3 + Vuetify)
  - Naver Maps API와 장소 등록 기능 개발
  - 사진 업로드 및 썸네일 이미지 관리
  - 게시글/일기 통합 등록 및 MyBatis 기반 백엔드 연동

- **잘한 점**
  - 사용자의 입력 흐름을 고려해 직관적인 UX를 구성함
  - 지도 기반 위치 등록 기능에서 장소 검색과 커스텀 마커를 완성도 높게 구현
  - 오류 발생 시 빠르게 디버깅하고 사용자 친화적인 에러 핸들링을 일부 적용함

- **아쉬운 점**
  - Axios 에러 핸들링이 일관되지 않아, 에러 메시지를 사용자에게 명확히 전달하지 못한 부분이 있었음
  - 컴포넌트 재사용성을 고려한 설계가 부족해 유지보수가 어려운 구조가 일부 존재함
  - 초반 요구사항 정리에 시간을 충분히 들이지 못해 일부 흐름이 중간에 바뀌었음

- **배운 점**
  - Pinia의 `store` 구조 설계 및 활용법
  - Composition API에서의 코드 분리 및 재사용 방식
  - Spring Boot + MyBatis로 multipart/form-data 처리하는 백엔드 로직
  - JWT 인증 처리 흐름과 토큰 만료에 따른 갱신 방식

- **다음 프로젝트에 적용하고 싶은 점**
  - 기획 단계에서 Figma 등으로 와이어프레임을 먼저 정리하고 공유할 것
  - Axios interceptor를 활용해 공통 에러 핸들링 구조 확립
  - 폴더 구조를 도메인 중심으로 재정비하여 유지보수 용이성 확보
  - 공통 UI 컴포넌트는 초기에 별도 폴더로 분리하여 재사용성을 높이기
---

### 🙋‍♀️ 팀원 F - @githubID_A

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
