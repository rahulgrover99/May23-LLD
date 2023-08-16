package com.example.bookmyshow.repositories;

import com.example.bookmyshow.models.MovieShow;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MovieShowRepository extends JpaRepository<MovieShow, Long> {

    @Override
    Optional<MovieShow> findById(Long aLong);

}
