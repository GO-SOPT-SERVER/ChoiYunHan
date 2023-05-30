package com.gosopt.seminarapi.presentation.board.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@AllArgsConstructor(staticName = "of")
public class BoardCreateRequest {
    private MultipartFile file;
    private String title;
    private String content;
}
