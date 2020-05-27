package com.example.demo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Setter
@Getter
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String customerName;
    private String customerSurname;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Seat seat;
    @Embedded
    //@ManyToOne
    private TicketType ticketType;

    public Reservation(String customerName, String customerSurname, Customer customer, Seat seat, TicketType ticketType) {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customer = customer;
        this.seat = seat;
        this.ticketType = ticketType;
    }
}
