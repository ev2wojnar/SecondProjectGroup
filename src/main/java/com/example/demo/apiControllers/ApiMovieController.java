package com.example.demo.apiControllers;

import com.example.demo.model.Movie;
import com.example.demo.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/movies")
public class ApiMovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/{movieId}")
    public Movie findMovie(@PathVariable long movieId){
        return  movieService.findMovieBYId(movieId);
//    public String findMovies(@PathVariable long movieId, @RequestParam(name="movie", required=false, defaultValue="empty") Movie movie, Model model) {
//        movie = movieService.findMovieBYId(movieId);
//        model.addAttribute("movie", movie);
//        return "movieID";
    }


    @GetMapping("/movieID")
    public String dumbTest(@RequestParam(name="dumbData", required=false, defaultValue="5G zdalne laborki") String name, Model model) {
        model.addAttribute("dumbData", name);
        return "movieID";
    }

    @GetMapping
    public Iterable<Movie> showMovies(){
        return movieService.findAllMovies();
    }
//    @GetMapping("/dumb")
//    public String greeting3(@RequestParam(name="name4", required=false, defaultValue="STudent debil") String name, Model model) {
//        model.addAttribute("name4", name);
//        return "dumb";
//    }
}
