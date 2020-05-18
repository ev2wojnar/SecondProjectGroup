package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@SpringBootApplication
public class SecondGroupProjectApplication {

    @Autowired
    private CinemaRepository cinemaRepository;
    @Autowired
    private MovieRepository movieRepository;

    public static void main(String[] args) {
        SpringApplication.run(SecondGroupProjectApplication.class, args);
    }

    @PostConstruct
    private void postConstruct() {
        Movie forrestGump = new Movie(1, "Forrest Gump", "Historia życia Forresta, chłopca o niskim ilorazie inteligencji z niedowładem kończyn, który staje się miliarderem i bohaterem wojny w Wietnamie.", "Dramat, Komedia", LocalDate.of(1994,6,23), "USA",
                "Robert Zemeckis.", "Tom Hanks, Robin Wright Penn, Gary Sinise, Sally Field", 141, 13.5);
        Movie fightClub = new Movie(2,"Podziemny krąd (Fight Club)","Dwóch mężczyzn znudzonych rutyną zakłada klub, w którym co tydzień odbywają się walki na gołe pięści.", "Dramat, Thriller, Psychologiczny", LocalDate.of(1999,9,10),"USA, Niemcy", "David Fincher","Brad Pitt, Edward Norton, Helena Bonham Carter",139,13.5);

        movieRepository.save(forrestGump);
        movieRepository.save(fightClub);

    }

}
