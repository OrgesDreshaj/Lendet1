package com.example.lendet1.services.impl;

import com.example.lendet1.models.Lenda;
import com.example.lendet1.repositories.LendaRepository;
import com.example.lendet1.services.LendaService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LendaServiceImpl implements LendaService {

    private final LendaRepository repository;

    public LendaServiceImpl(LendaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Lenda create(Lenda lenda) {
        if (lenda.getKlasa()%2==0) lenda.setOrari("A.M");
        else lenda.setOrari("P.M");
        repository.save(lenda);
        return lenda;
    }

    @Override
    public Lenda update(long id, Lenda lenda) {
        var oldLenda = findById(id);
        if (oldLenda!=null){
            oldLenda.setId(lenda.getId());
            oldLenda.setEmri(lenda.getEmri());
            oldLenda.setKlasa(lenda.getKlasa());
            oldLenda.setKreditat(lenda.getKreditat());
            oldLenda.setPershkrimi(lenda.getPershkrimi());
            oldLenda.setProfesori(lenda.getProfesori());
            oldLenda.setSemestri(lenda.getSemestri());

            create(oldLenda);
        }
        return oldLenda;
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public Lenda findById(long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Lenda> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }
}
