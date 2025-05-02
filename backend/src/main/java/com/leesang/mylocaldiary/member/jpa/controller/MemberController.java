package com.leesang.mylocaldiary.member.jpa.controller;

import com.leesang.mylocaldiary.common.response.CommonResponseVO;
import com.leesang.mylocaldiary.member.jpa.service.MemberService;
import com.leesang.mylocaldiary.security.jwt.JwtUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@RequestMapping("/api/member")
public class MemberController {

    private final MemberService memberService;
    private final JwtUtil jwtUtil;

    @Autowired
    public MemberController(MemberService memberService, JwtUtil jwtUtil) {
        this.memberService = memberService;
        this.jwtUtil = jwtUtil;
    }

    @GetMapping("/testJwtFilter")
    public String testJwtFilter() {
        return "testJwtFilter";
    }

    // 재발급
    @PostMapping("/reissue")
    public ResponseEntity<CommonResponseVO<?>> reissueToken(HttpServletRequest request) {
        String refreshToken = request.getHeader("refresh-token");
        return memberService.reissueAccessToken(refreshToken);
    }

    @PostMapping("/logout")
    public ResponseEntity<CommonResponseVO<?>> logout(HttpServletRequest request) {
        String accessToken = jwtUtil.extractAccessToken(request); // Authorization 헤더에서 추출
        memberService.logout(accessToken);

        return ResponseEntity.ok(CommonResponseVO.builder()
                .status(200)
                .message("로그아웃이 완료되었습니다.")
                .data(null)
                .build());
    }

    @GetMapping("/check-nickname")
    public ResponseEntity<CommonResponseVO<?>> checkNickname(@RequestParam("nickname") String nickname) {
        boolean available = memberService.isNicknameAvaliable(nickname);
        return ResponseEntity.ok(
                CommonResponseVO.builder()
                        .status(200)
                        .message("사용 가능 여부 확인 완료")
                        .data(Map.of("available", available))
                        .build()
        );
    }

    @PatchMapping(value = "/profile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> updateProfile(
            @RequestPart("nickname") String nickname,
            @RequestPart("profile_music") String profileMusic,
            @RequestPart("is_public") String isPublic,
            @RequestPart("bio") String bio,
            @RequestPart(value = "file", required = false) MultipartFile file,
            HttpServletRequest request
    ) {

        String token = jwtUtil.extractAccessToken(request);
        Long memberId = jwtUtil.getUserIdFromToken(token);
        String imageUrl = memberService.updateProfile(memberId, nickname, profileMusic, isPublic, bio, file);
        return ResponseEntity.ok(
                CommonResponseVO.builder()
                        .status(200)
                        .message("프로필이 성공적으로 수정되었습니다.")
                        .data(imageUrl) // S3에 업로드한 이미지 URL
                        .build()
        );
    }
}
