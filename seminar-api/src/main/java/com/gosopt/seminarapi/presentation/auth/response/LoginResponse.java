package com.gosopt.seminarapi.presentation.auth.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor(staticName = "of")
public class LoginResponse {
    private String accessToken;
    private String refreshToken;
}
