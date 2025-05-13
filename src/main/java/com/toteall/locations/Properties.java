package com.toteall.locations;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ConfigurationProperties(prefix = "application")
public class Properties {

    private Location location;

    @Builder
    @Data
    public static class Location {
        String api;
    }
}
