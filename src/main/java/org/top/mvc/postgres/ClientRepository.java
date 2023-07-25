package org.top.mvc.postgres;

import org.springframework.data.repository.CrudRepository;
import org.top.mvc.entity.Client;

public interface ClientRepository extends CrudRepository<Client, Integer> {
}
