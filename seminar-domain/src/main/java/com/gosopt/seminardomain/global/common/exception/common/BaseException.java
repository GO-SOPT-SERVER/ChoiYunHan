package com.gosopt.seminardomain.global.common.exception.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class BaseException extends RuntimeException {
    private HttpStatus status;
    private String message;

    public BaseException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public BaseException(HttpStatus status) {
        super();
        this.status = status;
    }

    public BaseException(String message, HttpStatus status) {
        super(message);
        this.status = status;
        this.message = message;
    }
}
