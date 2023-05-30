package com.gosopt.seminardomain.domain.member;

import com.gosopt.seminardomain.domain.member.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberJpaRepository extends JpaRepository<MemberEntity, Long> {
}
