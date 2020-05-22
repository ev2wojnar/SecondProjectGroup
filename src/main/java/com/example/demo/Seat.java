package com.example.demo;

import javax.persistence.Embeddable;

@Embeddable
public class Seat {

    private char row;
    private int position;
    //@Override
    public boolean equals(Seat another) {
        if (another.row == this.row && another.position == this.position) return true;
        return false;
    }
}
