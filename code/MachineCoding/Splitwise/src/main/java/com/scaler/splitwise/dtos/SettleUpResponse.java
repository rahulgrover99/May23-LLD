package com.scaler.splitwise.dtos;

import com.scaler.splitwise.models.Expense;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class SettleUpResponse {
    private List<Expense> expenses;
}
