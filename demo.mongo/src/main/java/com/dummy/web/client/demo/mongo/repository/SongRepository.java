package com.dummy.web.client.demo.mongo.repository;

import com.dummy.web.client.demo.mongo.model.Song;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends ReactiveMongoRepository<Song, String> {
}
