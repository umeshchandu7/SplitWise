package com.scaler.Splitwise.Services.groupservice;

import com.scaler.Splitwise.DTOs.TransactionDTO;

import java.util.List;

public interface GroupService {
    List<TransactionDTO> settleUp();
}
