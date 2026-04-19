package com.sondang.loans.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoansDTO {

    private String mobileNumber;

    private String loanNumber;

    private String loanType;

    private int totalLoan;

    private int amountPaid;

    private int outstandingAmount;

}
