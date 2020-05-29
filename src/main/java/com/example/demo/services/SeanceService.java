package com.example.demo.services;

import com.example.demo.model.Seance;
import com.example.demo.repository.SeanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeanceService {

    @Autowired
    private SeanceRepository seanceRepository;

    public Seance findSeanceById(long id){
        return seanceRepository.findById(id).orElse(null);
    }
}
