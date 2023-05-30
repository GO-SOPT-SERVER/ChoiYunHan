package com.gosopt.seminardomain.domain.board;

import com.gosopt.seminardomain.domain.board.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardJpaRepository extends JpaRepository<BoardEntity, Long> {
}
