package my.project.moneytransferservice.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transfer")
public class CardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "operation_id")
    private String operationId;
    @Column(name = "card_from_number")
    private String cardFromNumber;
    @Column(name = "card_to_number")
    private String cardToNumber;
    @Column(name = "card_cvv")
    private String cardCvv;
    @Column(name = "card_from_valid_till")
    private String cardFromValidTill;
    @Column(name = "value")
    private int value;
    @Column(name = "commission")
    private int commissionTranslate;
    @Column(name = "currency")
    private String currency;
    @Column(name = "time_transfer")
    private LocalDateTime timeTranslate;
    @Column(name = "translated")
    private boolean isTranslation;
}
