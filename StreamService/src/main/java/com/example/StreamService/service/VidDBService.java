package com.example.StreamService.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class VidDBService {
    private final WebClient webClient;

    @Autowired
    public VidDBService(WebClient.Builder webClient) {
        this.webClient = webClient.baseUrl("http://database:8090").build();
    }

    public List<VideoMetaData> getVidToDB() {
        return webClient.get()
                .uri("/")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<VideoMetaData>>() {
                })
                .block();
    }

}
