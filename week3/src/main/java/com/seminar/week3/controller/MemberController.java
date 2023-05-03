package com.seminar.week3.controller;


import com.seminar.week3.common.ApiResponseDto;
import com.seminar.week3.dto.member.MemberRequestDto;
import com.seminar.week3.dto.member.MemberResponseDto;
import com.seminar.week3.exception.SuccessStatus;
import com.seminar.week3.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponseDto<MemberResponseDto> signup(@RequestBody @Valid MemberRequestDto dto){
        return ApiResponseDto.success(SuccessStatus.SIGNUP_SUCCESS, memberService.create(dto));
    }


}
