package com.gosopt.seminardomain.global.common.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public abstract class ApiResponse<T> {
    private final int status;
    private final String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public static ApiResponse success(HttpStatus status, String message) {
        return new ApiResponse<>(status.value(), message) {
        };
    }

    public static <T> ApiResponse<T> success(HttpStatus status, String message, T data) {
        return new ApiResponse<>(status.value(), message, data) {
        };
    }

    public static ApiResponse failure(HttpStatus status, String message) {
        return new ApiResponse<>(status.value(), message) {
        };
    }
}
