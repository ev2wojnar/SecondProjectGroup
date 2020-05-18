package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CinemaService {

    @Autowired
    private CinemaRepository cinemaRepository;

    public Cinema findCinemaById(long id){
        return cinemaRepository.findById(id).orElse(null);
    }

    public void deleteCinemaById(long id){
        cinemaRepository.deleteById(id);
    }

    public Iterable<Cinema> findAllCinemas(){
        return cinemaRepository.findAll();
    }

    public Cinema saveCinema(Cinema cinema){
        return cinemaRepository.save(cinema);
    }
}
