package com.gosopt.seminarapi.facade.image;

import com.gosopt.seminardomain.domain.board.BoardEntity;
import com.gosopt.seminardomain.domain.image.ImageEntity;
import com.gosopt.seminardomain.domain.image.ImageJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ImageService {

    private final ImageJpaRepository imageJpaRepository;

    @Transactional
    public ImageEntity save(String imageUrl, String fileOriginalName, BoardEntity board) {
        return ImageEntity.builder()
                .imageUrl(imageUrl)
                .originalName(fileOriginalName)
                .boardEntity(board)
                .build();
    }
}
