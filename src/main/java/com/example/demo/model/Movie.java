package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@NoArgsConstructor
@Setter
@Getter
@Entity(name = "movie")
public class Movie implements Serializable {
    @Id
    @GeneratedValue
    private long id;

    private String title;

    private String description;
    private MovieGenre movieGenre;
   // private String type;
    private LocalDate releaseDate;
    private String production;
    private String direction;
    private String staff;
    private int duration;
    private double ticketPrice;
    //@Lob
    //@Column(name = "MAIN_PHOTO")
    //private byte[] mainPhoto;
//    @OneToMany
//    private List<Seance> seanceList = new ArrayList<>();

    public Movie(String title, String description, MovieGenre movieGenre, LocalDate releaseDate,
                 String production, String direction, String staff, int duration, double ticketPrice) {
        this.title = title;
        this.description = description;
        this.movieGenre = movieGenre;
       // this.type = type;
        this.releaseDate = releaseDate;
        this.production = production;
        this.direction = direction;
        this.staff = staff;
        this.duration = duration;
        this.ticketPrice = ticketPrice;

    }
}
