package org.top.mvc.postgres;

import org.springframework.data.repository.CrudRepository;
import org.top.mvc.entity.Tovar;

public interface TovarRepository extends CrudRepository <Tovar,Integer> {
}
