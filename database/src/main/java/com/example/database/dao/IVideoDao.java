package com.example.database.dao;

import java.util.List;

public interface IVideoDao {
    public List<VideoMetaData> getVideosMetaData();
    public int addVideo(VideoMetaData vidMetaData);
}
