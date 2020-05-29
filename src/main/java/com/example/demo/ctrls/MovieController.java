package com.example.demo.ctrls;

import com.example.demo.model.Movie;
import com.example.demo.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/cinemas/movies/{movieId}")
    public Movie findMovie(@PathVariable long movieId){
        return  movieService.findMovieBYId(movieId);
    }
}
