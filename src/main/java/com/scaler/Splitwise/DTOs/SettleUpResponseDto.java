package com.scaler.Splitwise.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class SettleUpResponseDto {
    private List<TransactionDTO> transationList;
}
