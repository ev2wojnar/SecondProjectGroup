package com.example.demo.apiControllers;

import com.example.demo.model.Reservation;
import com.example.demo.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reservation")
public class ApiReservationController {

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
