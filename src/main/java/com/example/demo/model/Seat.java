package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

//@Embeddable

@NoArgsConstructor
@Setter
@Getter
@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private char row;
    private int position;
    @ManyToOne
    private CinemaHall cinemaHall;
//    @ManyToOne
//    private Seance seance;
    public Seat(char row, int position, CinemaHall cinemaHall) {
        this.row = row;
        this.position = position;
        //this.seance = seance;
        this.cinemaHall = cinemaHall;
    }
    //@Override
    public boolean equals(Seat another) {
        if (another.row == this.row && another.position == this.position) return true;
        return false;
    }


}
