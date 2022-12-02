package com.example.database.controller;

import com.example.database.dao.IVideoDao;
import com.example.database.dao.VideoMetaData;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VideoMetaDataController {

    private final IVideoDao videoDao;

    public VideoMetaDataController(IVideoDao videoDao) {
        this.videoDao = videoDao;
    }

    @GetMapping("/")
    public List<VideoMetaData> getVideos() {
        return videoDao.getVideosMetaData();
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Boolean addVid(@RequestBody VideoMetaData vidMetaData) {
        return videoDao.addVideo(vidMetaData) == 1;
    }
}
