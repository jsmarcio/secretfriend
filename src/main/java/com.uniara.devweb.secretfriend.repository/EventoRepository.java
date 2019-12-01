package com.uniara.devweb.secretfriend.repository;

import com.uniara.devweb.secretfriend.model.Evento;
import org.springframework.data.repository.CrudRepository;

public interface EventoRepository extends CrudRepository<Evento, String> {

    Evento findByCodigo(long codigo);
}
