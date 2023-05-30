package com.gosopt.seminarapi.facade.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberFacadeImpl implements MemberFacade{

    private final MemberService memberService;
}
