package com.sondang.loans.mapper;

import com.sondang.loans.dto.LoansDTO;
import com.sondang.loans.entity.Loans;

public class LoansMapper {

    public static LoansDTO maptoLoansDto (Loans loans, LoansDTO loansDTO) {
        loansDTO.setMobileNumber(loans.getMobileNumber());
        loansDTO.setLoanNumber(loans.getLoanNumber());
        loansDTO.setLoanType(loans.getLoanType());
        loansDTO.setTotalLoan(loans.getTotalLoan());
        loansDTO.setAmountPaid(loans.getAmountPaid());
        loansDTO.setOutstandingAmount(loansDTO.getOutstandingAmount());
        return loansDTO;
    }

    public static Loans mapToLoans(LoansDTO loansDTO, Loans loans) {
        loans.setMobileNumber(loansDTO.getMobileNumber());
        loans.setLoanNumber(loansDTO.getLoanNumber());
        loans.setLoanType(loansDTO.getLoanType());
        loans.setTotalLoan(loansDTO.getTotalLoan());
        loans.setAmountPaid(loansDTO.getAmountPaid());
        loans.setOutstandingAmount(loansDTO.getOutstandingAmount());
        return loans;
    }
}
