package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class MovieShowSeat extends BaseModel {
    @ManyToOne
    private MovieShow movieShow;
    @ManyToOne
    private Seat seat;
    private BookingSeatStatus status;
}
