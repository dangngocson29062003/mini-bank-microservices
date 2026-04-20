package com.sondang.loans.service.impl;

import com.sondang.loans.constant.LoansConstants;
import com.sondang.loans.dto.LoansDTO;
import com.sondang.loans.entity.Loans;
import com.sondang.loans.exception.LoanAlreadyExistsException;
import com.sondang.loans.exception.ResourceNotFoundException;
import com.sondang.loans.mapper.LoansMapper;
import com.sondang.loans.repository.LoansRepository;
import com.sondang.loans.service.ILoansService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class LoansServiceImpl implements ILoansService {

    private final LoansRepository loansRepository;

    @Override
    public void createLoan(String mobileNumber) {
        Optional<Loans> loan = loansRepository.findByMobileNumber(mobileNumber);
        if(loan.isPresent()) {
            throw new LoanAlreadyExistsException("Loan already registered with given mobileNumber " + mobileNumber);
        }
        loansRepository.save(createNewLoan(mobileNumber));
    }

    @Override
    public LoansDTO fetchLoan(String mobileNumber) {
        Loans loan = loansRepository.findByMobileNumber(mobileNumber)
                .orElseThrow(() -> new ResourceNotFoundException("Loan", "mobileNumber", mobileNumber));
        LoansDTO loansDTO = LoansMapper.maptoLoansDto(loan, new LoansDTO());
        return loansDTO;
    }

    @Override
    public boolean updateLoan(LoansDTO loansDto) {
        Loans loans = loansRepository.findByMobileNumber(loansDto.getMobileNumber())
                .orElseThrow(() -> new ResourceNotFoundException("Loan", "mobileNumber", loansDto.getMobileNumber()));
        LoansMapper.mapToLoans(loansDto, loans);
        loansRepository.save(loans);
        return true;
    }

    @Override
    public boolean deleteLoan(String mobileNumber) {
        Loans loans = loansRepository.findByMobileNumber(mobileNumber)
                .orElseThrow(() -> new ResourceNotFoundException("Loan", "mobileNumber", mobileNumber));
        loansRepository.delete(loans);
        return true;
    }

    public Loans createNewLoan(String mobileNumber) {
        Loans newLoan = new Loans();
        long randomLoanNumber = 100000000000L + new Random().nextInt(900000000);
        newLoan.setLoanNumber(Long.toString(randomLoanNumber));
        newLoan.setMobileNumber(mobileNumber);
        newLoan.setLoanType(LoansConstants.HOME_LOAN);
        newLoan.setTotalLoan(LoansConstants.NEW_LOAN_LIMIT);
        newLoan.setAmountPaid(0);
        newLoan.setOutstandingAmount(LoansConstants.NEW_LOAN_LIMIT);
        return newLoan;
    }
}
