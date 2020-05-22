package com.example.demo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;


@NoArgsConstructor
@Setter
@Getter
@Entity
public class Seance {
    @Id
    @GeneratedValue
    private long id;
    private LocalDate localDate;
    private int duration;
    private String langugeVersion;
    private boolean is3D;

    public Seance(LocalDate localDate, int duration, String langugeVersion, boolean is3D) {
        this.localDate = localDate;
        this.duration = duration;
        this.langugeVersion = langugeVersion;
        this.is3D = is3D;
    }
}
