package com.example.demo.services;

import com.example.demo.model.Reservation;
import com.example.demo.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public Reservation findReservationById(long id){
        return reservationRepository.findById(id).orElse(null);
    }
}
