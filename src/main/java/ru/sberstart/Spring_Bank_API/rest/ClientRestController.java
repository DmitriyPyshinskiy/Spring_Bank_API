package ru.sberstart.Spring_Bank_API.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sberstart.Spring_Bank_API.model.Client;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/clients")
public class ClientRestController {
    private List<Client> CLIENTS = Stream.of(
            new Client(1L, "dimasik", "dimasik", "Dmitriy", "Pyshinskiy", null),
            new Client(2L, "artemka", "artemka", "Artem", "Kostromin", null),
            new Client(3L, "pavlosik", "pavlosik", "Pavel", "Pyshinskiy", null)
    ).collect(Collectors.toList());

    @GetMapping
    public List<Client> getAll() {
        return CLIENTS;
    }

    @GetMapping("/{id}")
    public Client getOneById(@PathVariable Long id) {
        return CLIENTS.stream().filter(developer -> developer.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
