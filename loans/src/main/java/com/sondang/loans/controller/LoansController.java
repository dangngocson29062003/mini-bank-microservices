package com.sondang.loans.controller;

import com.sondang.loans.constant.LoansConstants;
import com.sondang.loans.dto.LoansDTO;
import com.sondang.loans.dto.ResponseDTO;
import com.sondang.loans.service.ILoansService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/loans", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class LoansController {

    private final ILoansService iLoansService;

    @PostMapping
    public ResponseEntity<ResponseDTO> createLoan(@RequestParam String mobileNumber) {
        iLoansService.createLoan(mobileNumber);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDTO(LoansConstants.STATUS_201,
                        LoansConstants.MESSAGE_201));
    }

    @GetMapping
    public ResponseEntity<LoansDTO> fetchLoanDetails(@RequestParam String mobileNumber) {
        LoansDTO loansDTO = iLoansService.fetchLoan(mobileNumber);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(loansDTO);
    }

    @PutMapping
    public ResponseEntity<ResponseDTO> updateLoanDetails(@RequestBody LoansDTO loansDTO) {
        boolean isUpdated = iLoansService.updateLoan(loansDTO);
        if(isUpdated) {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(new ResponseDTO(LoansConstants.STATUS_200,
                            LoansConstants.MESSAGE_200));
        }else {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(new ResponseDTO(LoansConstants.STATUS_417,
                            LoansConstants.MESSAGE_417_UPDATE));
        }
    }

    @DeleteMapping
    public ResponseEntity<ResponseDTO> deleteLoanDetails(@RequestParam String mobileNumber) {
        boolean isDeleted = iLoansService.deleteLoan(mobileNumber);
        if(isDeleted) {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(new ResponseDTO(LoansConstants.STATUS_200,
                            LoansConstants.MESSAGE_200));
        }else {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(new ResponseDTO(LoansConstants.STATUS_417,
                            LoansConstants.MESSAGE_417_DELETE));
        }
    }
}
