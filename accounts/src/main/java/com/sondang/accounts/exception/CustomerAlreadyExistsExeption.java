package com.sondang.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CustomerAlreadyExistsExeption extends RuntimeException{
    public CustomerAlreadyExistsExeption(String msg) {
        super(msg);
    }
}
