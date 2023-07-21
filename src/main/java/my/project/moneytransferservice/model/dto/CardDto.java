package my.project.moneytransferservice.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CardDto {
    @Pattern(regexp = "^\\d{16}$")
    @NotBlank
    private int fromNumberCard;
    @Pattern(regexp = "^\\d{16}$")
    @NotBlank
    private int toNumberCard;
    @NotBlank
    @Pattern(regexp = "^\\d{3}$")
    private int cardCVV;
    @Pattern(regexp = "^\\d{4}$")
    @NotBlank
    private int validData;
    @NotBlank
    @Size(min = 1, max = 1_000_000_000)
    private int countTranslate;
    private int commissionTranslate;
    private LocalDateTime timeTranslate;
    private boolean isTranslation;
}
