package com.seminar.week2.api.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
public class RegisterResponseDto {

    private String name;
    private String contact;
    private int age;
}
