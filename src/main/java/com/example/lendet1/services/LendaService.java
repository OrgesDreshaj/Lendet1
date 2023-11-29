package com.example.lendet1.services;

import com.example.lendet1.models.Lenda;

import java.util.List;

public interface LendaService {

    Lenda create(Lenda lenda);

    Lenda update(long id, Lenda lenda);

    void deleteById(long id);

    Lenda findById(long id);

    List<Lenda> findAll();

    void deleteAll();
}
