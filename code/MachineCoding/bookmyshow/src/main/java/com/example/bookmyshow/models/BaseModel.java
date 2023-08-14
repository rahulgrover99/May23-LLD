package com.example.bookmyshow.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
@Data
public class BaseModel {
    @Id
    @GeneratedValue
    private Long id;
}
