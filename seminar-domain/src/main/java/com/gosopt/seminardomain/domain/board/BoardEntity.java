package com.gosopt.seminardomain.domain.board;

import com.gosopt.seminardomain.global.common.domain.BaseTimeEntity;
import com.gosopt.seminardomain.domain.member.MemberEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.*;

@Entity
@Table(name = "board")
@Getter
@NoArgsConstructor(access = PROTECTED)
public class BoardEntity extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String title;

    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private MemberEntity member;

    @Builder
    public BoardEntity(Long id, String title, String content, MemberEntity member) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.member = member;
    }
}
