package com.scaler.Splitwise.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class TransactionDTO {
    private String fromUserName;
    private String toUserName;
    private double amount;
}
