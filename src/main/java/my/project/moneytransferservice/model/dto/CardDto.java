package my.project.moneytransferservice.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder(toBuilder = true)
public class CardDto {
    private String operationId;
    @Pattern(regexp = "^\\d{16}$")
    @NotBlank
    private String cardFromNumber;
    @Pattern(regexp = "^\\d{16}$")
    @NotBlank
    private String cardToNumber;
    @NotBlank
    @Pattern(regexp = "^\\d{3}$")
    private String cardCvv;
    @Pattern(regexp = "^\\d{4}$")
    private String cardFromValidTill;
    private int value;
    private int commissionTranslate;
    private String currency;
    private LocalDateTime timeTranslate;
    private boolean isTranslation;
    private Amount amount;
}
