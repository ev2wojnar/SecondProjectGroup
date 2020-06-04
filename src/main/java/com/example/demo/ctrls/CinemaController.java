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
    @GetMapping("/cinemaRepertoire")
    public String showAllMovies(@RequestParam(name = "allMovies", required = false)String name, Model model){
        return "cinemaRepertoire";
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
//    @GetMapping("/priceList")
//    public String priceList(@RequestParam(name="price", required=false, defaultValue="0")String name, Model model){
//        //model.addAttribute("price", model);
//        return "priceList";
//    }
//    @GetMapping("/index")
//    public String showMain(@RequestParam(name="index2", required=false, defaultValue="1")String name, Model model){
//        return "index";
//    }
//    @GetMapping("/happyHours")
//    public String happyHours(@RequestParam(name="happyHours", required=false, defaultValue="gfggfg")String name, Model model){
//        return "sale";
//    }
    @GetMapping("/{}/{cinemaId}")
    public String movieDetails(@PathVariable long cinemaId, Model model) {
        Cinema cinema = cinemaService.findCinemaById(cinemaId);
        model.addAttribute( cinema);
        return "movieScreen";
    }






}
