package com.gosopt.seminardomain.global.common.exception.common;

import org.springframework.http.HttpStatus;

public class UnAuthorizedException extends BaseException {

    public UnAuthorizedException() {
        super(HttpStatus.UNAUTHORIZED);
    }

    public UnAuthorizedException(String message) {
        super(HttpStatus.UNAUTHORIZED, message);
    }
}
