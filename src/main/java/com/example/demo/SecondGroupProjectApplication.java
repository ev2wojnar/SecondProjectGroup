package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
public class SecondGroupProjectApplication {

    @Autowired
    private CinemaRepository cinemaRepository;
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private SeanceRepository seanceRepository;
    @Autowired
    private CinemaHallRepository cinemaHallRepository;
    @Autowired
    private SeatRepository seatRepository;


    public static void main(String[] args) {
        SpringApplication.run(SecondGroupProjectApplication.class, args);
    }

    @PostConstruct
    private void postConstruct() {

        Movie forrestGump = new Movie("Forrest Gump",
                "Historia życia Forresta, chłopca o niskim ilorazie inteligencji z niedowładem kończyn, który staje się miliarderem i bohaterem wojny w Wietnamie.",
                MovieGenre.COMEDY.DRAMA, LocalDate.of(1994, 6, 23), "USA",
                "Robert Zemeckis.", "Tom Hanks, Robin Wright Penn, Gary Sinise, Sally Field", 141, 13.5);
        Movie fightClub = new Movie("Podziemny krąd (Fight Club)",
                "Dwóch mężczyzn znudzonych rutyną zakłada klub, w którym co tydzień odbywają się walki na gołe pięści.",
                MovieGenre.DRAMA.PSYCHOLOGICAL_THRILLER, LocalDate.of(1999, 9, 10), "USA, Niemcy",
                "David Fincher", "Brad Pitt, Edward Norton, Helena Bonham Carter", 139, 13.5);
        Movie protosi = new Movie("Protosi", "Opis filmu object Object", MovieGenre.SCIENCE_FICTION,
                LocalDate.of(2020, 10, 16), "Blizzard", "Blizzard Corp.",
                "Kerrigan, Fenix, Zagara", 240, 13.5);
        movieRepository.save(forrestGump);
        movieRepository.save(fightClub);
        movieRepository.save(protosi);
        //-----------------------------//

        Cinema kinoX = new Cinema("Kino X", new Address("Wrocław", "Pawianicka", "34", "21-370"));
        Cinema kinoY = new Cinema("Kino Y", new Address("Zabrze", "Bąbelkowa", "108", "79-654"));
        cinemaRepository.save(kinoX);
        cinemaRepository.save(kinoY);
        //----------------------------//

        Customer jeff = new Customer("My name's Jeff", "Hello");
        Customer jeff2 = new Customer("Andrju", "BeBe");
        Customer jeff3 = new Customer("Parallel", "Stream");
        Customer jeff4 = new Customer("Peter", "Prune");
        Customer jef5 = new Customer("Admin", "Admin");
        Customer jeff6 = new Customer("Student", "Debil");
        Customer jeff7 = new Customer("Dziekan", "Piwo");
        Customer jeff8 = new Customer("Test123", "231Tset");
        Customer jeff9 = new Customer("Simulated", "Reality");
        customerRepository.saveAll(Arrays.asList(new Customer[] {jeff, jeff2, jeff3, jeff4, jef5}));
//        List<Customer> customerList = new ArrayList<Customer>();
//        customerList.add(jeff);
//        customerList.add(jeff2);
//        customerList.add(jeff3);
        //customerRepository.saveAll(customerList);
        //-----------------------------------------//

        Seance s1 = new Seance(LocalDate.of(1899, 7, 12), 4, "yourMOM", true, protosi);
        Seance s2 = new Seance(LocalDate.of(1999, 3, 10), 3, "yourDAD", false, fightClub);
        seanceRepository.save(s1);
        seanceRepository.save(s2);
        //--------------------//

        CinemaHall hall8 = new CinemaHall(8, 160);
        CinemaHall hall7 = new CinemaHall(7, 160);
        CinemaHall hall6 = new CinemaHall(6, 160);
        cinemaHallRepository.saveAll(Arrays.asList(new CinemaHall[] {hall8, hall7, hall6}));
        //----------------------//

        Seat seat1 = new Seat('R', 7, hall7);
        Seat seat2 = new Seat('A', 9, hall8);
        Seat seat3 = new Seat('C', 2, hall6);
        Seat seat4 = new Seat('P', 3, hall8);
        Seat seat5 = new Seat('O', 5, hall7);
        Seat seat6 = new Seat('T', 8, hall6);
        seatRepository.saveAll(Arrays.asList(new Seat[] {seat1, seat2, seat3, seat4, seat5, seat6}));
        //------------------------------//

        Reservation reservation1 = new Reservation("Teodor", "Salata", jeff, seat5, new TicketType("3D"));
        reservationRepository.save(reservation1);
    }

}
