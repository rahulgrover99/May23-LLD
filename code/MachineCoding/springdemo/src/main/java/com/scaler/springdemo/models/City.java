package com.scaler.springdemo.models;

import lombok.Getter;

import java.util.Date;

@Getter
public class City{

    private String name;

    public City(Long id, Date createdAt, Date updatedAt, String name) {
        this.name = name;
    }
}