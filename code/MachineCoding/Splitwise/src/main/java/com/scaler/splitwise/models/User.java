package com.scaler.splitwise.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity(name = "users")
@Data
public class User extends BaseModel{
    private String name;
    private String phone;
    private String password;
}
