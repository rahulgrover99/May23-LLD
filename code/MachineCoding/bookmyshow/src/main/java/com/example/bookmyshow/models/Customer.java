package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Data
@Entity
public class Customer extends BaseModel {
    private String name;
    private String email;

    @OneToMany
    private List<Booking> bookings;
}
