package com.example.demo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Setter
@Getter
@Entity
public class Cinema {
    @Id
    @GeneratedValue
    private  long id;

    private String name;
    @Embedded
    private Address address;
    @Embedded
    private CinemaHall cinemaHall;

    public Cinema(String name, Address address, CinemaHall cinemaHall) {
        this.name = name;
        this.address = address;
        this.cinemaHall = cinemaHall;
    }

//private Set<Movie> movies;
}
