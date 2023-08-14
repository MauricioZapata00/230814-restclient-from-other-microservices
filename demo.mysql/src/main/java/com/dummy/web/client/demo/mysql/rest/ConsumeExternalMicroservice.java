package com.dummy.web.client.demo.mysql.rest;

import com.dummy.web.client.demo.mysql.dto.MicroserviceResponseDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ConsumeExternalMicroservice {

    public Flux<MicroserviceResponseDto[]> getResponseFromUrl(String url){
        WebClient client = WebClient.create(url);
        return client
                .get()
                .retrieve()
                .bodyToMono(MicroserviceResponseDto[].class)
                .flux();
    }
}
