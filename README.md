# be14-4th-Ideality-MyLocalDiary

| 이혜영 | 정민선 | 한석현 | 정동한 | 권민수 | 장시원 |
|--------|--------|--------|--------|--------|--------|
| <div align="center"><img src="https://github.com/user-attachments/assets/f589b013-0193-4775-a908-76305427112c" width="150"><br>ISTP</div> | <div align="center"><img src="https://github.com/user-attachments/assets/2a9c8c91-0afa-4fa0-b10c-f4ad94bd9a09" width="150"><br>INFJ</div> | <div align="center"><img src="https://github.com/user-attachments/assets/c17d7bc2-4a71-4323-8fb4-7fb38f518daa" width="150"><br>ENFP</div> | <div align="center"><img src="https://github.com/user-attachments/assets/05d7d9de-3c77-4243-a553-fcfb24abc6e9" width="150"><br>ISTP</div> | <div align="center"><img src="https://github.com/user-attachments/assets/b695d9dc-9885-4731-9c6a-6dde1add62f9" width="150"><br>ISTP</div> | <div align="center"><img src="https://item.kakaocdn.net/do/eda86b27d953e0a1bc89848fff989e65f604e7b0e6900f9ac53a43965300eb9a" width="150"><br>INTJ</div> |

<br>


## 📚 목차


#### [📌 프로젝트 개요](https://github.com/minsun24/My-Local-Diary/wiki/0.-%F0%9F%90%B1-My-Local-Diary) <br>
#### [🧠 기획 의도](https://github.com/minsun24/My-Local-Diary/wiki/1.-%F0%9F%A7%A0-%EA%B8%B0%ED%9A%8D-%EC%9D%98%EB%8F%84)  <br>
#### [🚀 서비스 주요 기능](https://github.com/minsun24/My-Local-Diary/wiki/2.-%F0%9F%9A%80-%EC%84%9C%EB%B9%84%EC%8A%A4-%EC%A3%BC%EC%9A%94-%EA%B8%B0%EB%8A%A5)  <br>
#### [🛠 기술 스택](https://github.com/minsun24/My-Local-Diary/wiki/3.-%F0%9F%9B%A0-%EA%B8%B0%EC%88%A0-%EC%8A%A4%ED%83%9D) <br>
#### [🌐 외부 API 및 주요 구현 기술](https://github.com/minsun24/My-Local-Diary/wiki/4.-%F0%9F%8C%90-%EC%99%B8%EB%B6%80-API-%EB%B0%8F-%EC%A3%BC%EC%9A%94-%EA%B5%AC%ED%98%84-%EA%B8%B0%EC%88%A0) <br>
#### [🕹️ 시스템 아키텍쳐](https://github.com/minsun24/My-Local-Diary/wiki/5.-%F0%9F%95%B9%EF%B8%8F-%EC%8B%9C%EC%8A%A4%ED%85%9C-%EC%95%84%ED%82%A4%ED%85%8D%EC%B3%90)  <br>
#### [🔄 ci / cd](https://github.com/minsun24/My-Local-Diary/wiki/6.-%F0%9F%94%84-CI---CD) <br>
#### [🧾 jenkins script](https://github.com/minsun24/My-Local-Diary/wiki/7.-%F0%9F%A7%BE-Jenkins-Script)  <br>
#### [🧱 ddd](https://github.com/minsun24/My-Local-Diary/wiki/8.-%F0%9F%A7%B1-DDD)  <br>
- [🧩 도메인 도출](#-도메인-도출)  <br>
- [📦 bounded context](#-bounded-context)  <br>
- [🔗 연관 관계](#-연관-관계)  <br>
- [🗂 erd](#-erd)  <br>




<br>

## 📝 [회고]

### 🙋‍♀️ 정민선 - @minsun24

- **이번 프로젝트에서 맡은 역할**
  - Figma를 활용한 전체 UI/UX 기획 및 설계
  - Naver Cloud Maps API를 활용해 지도 렌더링 UI 구
  - geocoder 서브모듈을 사용한 도로명 주소 → 좌표 검색 기능 개발 
  - Naver Search API를 백엔드와 연동해 키워드 기반 장소 검색 기능 구현
  - Vue + Pinia를 이용한 회원 상태 및 UI 상태 전역 관리
  - 사용자 라우팅 구조 설계 및 로그인/로그아웃 흐름 구현
  - AWS S3를 이용한 이미지 업로드 설정 및 환경 구성
  - 관리자 신고 및 규제 처리 기능 구현


- **잘한 점**
  - 팀 내 API 명세 및 응답 구조를 일관되게 유지하여 개발 협업 효율 향상
  - GlobalExceptionHandler를 활용한 예외 처리 체계화
  - 전역 상태(Pinia)를 효율적으로 활용하여 컴포넌트 간 상태 공유 및 UI 흐름 안정화


- **아쉬운 점**
  - 설계했던 스타일 세부 요소들이 일부 미완성된 점이 아쉬웠음
  - PR(풀 리퀘스트) 내용을 더 꼼꼼하게 확인했더라면 코드 품질이 높아졌을 것
  - Axios 에러 핸들링에서 예외 케이스(권한 없음, 서버 오류 등)를 더 세분화했으면 좋았을 것
  - 댓글, 좋아요 등 일부 기능을 미구현해서 아쉬웠음

  
- **배운 점**
  - Pinia를 활용한 상태 관리 설계 패턴
  -  AWS S3 환경 구성 및 이미지 업로드 흐름
  -  지도 기반 API 설계 및 프론트–백 연동 방식
  -  JWT 인증 처리 흐름과 토큰 만료에 따른 갱신 방식


- **다음 프로젝트에 적용하고 싶은 점**
  - 서비스 기획서/기능 정의서를 더 명확히 작성하고 시작하기
  - 기능 구현에 앞서 사용자 흐름과 주요 시나리오를 먼저 정의하고, 이에 따라 기능의 우선순위를 체계적으로 설정해 개발 진행하기
  - 정기적인 코드 리뷰를 습관화하여 코드 품질을 높이고 오류를 조기에 발견하기
  - 작업 분담 시 담당 도메인과 마감 기한을 명확히 정의하고 팀원 간 공유 체계 마련하기
 

---
