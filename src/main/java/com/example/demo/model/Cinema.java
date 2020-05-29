package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Setter
@Getter
@Entity
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;

    private String name;
    @Embedded
    private Address address;

    public Cinema(String name, Address address) {
        this.name = name;
        this.address = address;
    }

//private Set<Movie> movies;
}
