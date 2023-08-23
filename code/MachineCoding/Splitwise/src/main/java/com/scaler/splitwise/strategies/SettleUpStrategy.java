package com.scaler.splitwise.strategies;

import com.scaler.splitwise.models.Expense;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SettleUpStrategy {
    List<Expense> settleUp(List<Expense> expensesToSettle);
}
