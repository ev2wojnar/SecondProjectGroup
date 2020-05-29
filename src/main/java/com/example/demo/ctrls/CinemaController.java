package com.example.demo.ctrls;

import com.example.demo.model.Cinema;
import com.example.demo.services.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CinemaController {

    @Autowired
    private CinemaService cinemaService;



    @GetMapping("/cinemas/{cinemaId}")
    public Cinema findCinema(@PathVariable long cinemaId){
        return cinemaService.findCinemaById(cinemaId);
    }

    @GetMapping("/cinemas")
    public Iterable<Cinema> findCinema(){
        return cinemaService.findAllCinemas();
    }

    @PostMapping("/cinemas")
    public Cinema createCinema(@RequestBody Cinema cinema){
        return cinemaService.saveCinema(cinema);
    }

    @PutMapping("/cinemas")
    public Cinema updateCinema(@RequestBody Cinema cinema){
        return cinemaService.saveCinema(cinema);
    }
    @DeleteMapping("/cinemas/{cinemaId}")
    public void deleteCinema(@PathVariable long cinemaId){
        cinemaService.deleteCinemaById(cinemaId);
    }
}
