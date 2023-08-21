package com.scaler.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Expense extends BaseModel{
    private String description;
    private Double totalAmount;
    private ExpenseType expenseType;
    @ManyToOne
    private Group group;
    @OneToMany
    List<ExpenseUser> paidBy;
    @OneToMany
    List<ExpenseUser> owedBy;
}
