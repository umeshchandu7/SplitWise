package com.scaler.Splitwise.Strategies;

import com.scaler.Splitwise.DTOs.TransactionDTO;
import com.scaler.Splitwise.Models.Expense;

import java.util.List;

public interface SettleUpStrategy {
    List<TransactionDTO> settleUp(List<Expense> expenses);
}
