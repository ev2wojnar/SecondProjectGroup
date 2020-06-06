package com.example.demo.model;

import java.util.HashMap;
import java.util.Map;

public enum MovieGenre {
    ADVENTURE("ADVENTURE", "Przygoda"),
    ACTION("ACTION", "Film Akcji"),
    COMEDY("COMEDY", "Komedia"),
    CRIME("Crime", "Kryminał"),
    DRAMA("Drama", "Dramat"),
    FANTASY("Fantasy", "Fantazy"),
    HISTORICAL("Hist", "Film historyczny"),
    HORROR("Horroe", "Horror"),
    PSYCHOLOGICAL_THRILLER("PSYCHOLOGICAL_THRILLER", "Thriller psychologiczny"),
    ROMANCE("ROMANCE", "Romans"),
    SCIENCE_FICTION("SCIENCE_FICTION", "Science fiction"),
    THRILLER("THRILLER", "Thriller"),
    WESTERN("WESTERN", "Western"),
    ANIMATION("ANIMATION", "Animacja"),
    FAMILY("FAMILY", "Rodzinny"),
    MUSIC("MUSIC", "Musical"),
    BIOGRAPHY("BIOGRAPHY", "Biograficzny");

    private final Map<String, String> localName;

    MovieGenre(String engName, String plName) {
        localName = new HashMap<>();
        localName.put("en", engName);
        if (!plName.equals(""))
            localName.put("pl", plName);
        else
            localName.put("pl", engName);
    }

    public Map<String, String> getLocaleName() {
        return localName;
    }

}
