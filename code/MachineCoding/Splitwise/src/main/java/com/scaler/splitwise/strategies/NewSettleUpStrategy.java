package com.scaler.splitwise.strategies;

import com.scaler.splitwise.models.Expense;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Qualifier("GopalQualifier")
public class NewSettleUpStrategy implements SettleUpStrategy{
    @Override
    public List<Expense> settleUp(List<Expense> expensesToSettle) {
        return null;
    }
}
