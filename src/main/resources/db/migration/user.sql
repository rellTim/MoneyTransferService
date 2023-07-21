CREATE TABLE user
(
    id          SERIAL,
    number_card VARCHAR(16) NOT NULL UNIQUE,
    value     DECIMAL(10, 2) DEFAULT 0.00,
    PRIMARY KEY (number_card)
)