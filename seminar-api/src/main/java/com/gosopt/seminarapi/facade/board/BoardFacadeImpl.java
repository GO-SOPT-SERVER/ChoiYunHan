package com.gosopt.seminarapi.facade.board;

import com.gosopt.seminarapi.facade.board.vo.BoardCreateVO;
import com.gosopt.seminarapi.facade.image.ImageService;
import com.gosopt.seminarapi.facade.member.MemberService;
import com.gosopt.seminarapi.facade.s3.S3ImageVO;
import com.gosopt.seminarapi.facade.s3.S3Service;
import com.gosopt.seminarapi.presentation.board.request.BoardCreateRequest;
import com.gosopt.seminardomain.domain.board.BoardEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BoardFacadeImpl implements BoardFacade{

    private final BoardService boardService;

    private final S3Service s3Service;

    private final ImageService imageService;

    private final MemberService memberService;

    @Override
    @Transactional
    public void createBoard(BoardCreateRequest request, Long memberId) {
        S3ImageVO vo = s3Service.uploadImage(request.getFile());
        BoardEntity board = boardService.save(BoardCreateVO.from(request.getTitle(), request.getContent()),  memberService.getMemberById(memberId));
        imageService.save(vo.getFileOriginalName(), vo.getImageUrl(), board);
    }
}
