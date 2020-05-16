package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

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
        Movie protosi = new Movie(1, "Protosi", "No co tam, co tam?", "Science-fiction", "18.07.2020", "Blizzard", "Blizzard Corp.",
                "Kerrigan, Fenix, Zagara", 2.4, 13.5);
        Movie admin123 = new Movie(2, "AdminAdmin", "a jakie jest haslo twoje?", "western", "29.10.2020", "Klub Kosmos", "Sebix Corp.",
                "Andrzej Poziomka, Tadeusz Litwin, Admin Admin", 2.3, 14.5);
        movieRepository.save(protosi);
        movieRepository.save(admin123);
    }

}
