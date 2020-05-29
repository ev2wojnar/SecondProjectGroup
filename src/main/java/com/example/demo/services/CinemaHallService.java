package com.example.demo.services;

import com.example.demo.model.CinemaHall;
import com.example.demo.repository.CinemaHallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CinemaHallService {

    @Autowired
    private CinemaHallRepository cinemaHallRepository;

    public CinemaHall findCinemaHallById(long id){
        return cinemaHallRepository.findById(id).orElse(null);
    }
}
