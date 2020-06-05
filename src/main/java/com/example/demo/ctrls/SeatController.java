package com.example.demo.ctrls;

import com.example.demo.model.Seat;
import com.example.demo.services.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/seats")
public class SeatController {

    @Autowired
    private SeatService seatService;

    @GetMapping("/{seatId")
    public Seat findSeat(@PathVariable long seatId){
        return seatService.findSeatById(seatId);
    }

    @GetMapping("/seats")
    public String showAllSeats(@RequestParam(name = "choosingPlace", required = false, defaultValue = "opieCOTyRobisz")String name, Model model){
        return "choosingPlace";
    }
}
