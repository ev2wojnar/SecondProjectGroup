package com.example.demo.ctrls;

import com.example.demo.model.Movie;
import com.example.demo.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/{movieId}")
    public String movieDetails(@PathVariable long movieId, Model model) {
        Movie movie = movieService.findMovieBYId(movieId);
        model.addAttribute("movie", movie);
        model.addAttribute("movieGenre", movie.getMovieGenre().getLocaleName().get("pl"));
        return "movieScreen";
    }

}
