package com.gosopt.seminarapi.facade.board;

import com.gosopt.seminarapi.facade.board.vo.BoardCreateVO;
import com.gosopt.seminardomain.domain.board.BoardEntity;
import com.gosopt.seminardomain.domain.board.BoardJpaRepository;
import com.gosopt.seminardomain.domain.member.MemberEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Service
@Transactional
@RequiredArgsConstructor
public class BoardService {

    private final BoardJpaRepository boardJpaRepository;

    public BoardEntity getBoardById(Long boardId) {
        return boardJpaRepository.findById(boardId).orElseThrow(
                () -> new EntityNotFoundException("board entity가 존재하지 않습니다.")
        );
    }

    public BoardEntity save(BoardCreateVO vo, MemberEntity member) {
        return boardJpaRepository.save(
                BoardEntity.builder()
                        .title(vo.getTitle())
                        .content(vo.getContent())
                        .member(member)
                        .build()
        );
    }
}
