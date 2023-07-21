package my.project.moneytransferservice.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
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
    private String id;
    @Column(name = "card_from_number")
    private int cardFromNumber;
    @Column(name = "card_to_number")
    private int cardToNumber;
    @Column(name = "card_cvv")
    private int cardCvv;
    @Column(name = "card_from_valid_till")
    private int cardFromValidTill;
    @Column(name = "value")
    private int value;
    @Column(name = "commission")
    private int commissionTranslate;
    @Column(name = "time_transfer")
    private LocalDateTime timeTranslate;
    @Column(name = "translated")
    private boolean isTranslation;
}
