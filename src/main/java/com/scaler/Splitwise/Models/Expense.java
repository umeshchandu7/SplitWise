package com.scaler.Splitwise.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Expense extends BaseModel{
    private String description;
    private double amount;
  @OneToMany
    List<UserExpense> userExpenses;
    @Enumerated(EnumType.ORDINAL)
    private Currency currency;
}
