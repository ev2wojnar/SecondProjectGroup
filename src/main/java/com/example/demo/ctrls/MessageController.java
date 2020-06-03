package com.example.demo.ctrls;

import com.example.demo.model.Movie;
import com.example.demo.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MessageController {

    @GetMapping("/welcome")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "welcome";
    }
    @GetMapping("/goodbye")
    public String greeting2(@RequestParam(name="name2", required=false, defaultValue="cruel world") String name, Model model) {
        model.addAttribute("name2", name);
        return "goodbye";
    }
    @Autowired
    private MovieService movieService;
    public Movie findMovie(@PathVariable long movieId){
        return  movieService.findMovieBYId(movieId);
//    public String findMovie(@PathVariable long movieId, @RequestParam(name="movie", required=false, defaultValue="empty") Movie movie, Model model) {
//        movie = movieService.findMovieBYId(movieId);
//        model.addAttribute("movie", movie);
//        return "movieID";
    }
    @GetMapping("/details")
    public String movieDetails(@RequestParam(name="movie", required=false, defaultValue="0") String name, Model model) {
        Movie movie = findMovie(Integer.parseInt(name));
        model.addAttribute("movie", movie);
        return "details";
    }
    @GetMapping("/priceList")
    public String priceList(@RequestParam(name="price", required=false, defaultValue="0")String name, Model model){
        //model.addAttribute("price", model);
        return "priceList";
    }

//    @GetMapping("/movieDescription")
//    public String movieDesc(@RequestParam(name = "name3", required = false, defaultValue = ))

}