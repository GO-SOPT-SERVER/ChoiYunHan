package com.gosopt.seminarapi.facade.auth;

import com.gosopt.seminarapi.presentation.auth.request.LoginRequest;
import com.gosopt.seminarapi.presentation.auth.response.LoginResponse;
import org.springframework.stereotype.Service;

@Service
public interface AuthFacade {

    LoginResponse login(LoginRequest request);
}
