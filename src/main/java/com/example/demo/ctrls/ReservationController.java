package com.example.demo.ctrls;

import com.example.demo.model.Reservation;
import com.example.demo.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/{reservationId}")
    public Reservation findReservation(@PathVariable long reservationId){
        return reservationService.findReservationById(reservationId);
    }

    @PostMapping()
    @ResponseBody
    public Reservation addReservation(@RequestBody Reservation reservation) {
        // DO STUFF
        return reservation;
    }
}
