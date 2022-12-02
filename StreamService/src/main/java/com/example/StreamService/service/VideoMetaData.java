package com.example.StreamService.service;

import java.util.Objects;

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

    public VideoMetaData(int id, String videoName, String videoDescription, String url, String publisher) {
        this.id = id;
        this.videoName = videoName;
        this.videoDescription = videoDescription;
        this.url = url;
        this.publisher = publisher;
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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoMetaData that = (VideoMetaData) o;
        return id == that.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
