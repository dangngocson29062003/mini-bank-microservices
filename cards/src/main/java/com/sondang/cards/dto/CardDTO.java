package com.sondang.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
@Schema(
        name = "Card",
        description = "Schema to hold Card information"
)
public class CardDTO {

    @Schema(
            description = "Mobile Number of Customer", example = "0123456789"
    )
    @NotEmpty(message = "MobileNumber can not be null or empty")
    @Pattern(regexp = "^$|[0-9]{10}", message = "MobileNumber must be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Card Number of the customer", example = "100646930341"
    )
    @NotEmpty(message = "CardNumber can not be null or empty")
    @Pattern(regexp = "^&|[0-9]{12}", message = "CardNumber must be 12 digits")
    private String cardNumber;

    @Schema(
            description = "Type of the card", example = "Credit Card"
    )
    @NotEmpty(message = "CardType can not be null or empty")
    private String cardType;

    @Positive(message = "Total card limit should be greater than zero")
    @Schema(
            description = "Total amount limit available against a card", example = "100000"
    )
    private int totalLimit;

    @PositiveOrZero(message = "Total amount used should be equal or greater than zero")
    @Schema(
            description = "Total amount used by a Customer", example = "1000"
    )
    private int amountUsed;

    @PositiveOrZero(message = "Total available amount should be equal or greater than zero")
    @Schema(
            description = "Total available amount against a card", example = "90000"
    )
    private int availableAmount;
}
