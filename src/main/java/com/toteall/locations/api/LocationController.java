package com.toteall.locations.api;

import com.toteall.locations.Properties;
import com.toteall.locations.dto.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@RestController
public class LocationController {

    private final Properties properties;
    private final RestTemplate restTemplate;

    @GetMapping("locations/{postCode}")
    public Response locations(@PathVariable("postCode") String postCode) {
        return restTemplate.exchange(properties.getLocation().getApi() + postCode, HttpMethod.GET, HttpEntity.EMPTY, Response.class).getBody();
    }

    @GetMapping("locations/distance")
    public double calculateDistance(@RequestParam("sourceLat") double sourceLat,
                                    @RequestParam("sourceLon") double sourceLon,
                                    @RequestParam("destinationLat") double destinationLat,
                                    @RequestParam("destinationLon") double destinationLon) {
        final int EARTH_RADIUS_KM = 6371;

        double dLat = Math.toRadians(destinationLat - sourceLat);
        double dLon = Math.toRadians(destinationLon - sourceLon);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(Math.toRadians(sourceLat)) * Math.cos(Math.toRadians(destinationLat))
                * Math.sin(dLon / 2) * Math.sin(dLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return Math.round(EARTH_RADIUS_KM * c * 100.0) / 100.0;
    }
}
