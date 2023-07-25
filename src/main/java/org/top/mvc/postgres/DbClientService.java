package org.top.mvc.postgres;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.top.mvc.entity.Client;
import org.top.mvc.service.ClientService;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class DbClientService implements ClientService {

    private final ClientRepository clientRepository;

    @Override
    public Client register(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Optional<Client> getById(Integer id) {
        return clientRepository.findById(id);
    }

    @Override
    public Iterable<Client> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        clientRepository.deleteById(id);
    }
}