package com.seminar.week3.service;

import com.seminar.week3.domain.Member;
import com.seminar.week3.dto.member.MemberRequestDto;
import com.seminar.week3.dto.member.MemberResponseDto;
import com.seminar.week3.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public MemberResponseDto create(MemberRequestDto memberRequestDto) {
        Member member = Member.builder()
                        .id(memberRequestDto.getUserId())
                        .nickname(memberRequestDto.getNickname())
                        .email(memberRequestDto.getEmail())
                        .password(memberRequestDto.getPassword())
                        .build();

        memberRepository.save(member);

        return MemberResponseDto.of(member.getId(), member.getNickname());
    }
}
