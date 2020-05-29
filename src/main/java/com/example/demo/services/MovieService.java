package com.example.demo.services;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Movie findMovieBYId(long id){
        return movieRepository.findById(id).orElse(null);
    }

    public Iterable<Movie> findAllMovies(){
        return movieRepository.findAll();
    }
}
