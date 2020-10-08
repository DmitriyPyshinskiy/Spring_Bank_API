package ru.sberstart.Spring_Bank_API.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    private Long id;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private List<Account> accounts = new ArrayList<>();
}
