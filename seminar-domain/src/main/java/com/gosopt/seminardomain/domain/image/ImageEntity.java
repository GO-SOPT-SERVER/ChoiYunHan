package com.gosopt.seminardomain.domain.image;

import com.gosopt.seminardomain.global.common.domain.BaseTimeEntity;
import com.gosopt.seminardomain.domain.board.BoardEntity;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name = "image")
public class ImageEntity extends BaseTimeEntity {

    @Id @GeneratedValue
    private Long id;

    private String imageUrl;

    private String originalName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn()
    private BoardEntity boardEntity;

    @Builder
    public ImageEntity(String imageUrl, String originalName, BoardEntity boardEntity) {
        this.imageUrl = imageUrl;
        this.originalName = originalName;
        this.boardEntity = boardEntity;
    }
}
