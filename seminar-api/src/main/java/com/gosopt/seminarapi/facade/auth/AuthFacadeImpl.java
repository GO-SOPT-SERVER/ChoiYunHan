package com.gosopt.seminarapi.facade.auth;

import com.gosopt.seminarapi.facade.member.MemberService;
import com.gosopt.seminarapi.presentation.auth.request.LoginRequest;
import com.gosopt.seminarapi.presentation.auth.response.LoginResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
public class AuthFacadeImpl implements AuthFacade{

    private final AuthService authService;
    private final MemberService memberService;

    @Override
    public LoginResponse login(LoginRequest request) {
        return null;
    }
}
