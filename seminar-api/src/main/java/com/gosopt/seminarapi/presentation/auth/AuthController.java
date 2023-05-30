package com.gosopt.seminarapi.presentation.auth;

import com.gosopt.seminarapi.facade.auth.AuthFacade;
import com.gosopt.seminarapi.presentation.auth.request.LoginRequest;
import com.gosopt.seminarapi.presentation.auth.response.LoginResponse;
import com.gosopt.seminardomain.global.common.response.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final AuthFacade authFacade;

    @PostMapping("/login")
    public ApiResponse<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        return ApiResponse.success(HttpStatus.OK, "로그인 성공", authFacade.login(loginRequest));
    }
}
