package com.gosopt.seminarapi.presentation.board;

import com.gosopt.seminarapi.facade.board.BoardFacade;
import com.gosopt.seminarapi.presentation.board.request.BoardCreateRequest;
import com.gosopt.seminardomain.global.common.resolver.UserId;
import com.gosopt.seminardomain.global.common.response.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardFacade boardFacade;

    @PostMapping
    public ApiResponse createBoard(
            @RequestBody BoardCreateRequest request,
            @UserId Long memberId
            ) {
        boardFacade.createBoard(request, memberId);
        return ApiResponse.success(HttpStatus.CREATED, "게시글 생성 성공");
    }
}
