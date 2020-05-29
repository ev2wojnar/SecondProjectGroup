package com.example.demo.services;

import com.example.demo.model.Seance;
import com.example.demo.repository.SeanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SeanceService {

    @Autowired
    private SeanceRepository seanceRepository;

    public Seance findSeanceById(long id) {
        return seanceRepository.findById(id).orElse(null);
    }

    public List<Seance> findByMovieId(long id) { // TODO Change to Criteria Queries
        List<Seance> list = new ArrayList<>(10);
        seanceRepository.findAll().forEach(seance -> {
            if (seance.getMovie().getId() == id) {
                list.add(seance);
                seance.setMovie(null);  //TODO remove this after changing Movie list to lazy
            }
        });
        return list;
    }
}
