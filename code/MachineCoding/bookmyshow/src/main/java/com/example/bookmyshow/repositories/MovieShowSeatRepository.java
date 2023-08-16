package com.example.bookmyshow.repositories;

import com.example.bookmyshow.models.MovieShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieShowSeatRepository extends JpaRepository<MovieShowSeat, Long> {
}
