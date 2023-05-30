package com.gosopt.seminarapi.facade.board.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(staticName = "from")
@Getter
public class BoardCreateVO {
    private String title;
    private String content;
}
