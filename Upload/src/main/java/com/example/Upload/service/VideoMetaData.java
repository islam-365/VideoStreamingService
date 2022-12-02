package com.example.Upload.service;

import org.springframework.security.core.context.SecurityContextHolder;

public class VideoMetaData {

    private int id;
    private String videoName;
    private String videoDescription;
    private String url;
    private String publisher;

    public VideoMetaData() {
    }

    public VideoMetaData(int id) {
        this.id = id;
    }



    public VideoMetaData(String videoName, String videoDescription) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();

        this.id = 0;
        this.videoName = videoName;
        this.videoDescription = videoDescription;
        this.url = "https://atypon-video-islam.s3.eu-west-2.amazonaws.com/" + videoName.replace(' ','+');
        this.publisher = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoDescription() {
        return videoDescription;
    }

    public void setVideoDescription(String videoDescription) {
        this.videoDescription = videoDescription;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
