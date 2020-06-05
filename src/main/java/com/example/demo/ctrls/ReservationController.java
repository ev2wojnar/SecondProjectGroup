package com.example.demo.ctrls;

import com.example.demo.model.Reservation;
import com.example.demo.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    @GetMapping("/podsumowanieBezWyboruMiejsca")
    public String showSummary(@RequestParam(name="podsumowanie1", required=false, defaultValue="hej")String name, Model model){
        return "summary1";
    }
    @GetMapping("/podsumowanieZWyboremMiejsca")
    public String showSummaryWithPlace(@RequestParam(name = "podsumowanie2", required = false, defaultValue = "konczymy ta zabawe")String name, Model model){
        return "summary2";
    }
    @GetMapping("/payment")
    public String payForTheTicket(@RequestParam(name = "payment", required = false, defaultValue = "ciniMinis")String name, Model model){
        return "theEnding";
    }

    @PostMapping()
    @ResponseBody
    public Reservation addReservation(@RequestBody Reservation reservation) {
        // DO STUFF
        return reservation;
    }

}
