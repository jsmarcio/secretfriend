package com.uniara.devweb.secretfriend.repository;

import com.uniara.devweb.secretfriend.model.Convidado;
import com.uniara.devweb.secretfriend.model.Evento;
import org.springframework.data.repository.CrudRepository;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {
    Iterable<Convidado> findByEvento(Evento evento);
    Convidado findByNumber(String number);
}
