package com.seminar.week3.dto.member;

import lombok.Data;

@Data
public class MemberRequestDto {

    private Long userId;
    private String nickname;
    private String email;
    private String password;
}
