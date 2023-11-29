package com.example.lendet1.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Lenda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String emri;
    private int kreditat;
    private String profesori;
    private String  orari;
    private int klasa;
    private String pershkrimi;
    private int semestri;
}
