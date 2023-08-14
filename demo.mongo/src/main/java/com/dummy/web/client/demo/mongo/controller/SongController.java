package com.dummy.web.client.demo.mongo.controller;

import com.dummy.web.client.demo.mongo.model.Song;
import com.dummy.web.client.demo.mongo.services.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/song")
@RequiredArgsConstructor
public class SongController {
    private final SongService songService;

    @GetMapping("/all")
    public Flux<Song> listAllSongs(){
        return this.songService.getAllSongs();
    }
}
