package com.scaler.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity(name = "splitwise_groups")
@Data
public class Group extends BaseModel {
    private String name;
    @ManyToMany
    private List<User> users;
    @ManyToOne
    private User adminUser;
    @OneToMany
    private List<Expense> expenses;
}
