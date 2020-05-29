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
public class CinemaHall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int roomNumber;
    private int numberOfSeats;

    public CinemaHall(int roomNumber, int numberOfSeats) {
        this.roomNumber = roomNumber;
        this.numberOfSeats = numberOfSeats;
    }
}
