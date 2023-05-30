package com.gosopt.seminardomain.domain.member;

import com.gosopt.seminardomain.global.common.domain.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "member")
@Getter
@NoArgsConstructor()
public class MemberEntity extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "username", unique = true)
    private String username;

    private String password;
}
