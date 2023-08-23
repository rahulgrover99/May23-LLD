package com.scaler.splitwise.services;

import com.scaler.splitwise.models.Expense;
import com.scaler.splitwise.models.ExpenseUser;
import com.scaler.splitwise.models.Group;
import com.scaler.splitwise.models.User;
import com.scaler.splitwise.repositories.ExpenseRepository;
import com.scaler.splitwise.repositories.GroupRepository;
import com.scaler.splitwise.repositories.UserRepository;
import com.scaler.splitwise.strategies.SettleUpStrategy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SettleUpService {

    // Consider marking one of the beans as @Primary,
    // updating the consumer to accept multiple beans, or
    // using @Qualifier to identify the bean that should be consumed

    public SettleUpService(UserRepository userRepository,
                           GroupRepository groupRepository,
                           ExpenseRepository expenseRepository,
                           @Qualifier("GopalQualifier") SettleUpStrategy settleUpStrategy) {
        this.userRepository = userRepository;
        this.groupRepository = groupRepository;
        this.expenseRepository = expenseRepository;
        this.settleUpStrategy = settleUpStrategy;
    }

    UserRepository userRepository;
    GroupRepository groupRepository;
    ExpenseRepository expenseRepository;
    SettleUpStrategy settleUpStrategy;

    public List<Expense> settleUp(Long userId, Long groupId) {
        // 1. Get the user and verify the user exists. UserRepository
        // 2. Get the group and verify it exists
        // 3. Get all the expenses for that group where the user is involved.
        // 4. Iterate over the expense, segregate +ve, -ve, Heap, greedy approach
        // to find all the transactions required.
        // 4th step --> Strategy

        User user = userRepository
                .findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("No user found."));

        Group group = groupRepository
                .findById(groupId)
                .orElseThrow(() -> new IllegalArgumentException("No group found."));

        List<Expense> expenses = expenseRepository.findAllByGroup(group);
//        expenseRepository.findAllByCreatedAt(new Date());

        List<Expense> groupSettleTransactions = settleUpStrategy.settleUp(expenses);

        List<Expense> transactionsForUser = new ArrayList<>();
        for (Expense expense: groupSettleTransactions) {
            boolean isExpenseForUser = false;
            for (ExpenseUser expenseUser: expense.getOwedBy()) {
                if (expenseUser.getUser().equals(user)) {
                    isExpenseForUser = true;
                    break;
                }
            }

            for (ExpenseUser expenseUser: expense.getPaidBy()) {
                if (expenseUser.getUser().equals(user)) {
                    isExpenseForUser = true;
                    break;
                }
            }

            if (isExpenseForUser) {
                transactionsForUser.add(expense);
            }
        }
        return transactionsForUser;
    }
}
