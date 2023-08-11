package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Seat extends BaseModel {
    private int rowNum;
    private int colNum;
    private SeatType seatType;

}
