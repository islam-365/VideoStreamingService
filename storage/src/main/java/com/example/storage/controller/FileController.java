package com.example.storage.controller;

import com.example.storage.utility.AWSS3Utility;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileController {

    @PostMapping("/")
    public String uploadToS3(@RequestBody MultipartFile file, @RequestParam("name") String name) {
        try {
            AWSS3Utility.uploadFile(name, file.getInputStream());
            return "success";
        } catch (Exception e) {
            return "failed";
        }
    }
}
