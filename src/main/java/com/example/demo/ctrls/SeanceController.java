package com.example.demo.ctrls;

import com.example.demo.model.Seance;
import com.example.demo.services.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cinemas/seance/")
public class SeanceController {

    @Autowired
    private SeanceService seanceService;

    @RequestMapping(value = "{seanceId}", method= RequestMethod.GET)
    public Seance findSeance(@PathVariable long seanceId){
        return seanceService.findSeanceById(seanceId);
    }
    @GetMapping("byMovieId/{movieId}")
    public Iterable<Seance> showSeanceByMovieId(@PathVariable long movieId){
        return seanceService.findByMovieId(movieId);
    }
}
