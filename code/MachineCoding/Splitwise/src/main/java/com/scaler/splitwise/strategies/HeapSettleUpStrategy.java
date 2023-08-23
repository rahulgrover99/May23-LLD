package com.scaler.splitwise.strategies;

import com.scaler.splitwise.models.Expense;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Qualifier("Old")
public class HeapSettleUpStrategy implements SettleUpStrategy {
    @Override
    public List<Expense> settleUp(List<Expense> expensesToSettle) {

        // TODO: Implement DSA question.

        // 1. Find all users amount to be paid, or get back.
        // 2. Divide users with +ve sum in 1 heap and -ve in other.
        // 3. Keep popping out from both the heaps, and create a transaction
        // type of expense.

        // A -> 450 B <- 250
        // Insert A back with 200 amount to the first heap
        // Create an expense A paid 200 B owed 200 and add it to the ans list.

        // 4. Return list of expense when the heaps get empty.

        return null;
    }
}
