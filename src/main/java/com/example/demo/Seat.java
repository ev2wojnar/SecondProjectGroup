package com.example.demo;

public class Seat {

    char row;
    int position;
    //@Override
    public boolean equals(Seat another) {
        if (another.row == this.row && another.position == this.position) return true;
        return false;
    }
}
