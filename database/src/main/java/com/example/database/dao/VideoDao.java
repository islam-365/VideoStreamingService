package com.example.database.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class VideoDao implements IVideoDao{

    private final JdbcTemplate jdbcTemplate;

    public VideoDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<VideoMetaData> getVideosMetaData() {
        return jdbcTemplate.query("select * from Videos", new RowMapper<VideoMetaData>() {
            @Override
            public VideoMetaData mapRow(ResultSet rs, int rowNum) throws SQLException {
                VideoMetaData vidMetaData = new VideoMetaData();
                vidMetaData.setId(rs.getInt("Id"));
                vidMetaData.setVideoName(rs.getString("VidName"));
                vidMetaData.setVideoDescription(rs.getString("VidDes"));
                vidMetaData.setUrl(rs.getString("VidUrl"));
                vidMetaData.setPublisher(rs.getString("Publisher"));

                return vidMetaData;
            }
        });

    }

    @Override
    public int addVideo(VideoMetaData vidMetaData) {
        return jdbcTemplate.update("INSERT INTO Videos(VidName,VidDes,VidUrl,Publisher) VALUES(?,?,?,?)",
                vidMetaData.getVideoName(),
                vidMetaData.getVideoDescription(),
                vidMetaData.getUrl(),
                vidMetaData.getPublisher()
        );
    }
}
