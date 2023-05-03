package com.seminar.week3.dto.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class MemberResponseDto {

    private Long userId;
    private String nickname;

    public static MemberResponseDto of(Long userId, String nickname) {
        return new MemberResponseDto(userId, nickname);
    }
}
