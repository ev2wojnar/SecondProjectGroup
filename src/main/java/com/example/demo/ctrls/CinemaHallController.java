package com.example.demo.ctrls;

import com.example.demo.model.CinemaHall;
import com.example.demo.services.CinemaHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CinemaHallController {

    @Autowired
    private CinemaHallService cinemaHallService;

    @GetMapping("/cinemas/cinemaHall/{cinemaHallId}")
    public CinemaHall findCinemaHall(@PathVariable long cinemaHallId){
        return cinemaHallService.findCinemaHallById(cinemaHallId);

    }
}
