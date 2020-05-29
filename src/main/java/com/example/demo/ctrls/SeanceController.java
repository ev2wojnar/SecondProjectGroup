package com.example.demo.ctrls;

import com.example.demo.model.Seance;
import com.example.demo.services.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeanceController {

    @Autowired
    private SeanceService seanceService;

    @RequestMapping(value = "/cinemas/seance/{seanceId}", method= RequestMethod.GET)
    public Seance findSeance(@PathVariable long seanceId){
        return seanceService.findSeanceById(seanceId);
    }
}
