package com.scaler.Splitwise.Services.groupservice;

import com.scaler.Splitwise.DTOs.TransactionDTO;
import com.scaler.Splitwise.Models.Group;
import com.scaler.Splitwise.Repositories.GroupRepository;
import com.scaler.Splitwise.Repositories.UserRepository;
import com.scaler.Splitwise.Strategies.SettleUpStrategies;
import com.scaler.Splitwise.Strategies.SettleUpStrategy;
import com.scaler.Splitwise.Strategies.SettleUpStrategyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService{
    @Autowired
    UserRepository userRepository;
    @Autowired
    GroupRepository groupRepository;
    public List<TransactionDTO> settleUp()
    {
        SettleUpStrategy settleUpStrategy = SettleUpStrategyFactory.getSettleUpStrategy(SettleUpStrategies.HEAP_BASED_SETTLEUP);
         String name = "Incredibles";
        Group group = groupRepository.findByName(name);
       List<TransactionDTO> transactionDTOS = settleUpStrategy.settleUp(group.getExpenses());
       return transactionDTOS;
    }
}
