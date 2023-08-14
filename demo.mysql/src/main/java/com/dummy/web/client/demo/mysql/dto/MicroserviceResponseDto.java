package com.dummy.web.client.demo.mysql.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MicroserviceResponseDto {
    private String id;
    private String name;
    private String composer;
    private Long durationInMilliseconds;
}
