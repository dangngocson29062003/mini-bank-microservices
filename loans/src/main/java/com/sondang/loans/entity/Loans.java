package com.sondang.loans.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Loans extends BaseEntity{

    @Id
    @Column(name = "loan_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanId;

    @Column
    private String mobileNumber;

    @Column
    private String loanNumber;

    @Column
    private String loanType;

    @Column
    private int totalLoan;

    @Column
    private int amountPaid;

    @Column
    private int outstandingAmount;

}
