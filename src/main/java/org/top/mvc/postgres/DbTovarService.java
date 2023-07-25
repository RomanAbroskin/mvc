package org.top.mvc.postgres;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.top.mvc.entity.Tovar;
import org.top.mvc.service.TovarService;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DbTovarService implements TovarService {

    private final TovarRepository tovarRepository;
    @Override
    public Tovar register(Tovar tovar) {
        return tovarRepository.save(tovar);
    }
    public Optional<Tovar> getById(Integer id) {
        return tovarRepository.findById(id);
    }
    @Override
    public Iterable<Tovar> getAll() {
        return tovarRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) { tovarRepository.deleteById(id);

    }
}
