package com.example.lendet1.controllers;

import com.example.lendet1.dtos.LendaDto;
import com.example.lendet1.mappers.LendaMapper;
import com.example.lendet1.models.Lenda;
import com.example.lendet1.services.LendaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lenda")
public class LendaController {

    private final LendaService service;
    private final LendaMapper mapper;

    public LendaController(LendaService service, LendaMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }


    @GetMapping
    public List<LendaDto> findAll() {
        return service.findAll().stream().map(mapper::toDto).toList();
    }


    @GetMapping("/{id}")
    public LendaDto findById(@PathVariable long id) {
        return mapper.toDto(service.findById(id));
    }

    @PostMapping
    public void create(@RequestBody LendaDto dto) {
        mapper.toDto(service.create(mapper.toLenda(dto)));
    }


    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id){
        service.deleteById(id);
    }


    @DeleteMapping
    public void deleteAll(){
        service.deleteAll();
    }


    @PutMapping("/{id}")
    public void update(@PathVariable long id, @RequestBody LendaDto dto){
        mapper.toDto(service.update(id,mapper.toLenda(dto)));
    }







}
