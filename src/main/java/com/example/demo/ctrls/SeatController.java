package com.example.demo.ctrls;

import com.example.demo.model.Seat;
import com.example.demo.services.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeatController {

    @Autowired
    private SeatService seatService;

    @RequestMapping(value = "/cinemas/seats/{seatId}", method= RequestMethod.GET)
    public Seat findSeat(@PathVariable long seatId){
        return seatService.findSeatById(seatId);
    }
}
