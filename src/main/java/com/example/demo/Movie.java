package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Movie {
    @Id
    @GeneratedValue
    private long id;

    private String title;
    private String description;
    private String type;
    private LocalDate releaseDate;
    private String production;
    private String direction;
    private String staff;
    private int duration;
    private double ticketPrice;
}
