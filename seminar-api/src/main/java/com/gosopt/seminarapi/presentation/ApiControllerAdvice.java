package com.gosopt.seminarapi.presentation;

import com.gosopt.seminardomain.global.common.exception.common.UnAuthorizedException;
import com.gosopt.seminardomain.global.common.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiControllerAdvice {

    @ExceptionHandler(UnAuthorizedException.class)
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse<?> handleUnAuthorizedException(UnAuthorizedException e) {
        return ApiResponse.failure(e.getStatus(), e.getMessage());
    }
}
