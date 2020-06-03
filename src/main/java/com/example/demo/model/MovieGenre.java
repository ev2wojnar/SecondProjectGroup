package com.example.demo.model;

import java.util.HashMap;
import java.util.Map;

public enum MovieGenre {
    ADVENTURE("ADVENTURE", "Przygoda"),
    ACTION("ACTION", "Akcja"),
    COMEDY("COMEDY", "Komedia"),
    CRIME("Crime", "Kryminał"),
    DRAMA("Drama", "Dramat"),
    FANTASY("Fantasy", "Fantazy"),
    HISTORICAL("Hist", "Hist"),
    HORROR("Horroe", "Horror"),
    PSYCHOLOGICAL_THRILLER("PSYCHOLOGICAL_THRILLER", ""),
    ROMANCE("ROMANCE", ""),
    SCIENCE_FICTION("SCIENCE_FICTION", ""),
    THRILLER("THRILLER", ""),
    WESTERN("WESTERN", ""),
    ANIMATION("ANIMATION", ""),
    FAMILY("FAMILY", ""),
    MUSIC("MUSIC", ""),
    BIOGRAPHY("BIOGRAPHY", "");

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
