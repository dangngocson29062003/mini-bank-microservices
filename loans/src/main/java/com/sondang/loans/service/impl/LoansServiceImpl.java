package com.sondang.loans.service.impl;

import com.sondang.loans.dto.LoansDTO;
import com.sondang.loans.service.ILoansService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LoansServiceImpl implements ILoansService {
    @Override
    public void createLoan(String mobileNumber) {

    }

    @Override
    public LoansDTO fetchLoan(String mobileNumber) {
        return null;
    }

    @Override
    public boolean updateLoan(LoansDTO loansDto) {
        return false;
    }

    @Override
    public boolean deleteLoan(String mobileNumber) {
        return false;
    }
}
