package com.seminar.week2.api.user.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RegisterRequestDto {

    private String name;
    private String contact;
    private int age;

}
