package com.gosopt.seminarapi.facade.member;

import com.gosopt.seminardomain.domain.member.MemberEntity;
import com.gosopt.seminardomain.domain.member.MemberJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

    private final MemberJpaRepository memberJpaRepository;

    public MemberEntity getMemberById(Long memberId) {
        return memberJpaRepository.findById(memberId).orElseThrow(
                () -> new EntityNotFoundException("Member Entity가 존재하지 않습니다.")
        );
    }
}
