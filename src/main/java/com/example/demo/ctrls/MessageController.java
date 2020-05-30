package com.example.demo.ctrls;

import com.example.demo.model.Movie;
import com.example.demo.model.MovieGenre;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class MessageController {
    Movie up = new Movie ("Odlot", "70-letni Carl po śmierci żony zamienia swój dom w statek powietrzny i odlatuje do Ameryki Południowej, by spełnić swoje marzenie. Przez przypadek zabiera ze sobą ośmioletniego skauta.",
            MovieGenre.ANIMATION.FAMILY.COMEDY.ADVENTURE, LocalDate.of(2009,5,13), "USA", "Pete Docter, Bob Peterson", "Wojciech Siemion, Ignacy Gogolewski",96 , 12.5);

    @GetMapping("/welcome")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="You") String name, Model model) {
        model.addAttribute("name", up.getDescription() );
        return "welcome";
    }

}