package org.top.mvc.service;

import org.top.mvc.entity.Tovar;

import java.util.Optional;

public interface TovarService {
    Tovar register(Tovar tovar);

    Iterable<Tovar> getAll();

    Optional<Tovar> getById(Integer id);

    void deleteById(Integer id);
}
