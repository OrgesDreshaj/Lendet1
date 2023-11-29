package com.example.lendet1.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LendaDto {

    private long id;
    private String emri;
    private int kreditat;
    private String profesori;
    private int klasa;
    private String pershkrimi;
    private int semestri;
}
