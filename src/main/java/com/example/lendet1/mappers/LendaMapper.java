package com.example.lendet1.mappers;


import com.example.lendet1.dtos.LendaDto;
import com.example.lendet1.models.Lenda;
import org.springframework.stereotype.Component;

@Component
public class LendaMapper {

    public Lenda toLenda(LendaDto dto){
        Lenda lenda = new Lenda();

        lenda.setId(dto.getId());
        lenda.setEmri(dto.getEmri());
        lenda.setKlasa(dto.getKlasa());
        lenda.setKreditat(dto.getKreditat());
        lenda.setPershkrimi(dto.getPershkrimi());
        lenda.setProfesori(dto.getProfesori());
        lenda.setSemestri(dto.getSemestri());

        return lenda;
    }

    public LendaDto toDto(Lenda lenda){
        LendaDto dto = new LendaDto();

        dto.setId(lenda.getId());
        dto.setEmri(lenda.getEmri());
        dto.setKlasa(lenda.getKlasa());
        dto.setKreditat(lenda.getKreditat());
        dto.setPershkrimi(lenda.getPershkrimi());
        dto.setProfesori(lenda.getProfesori());
        dto.setSemestri(lenda.getSemestri());

        return dto;
    }
}
