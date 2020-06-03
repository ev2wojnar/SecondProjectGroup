package com.example.demo.ctrls;

import com.example.demo.model.Cinema;
import com.example.demo.services.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cinemas")
public class CinemaController {

    @Autowired
    private CinemaService cinemaService;



    @GetMapping("/{cinemaId}")
    public Cinema findCinema(@PathVariable long cinemaId){
        return cinemaService.findCinemaById(cinemaId);
    }

    @GetMapping()
    public Iterable<Cinema> findCinema(){
        return cinemaService.findAllCinemas();
    }

    @PostMapping()
    public Cinema createCinema(@RequestBody Cinema cinema){
        return cinemaService.saveCinema(cinema);
    }

    @PutMapping()
    public Cinema updateCinema(@RequestBody Cinema cinema){
        return cinemaService.saveCinema(cinema);
    }
    @DeleteMapping("/{cinemaId}")
    public void deleteCinema(@PathVariable long cinemaId){
        cinemaService.deleteCinemaById(cinemaId);
    }






}
