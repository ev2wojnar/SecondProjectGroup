package com.example.demo.ctrls;

import com.example.demo.model.Reservation;
import com.example.demo.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("cinemas/reservation/{reservationId}")
    public Reservation findReservation(@PathVariable long reservationId){
        return reservationService.findReservationById(reservationId);
    }
}
