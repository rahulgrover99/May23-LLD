package com.scaler.splitwise.controllers;

import com.scaler.splitwise.dtos.SettleUpRequest;
import com.scaler.splitwise.dtos.SettleUpResponse;
import com.scaler.splitwise.models.Expense;
import com.scaler.splitwise.services.SettleUpService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class SettleUpController {

    private SettleUpService settleUpService;
    public SettleUpResponse settleUp(SettleUpRequest settleUpRequest) {
        List<Expense> expenseList = settleUpService.settleUp(
                settleUpRequest.getUserId(), settleUpRequest.getGroupId());
        return new SettleUpResponse(expenseList);
    }
}
