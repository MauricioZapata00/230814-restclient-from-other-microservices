package com.dummy.web.client.demo.mongo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "songs_document")
public class Song {
    @Id
    private String id;
    private String name;
    private String composer;
    private Long durationInMilliseconds;
}
