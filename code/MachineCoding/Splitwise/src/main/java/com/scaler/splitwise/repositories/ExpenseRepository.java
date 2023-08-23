package com.scaler.splitwise.repositories;

import com.scaler.splitwise.models.Expense;
import com.scaler.splitwise.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    // All expenses for a particular group and a particular user
    List<Expense> findAllByGroup(Group group);

//    List<Expense> findAllByCreatedAt(Date createdAt);
}
