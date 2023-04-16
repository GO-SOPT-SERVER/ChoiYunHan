package com.seminar.week2.api.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UpdateRequestDto {
    private String name;
    private String contact;
    private int age;

}
