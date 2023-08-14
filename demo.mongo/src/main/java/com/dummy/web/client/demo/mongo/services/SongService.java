package com.dummy.web.client.demo.mongo.services;

import com.dummy.web.client.demo.mongo.model.Song;
import com.dummy.web.client.demo.mongo.repository.SongRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class SongService {

    private final SongRepository songRepository;

    public Flux<Song> getAllSongs(){
        return this.songRepository.findAll();
    }
}
