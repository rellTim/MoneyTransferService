CREATE TABLE transfer
(
    id                   SERIAL PRIMARY KEY,
    card_from_number     VARCHAR(16) NOT NULL UNIQUE,
    card_cvv             VARCHAR(3)  NOT NULL,
    card_from_valid_till VARCHAR(4)  NOT NULL,
    card_to_number       VARCHAR(16) NOT NULL,
    value                DECIMAL(10, 2)       DEFAULT 0.00,
    commission           DECIMAL(8, 2)        DEFAULT 0.00,
    time_transfer        TIMESTAMP,
    translated           BOOLEAN     NOT NULL DEFAULT FALSE,
    FOREIGN KEY (card_from_number) REFERENCES user (number_card),
    FOREIGN KEY (card_to_number) REFERENCES user (number_card)
);