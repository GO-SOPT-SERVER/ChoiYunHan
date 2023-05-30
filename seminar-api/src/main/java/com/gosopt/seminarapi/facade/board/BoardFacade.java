package com.gosopt.seminarapi.facade.board;

import com.gosopt.seminarapi.presentation.board.request.BoardCreateRequest;

public interface BoardFacade {

    void createBoard(BoardCreateRequest request, Long memberId);
}
