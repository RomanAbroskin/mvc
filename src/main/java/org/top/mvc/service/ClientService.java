package org.top.mvc.service;

import org.springframework.stereotype.Service;
import org.top.mvc.entity.Client;


import java.util.Optional;


@Service
public interface ClientService {
    Client register(Client client);  // регистрация клиента
    Optional<Client> getById(Integer id);     // получить клиента по id
    Iterable<Client> getAll();      // получить всех клиентов
    void deleteById(Integer id);                  // удалить клиента
}