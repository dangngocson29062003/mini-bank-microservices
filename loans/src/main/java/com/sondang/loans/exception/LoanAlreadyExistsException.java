package com.sondang.loans.exception;

public class LoanAlreadyExistsException extends RuntimeException{
    public LoanAlreadyExistsException(String msg) {
        super(msg);
    }
}
