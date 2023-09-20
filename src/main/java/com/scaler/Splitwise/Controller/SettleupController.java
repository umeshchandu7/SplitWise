package com.scaler.Splitwise.Controller;

import com.scaler.Splitwise.DTOs.TransactionDTO;
import com.scaler.Splitwise.Models.Group;
import com.scaler.Splitwise.Services.groupservice.GroupService;
import com.scaler.Splitwise.Services.initialiseservice.InitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class SettleupController {
    @Autowired
    private InitService initService;
    @Autowired
    private GroupService groupService;
    @GetMapping("/init")
    public ResponseEntity initalise()
    {
        initService.initialise();
        return ResponseEntity.ok("Done");
    }
    @GetMapping("/settleUp")
    public ResponseEntity settleUp()
    {

        List<TransactionDTO> transactionDTOS = groupService.settleUp();
        return ResponseEntity.ok(transactionDTOS);
    }

}
