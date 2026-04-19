package com.sondang.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Account",
        description = "Schema to hold Account information"
)
public class AccountsDTO {

    @Schema(
            description = "Account number of MiniBank account",
            example = "0123456789"
    )
    @NotEmpty(message = "AccountNumber can not be null or empty")
    @Pattern(regexp = "^[0-9]{10}", message = "AccountNumber must be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account type of MiniBank account",
            example = "Savings"
    )
    @NotEmpty(message = "AccountType can not be null or empty")
    private String accountType;

    @Schema(
            description = "MiniBank branch address",
            example = "123 ABC"
    )
    @NotEmpty(message = "BranchAddress can not be null or empty")
    private String branchAddress;
}
