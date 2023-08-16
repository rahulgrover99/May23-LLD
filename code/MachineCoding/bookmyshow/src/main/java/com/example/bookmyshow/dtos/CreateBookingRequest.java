package com.example.bookmyshow.dtos;

import lombok.Data;

import java.util.List;

@Data
public class CreateBookingRequest {
    private Long userId;
    private Long showId;
    private List<Long> seatIds;
}
