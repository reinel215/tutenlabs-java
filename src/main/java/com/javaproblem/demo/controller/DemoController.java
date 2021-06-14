package com.javaproblem.demo.controller;


import com.javaproblem.demo.Requests.TimeRequest;
import com.javaproblem.demo.Responses.TimeResponse;
import com.javaproblem.demo.models.Time;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

@RestController
@RequestMapping("/")
public class DemoController {

    /*here we comunicate with the internet*/

    @PostMapping("/time")
    public TimeResponse obtenerPersona(@RequestBody TimeRequest time){


        LocalTime givenHour = LocalTime.parse(time.getTime());

        int hour = givenHour.getHour();
        int minute = givenHour.getMinute();
        int second = givenHour.getSecond();

        OffsetDateTime newHour = Instant.now()
                .atOffset(ZoneOffset.ofHours(time.getZone() ) )
                .withHour(hour)
                .withMinute(minute)
                .withSecond(second)
                .withNano(0);

        TimeResponse response = new TimeResponse( new Time( newHour.toString() ) );

        return response;
    }

}
