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

        Movie forrestGump = new Movie("Forrest Gump",
                "Historia życia Forresta, chłopca o niskim ilorazie inteligencji z niedowładem kończyn, który staje się miliarderem i bohaterem wojny w Wietnamie.",
                "Dramat, Komedia", LocalDate.of(1994,6,23), "USA",
                "Robert Zemeckis.", "Tom Hanks, Robin Wright Penn, Gary Sinise, Sally Field", 141, 13.5);
        Movie fightClub = new Movie("Podziemny krąd (Fight Club)",
                "Dwóch mężczyzn znudzonych rutyną zakłada klub, w którym co tydzień odbywają się walki na gołe pięści.",
                "Dramat, Thriller, Psychologiczny", LocalDate.of(1999,9,10),"USA, Niemcy",
                "David Fincher","Brad Pitt, Edward Norton, Helena Bonham Carter",139,13.5);
        Movie protosi = new Movie( "Protosi", "Opis filmu object Object", "Science-fiction",
                LocalDate.of(2020, 10, 16), "Blizzard", "Blizzard Corp.",
                "Kerrigan, Fenix, Zagara", 240, 13.5);
        movieRepository.save(forrestGump);
        movieRepository.save(fightClub);
        movieRepository.save(protosi);
        Cinema kinoX = new Cinema("Kino X", new Address("Wrocław", "Pawianicka", "34", "21-370"),
                new CinemaHall(3, 170));
        Cinema kinoY = new Cinema("Kino Y", new Address("Zabrze", "Bąbelkowa", "108", "79-654"),
                new CinemaHall(6, 90));
        cinemaRepository.save(kinoX);
        cinemaRepository.save(kinoY);
 
    }

}
