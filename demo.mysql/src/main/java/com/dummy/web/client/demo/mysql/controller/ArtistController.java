package com.dummy.web.client.demo.mysql.controller;

import com.dummy.web.client.demo.mysql.dto.MicroserviceResponseDto;
import com.dummy.web.client.demo.mysql.rest.ConsumeExternalMicroservice;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@RestController
@RequestMapping("/artist")
public class ArtistController {

    private final ConsumeExternalMicroservice consumeExternalMicroservice;
    @GetMapping("/other-endpoint")
    public Flux<MicroserviceResponseDto[]> showAllArtists(){
        return this.consumeExternalMicroservice.getResponseFromUrl("http://localhost:8083/song/all");
    }
}
