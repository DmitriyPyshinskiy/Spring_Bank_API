package ru.sberstart.Spring_Bank_API.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private Long id;
    private String number;
    private BigDecimal balance;
}
