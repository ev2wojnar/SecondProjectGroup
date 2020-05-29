package com.example.demo.services;

import com.example.demo.model.Cinema;
import com.example.demo.repository.CinemaRepository;
import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CinemaService {

    @Autowired
    private CinemaRepository cinemaRepository;

    @Autowired
    private MovieRepository movieRepository;

    public Movie findMovieBYId(long id){
        return movieRepository.findById(id).orElse(null);
    }

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
