package com.leesang.mylocaldiary.member.jpa.service;

import com.leesang.mylocaldiary.common.response.CommonResponseVO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface MemberService {
    ResponseEntity<CommonResponseVO<?>> reissueAccessToken(String request);

    boolean isNicknameAvaliable(String nickname);

    String updateProfile(Long memberId, String nickname, String profileMusic, String isPublic, String bio, MultipartFile file);
    void logout(String request);
}
