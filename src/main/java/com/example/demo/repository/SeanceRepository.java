package com.example.demo.repository;

import com.example.demo.model.Seance;
import org.springframework.data.repository.CrudRepository;

public interface SeanceRepository extends CrudRepository<Seance, Long> {
    Iterable<Seance> findByMovieId(long id);
}
