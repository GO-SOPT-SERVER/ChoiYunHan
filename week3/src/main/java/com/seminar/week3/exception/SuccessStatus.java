package com.seminar.week3.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum SuccessStatus {

    SIGNUP_SUCCESS(HttpStatus.CREATED, "회원가입에 성공하였습니다."),
    ;

    private final HttpStatus httpStatus;
    private final String message;


}
