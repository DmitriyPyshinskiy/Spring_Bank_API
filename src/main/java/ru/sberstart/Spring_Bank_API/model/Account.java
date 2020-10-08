package ru.sberstart.Spring_Bank_API.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private Long id;
    private String name;
    private List<Card> cards = new ArrayList<>();
}
