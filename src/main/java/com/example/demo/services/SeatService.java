package com.example.demo.services;

import com.example.demo.model.Seat;
import com.example.demo.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {

    @Autowired
    private SeatRepository seatRepository;

    public Seat findSeatById(long id){
        return seatRepository.findById(id).orElse(null);
    }
}
