package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Hall extends BaseModel{
    private String name;
    @OneToMany
    private List<Seat> seats;
    private ScreenType screenType;
}
