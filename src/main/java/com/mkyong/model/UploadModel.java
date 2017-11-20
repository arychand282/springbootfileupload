package com.mkyong.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class UploadModel {

    private String extraField;

    private MultipartFile[] files;

}
