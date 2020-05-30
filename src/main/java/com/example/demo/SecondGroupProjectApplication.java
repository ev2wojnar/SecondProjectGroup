package com.example.demo;

import com.example.demo.ctrls.MessageController;
import com.example.demo.model.*;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

import static java.util.Arrays.asList;

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

    @Autowired
    private MessageController messageController;


    public static void main(String[] args) {
        SpringApplication.run(SecondGroupProjectApplication.class, args);
    }

    @PostConstruct
    private void postConstruct() {

        Movie forrestGump = new Movie("Forrest Gump", "Historia życia Forresta, chłopca o niskim ilorazie inteligencji z niedowładem kończyn, który staje się miliarderem i bohaterem wojny w Wietnamie.",
                MovieGenre.COMEDY.DRAMA, LocalDate.of(1994, 6, 23), "USA", "Robert Zemeckis.", "Tom Hanks, Robin Wright Penn, Gary Sinise, Sally Field", 141, 13.5);
        Movie fightClub = new Movie("Podziemny krąd (Fight Club)", "Dwóch mężczyzn znudzonych rutyną zakłada klub, w którym co tydzień odbywają się walki na gołe pięści.",
                MovieGenre.DRAMA.PSYCHOLOGICAL_THRILLER, LocalDate.of(1999, 9, 10), "USA, Niemcy", "David Fincher", "Brad Pitt, Edward Norton, Helena Bonham Carter", 139, 13.5);
        Movie puplFiction = new Movie ("Pulp Fiction", "Najsłynniejszy film Quentina Tarantino. Opowieść o dwóch płatnych mordercach pracujących na zlecenie mafii, żonie gangstera, bokserze i parze okradającej ludzi w restauracji",
                MovieGenre.DRAMA.CRIME.THRILLER, LocalDate.of(1994,5,19),"USA", "Quentin Tarantino", "John Travolta, Samuel L. Jackson,Bruce Willis, Uma Thurman",154,13.5);
        Movie theShawshankRedemption = new Movie ("Skazani na Shawshank", "Adaptacja opowiadania Stephena Kinga. Niesłusznie skazany na dożywocie bankier stara się przterwać w brutalnym, więziennym świecie.",
                MovieGenre.DRAMA.CRIME, LocalDate.of(1994,9,10),"USA", "Frank Darabont", "Tim Robbins,Morgan Freeman, Bob Gunton, William Sadler", 142,13.5);
        Movie theGreenMile = new Movie ("Zielona Mila", "Emerytowany strażnik więzienny opowiada przyjaciółce o niezwykłym mężczyźnie, którego skazano na śmierć za zabójstwo dwóch 9-letnich dziewczynek.",
                MovieGenre.DRAMA, LocalDate.of(1999,12,6),"USA", "Frank Darabont", "Tom Hanks, Michael Clarke Duncan",188,13.5);
        Movie mrsDoubtfire = new Movie ("Pani Doubtfire","Daniel Hillard zatrudnia się jako gosposia swojej byłej żony, by spędzać więcej czasu z dziećmi. Nikt nie wie, kim jest naprawdę, bo pracuje w przebraniu jako pani Doubtfire.",
                MovieGenre.DRAMA.COMEDY, LocalDate.of(1993,11,24),"USA","Chris Columbus","Robin Williams, Sally Field, Pierce Brosna", 125, 13.5);
        Movie zootopia = new Movie ("Zwierzogród", "Nick Bajer - żyjący z drobnych przekrętów szczwany lis, i Judy Hops - pierwszy w historii królik zatrudniony w policji, łączą siły, by rozwiązać kryminalną zagdkę",
                MovieGenre.COMEDY.ADVENTURE.ANIMATION, LocalDate.of(2016,2,10),"USA","Byron Howar, Rich Moore","Julia Kamińska, Paweł Domagałą",108,12.5);
        Movie theLionKing = new Movie ( "Król Lew", "W wyniku podstępu Skazy prawowity władca afrykańskiej sawanny, Simba, zostaje wygnany. Razem z dwójką przyjaciół zamierza odzyskać tron.",
                MovieGenre.ANIMATION.ADVENTURE.FAMILY, LocalDate.of(2019,7,12),"USA","Jon Favreau","Marcin Januszkiewicz, Zofia Nowakowska, Michał Piela",118,12.5);
        Movie toyStory = new Movie ("Toy Story","W świecie zabawek Andy'ego, których niekwestionowanym liderem był dotychczas kowboj Chudy, pojawia się nowa zabawka - astronauta Buzz.",
                MovieGenre.ANIMATION.FAMILY.COMEDY, LocalDate.of(1995,11,19),"USA", "John Lasseter", "Robert Czebotar, Tomasz Konieczny", 76, 12.5);
        Movie toyStory2 = new Movie ("Toy Story 2", "Buzz Astral, mając do pomocy zabawki Andy'ego, postanawia ocalić szeryfa Chudego z rąk nieuczciwego kolekcjonera.",
                MovieGenre.ANIMATION.FAMILY.COMEDY, LocalDate.of(1999,11,13),"USA","John Lasseter, Lee Unkrich, Ash Brannon", "Robert Czebotar, Łukasz Nowicki, Izabella Bukowska",92, 12.5);
        Movie toyStory3 = new Movie ("Toy Story 3", "Andy idzie na studia, a jego zabawki trafiają do przedszkola. Chudy wraz z przyjaciółmi robi wszystko, by się stamtąd wydostać i wrócić do domu." ,
                MovieGenre.ANIMATION.FAMILY.COMEDY, LocalDate.of(2010,6,12), "USA","Lee Unkrich", "Robert Czebotar, Łukasz Nowicki, Izabella Bukowska", 103,12.5);
        Movie toyStory4 = new Movie ("Toy Story 4", "Kowboj Chudy wraz z przyjaciółmi wyruszają na poszukiwania zaginionej nowej zabawki, Sztućka.",
                MovieGenre.ANIMATION.FAMILY.COMEDY , LocalDate.of(2019,6,15),"USA", "Josh Cooley","Robert Czebotar, Łukasz Nowicki,Edyta Olszówka",100 , 12.5);
        Movie howToTrainYourDragon = new Movie("Jak wytresować smoka", "Chuderlawy Wiking przewróci porządek w wiosce, kiedy zamiast zabić w ramach inicjacji jakiegoś smoka, zaprzyjaźni się z najgroźniejszym z nich.",
                MovieGenre.ANIMATION.FAMILY.COMEDY.FANTASY.ADVENTURE , LocalDate.of(2010,3,18), "USA", "Dean DeBlois, Chris Sanders", "Mateusz Damięcki, Julia Kamińska, Miłogost Reczek, Tomasz Traczyński", 98, 12.5);
        Movie howToTrainYourDragon2 = new Movie("Jak wytresować smoka 2", "Pięć lat po zjednoczeniu rasy smoków oraz ludzi Czkawka i Szczerbatek stają do obrony wyspy Berk przed niebezpiecznymi dzikimi bestiami, a także tajemniczym Smoczym Jeźdźcem.",
                MovieGenre.ANIMATION.FAMILY.COMEDY.FANTASY.ADVENTURE , LocalDate.of(2014,5,16), "USA", "Dean DeBlois", "Grzegorz Drojewski, Julia Kamińska, Artur Pontek ", 102, 12.5);
        Movie howToTrainYourDragon3 = new Movie("Jak wytresować smoka 3", "Gdy Czkawka zmaga się zadaniami wodza Berk, Szczerbatek trafia na trop tajemniczej smoczycy.",
                MovieGenre.ANIMATION.FAMILY.COMEDY.FANTASY.ADVENTURE , LocalDate.of(2019,1,3), "USA", "Dean DeBlois", "Grzegorz Drojewski, Julia Kamińska, Wojciech Machnicki", 104 , 12.5);
        Movie frozen = new Movie("Kraina Lodu", "Kiedy posiadająca moc kontroli nad śniegiem i lodem Elsa sprowadza srogą zimę na swoje królestwo, Anna wyrusza w podróż, aby odszukać siostrę oraz zakończyć pogodowe anomalie.",
                MovieGenre.ANIMATION.FAMILY.ADVENTURE.MUSIC, LocalDate.of(2013, 11, 17), "USA", "Chris Buck, Jennifer Lee", "Anna Cieślak, Lidia Sadowa, Paweł Ciołkosz, Czesław Mozil", 102, 12.5);
        Movie frozen2 = new Movie("Kraina Lodu 2", "Elsa i Anna wraz z przyjaciółmi udają się do Zaczarowanego Lasu w poszukiwaniu pomocy dla swego Królestwa",
                MovieGenre.ANIMATION.FAMILY.ADVENTURE.MUSIC, LocalDate.of(2019, 11, 7), "USA", "Chris Buck, Jennifer Lee", "Anna Cieślak, Lidia Sadowa, Paweł Ciołkosz, Czesław Mozil", 103, 12.5);
        Movie incredibles = new Movie("Iniemamocni", "Dawni superbohaterowie, Bob Parr i jego żona Helen, wychowują troje dzieci i wiodą życie zwykłych obywateli. Wkrótce Parr dostanie tajne zlecenie, w którym pomoże mu cała rodzina.",
                MovieGenre.ANIMATION.FAMILY.COMEDY.ACTION, LocalDate.of(2004, 10, 27), "USA", "Brad Bird", "Piotr Fronczewski, Dorota Segda, Karolina Gruszka, Filip Radkiewicz", 115, 12.5);
        Movie incredibles2 = new Movie("Iniemamocni 2", "Podczas gdy Bob Parr zmaga się z problemami wychowawczymi swoich dzieci, jego żona Helen, znana także, jako Elastyna, realizuje swe aspiracje, podejmując pracę w lidze antyprzestępczej",
                MovieGenre.ANIMATION.FAMILY.COMEDY.ACTION, LocalDate.of(2018, 6, 5), "USA", "Brad Bird", "Piotr Fronczewski, Dorota Segda, Karolina Gruszka, Borys Wiciński", 118, 12.5);
        Movie up = new Movie ("Odlot", "70-letni Carl po śmierci żony zamienia swój dom w statek powietrzny i odlatuje do Ameryki Południowej, by spełnić swoje marzenie. Przez przypadek zabiera ze sobą ośmioletniego skauta.",
                MovieGenre.ANIMATION.FAMILY.COMEDY.ADVENTURE, LocalDate.of(2009,5,13), "USA", "Pete Docter, Bob Peterson", "Wojciech Siemion, Ignacy Gogolewski",96 , 12.5);
        Movie inception = new Movie ("Incepcja", "Czasy, gdy technologia pozwala na wchodzenie w świat snów. Złodziej Cobb ma za zadanie wszczepić myśl do śpiącego umysłu.",
               MovieGenre.THRILLER, LocalDate.of(2010,7,8), "USA, Wielka Brytania","Christopher Nolan", "Leonardo DiCaprio,Ken Watanabe, Marion Cotillard, Joseph Gordon-Levitt, Ellen Page", 148, 13.5);
        Movie intouchables = new Movie ("Nietykalni", "Sparaliżowany milioner zatrudnia do opieki młodego chłopaka z przedmieścia, który właśnie wyszedł z więzienia.",
                MovieGenre.DRAMA.COMEDY.BIOGRAPHY, LocalDate.of(2011,9,23), "Francja", "Olivier Nakache, Éric Toledano", "François Cluzet, Omar Sy",112,13.5);
        Movie greenBook = new Movie ("Green Book", "Drobny cwaniaczek z Bronksu zostaje szoferem ekstrawaganckiego muzyka z wyższych sfer i razem wyruszają na wielotygodniowe tournée.",
                MovieGenre.DRAMA.COMEDY, LocalDate.of(2018,9,11), "USA", " Peter Farrelly", "Viggo Mortensen, Mahershala Ali, Linda Cardellini", 130 , 13.5);
        Movie annieHall = new Movie ("Annie Hall", "Historia burzliwego związku Alvy'ego Singera, błyskotliwego nowojorskiego komika, z piosenkarką Annie Hall.",
                MovieGenre.COMEDY, LocalDate.of(1977,4,20), "USA", "Woody Allen", "Woody Allen, Diane Keaton, Tony Roberts, Christopher Walken", 93, 13.5);


        movieRepository.saveAll(asList(forrestGump,fightClub,puplFiction,theShawshankRedemption,theGreenMile,mrsDoubtfire,zootopia,theLionKing,toyStory, toyStory2,toyStory3,toyStory4,
                howToTrainYourDragon,howToTrainYourDragon2,howToTrainYourDragon3,frozen,frozen2, incredibles, incredibles2,up, inception, intouchables, greenBook, annieHall ));

        //-----------------------------//

        Cinema kinoX = new Cinema("Kino X", new Address("Wrocław", "Pawianicka", "34", "21-370"));
        Cinema kinoY = new Cinema("Kino Y", new Address("Zabrze", "Bąbelkowa", "108", "79-654"));
        cinemaRepository.save(kinoX);
        cinemaRepository.save(kinoY);
        //----------------------------//

        Customer jeff = new Customer("Jan", "Kowalski");
        Customer jeff2 = new Customer("Andrzej", "Barański");
        Customer jeff3 = new Customer("Aleksandra", "Kurek");
        Customer jeff4 = new Customer("Weronika", "Pałkiewicz");
        Customer jeff5 = new Customer("Marta", "Kozioł");
        Customer jeff6 = new Customer("Kajetan", "Nowak");
        Customer jeff7 = new Customer("Tomasz", "Adamczyk");
        Customer jeff8 = new Customer("Karolina", "Bednarz");
        Customer jeff9 = new Customer("Paulina", "Pawlik");
        customerRepository.saveAll(asList(new Customer[] {jeff, jeff2, jeff3, jeff4, jeff5}));
//        List<Customer> customerList = new ArrayList<Customer>();
//        customerList.add(jeff);
//        customerList.add(jeff2);
//        customerList.add(jeff3);
        //customerRepository.saveAll(customerList);
        //-----------------------------------------//

        Seance s1 = new Seance(LocalDate.of(1899, 7, 12), 4, "polski (dubbing)", true, frozen);
        Seance s2 = new Seance(LocalDate.of(1999, 3, 10), 3, "polski (napisy)", false, fightClub);
        seanceRepository.save(s1);
        seanceRepository.save(s2);
        //--------------------//

        CinemaHall hall8 = new CinemaHall(8, 160);
        CinemaHall hall7 = new CinemaHall(7, 160);
        CinemaHall hall6 = new CinemaHall(6, 160);
        cinemaHallRepository.saveAll(asList(new CinemaHall[] {hall8, hall7, hall6}));
        //----------------------//

        Seat seat1 = new Seat('R', 7, hall7);
        Seat seat2 = new Seat('A', 9, hall8);
        Seat seat3 = new Seat('C', 2, hall6);
        Seat seat4 = new Seat('P', 3, hall8);
        Seat seat5 = new Seat('O', 5, hall7);
        Seat seat6 = new Seat('T', 8, hall6);
        seatRepository.saveAll(asList(new Seat[] {seat1, seat2, seat3, seat4, seat5, seat6}));
        //------------------------------//

        Reservation reservation1 = new Reservation("Teodor", "Salata", jeff, seat5, new TicketType("3D"));
        reservationRepository.save(reservation1);
    }

}
