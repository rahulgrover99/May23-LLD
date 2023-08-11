package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MovieShowSeat {
    private MovieShow movieShow;
    private Seat seat;
    private BookingSeatStatus status;
}
