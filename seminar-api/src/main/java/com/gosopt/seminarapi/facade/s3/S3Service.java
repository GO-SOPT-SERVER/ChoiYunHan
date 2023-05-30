package com.gosopt.seminarapi.facade.s3;

import com.amazonaws.services.s3.model.ObjectMetadata;
import com.gosopt.seminarapi.infrastructure.aws.S3Util;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
@RequiredArgsConstructor
public class S3Service {

    private final S3Util s3Util;
    private static final String UPLOAD_FOLDER_NAME = "images/";

    public S3ImageVO uploadImage(MultipartFile file) {
        String keyName = UPLOAD_FOLDER_NAME + getFoldername() + getUUIDFileName();
        try {
            s3Util.putObject(keyName, file.getInputStream(), getObjectMetadata(file));
        } catch (IOException e) {
            throw new RuntimeException("image upload 실패");
        }
        return S3ImageVO.of(s3Util.getObjectUrl(keyName),file.getOriginalFilename());
    }

    private String getFoldername() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        Date date = new Date();
        return sdf.format(date).replace("-", "/");
    }
    private String getUUIDFileName() {
        return UUID.randomUUID().toString();
    }
    private ObjectMetadata getObjectMetadata(MultipartFile multipartFile) {
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setContentType(multipartFile.getContentType());
        objectMetadata.setContentLength(multipartFile.getSize());
        return objectMetadata;
    }
}
