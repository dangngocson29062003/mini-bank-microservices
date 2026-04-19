package com.sondang.loans.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
public class ResponseDTO {
    private String statusCode;
    private String statusMsg;
}
