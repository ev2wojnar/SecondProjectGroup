package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;


@NoArgsConstructor
@Setter
@Getter
@Entity
public class Seance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Movie movie;
    private LocalDate localDate;
    private int duration;
    private String languageVersion;
    private boolean is3D;

    public Seance(LocalDate localDate, int duration, String languageVersion, boolean is3D, Movie movie) {
        this.localDate = localDate;
        this.duration = duration;
        this.languageVersion = languageVersion;
        this.is3D = is3D;
        this.movie = movie;
    }
}
