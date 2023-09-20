package com.scaler.Splitwise.Repositories;

import com.scaler.Splitwise.Models.UserExpense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserExpenseRepository extends JpaRepository<UserExpense,Long> {
}
