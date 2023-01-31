package dev.fujioka.java.avancado.web.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Disciplina implements Serializable {

    private Integer id;

    private String nome;

    private String cargaHoraria;

    private String professor;

    private String statusDisciplina;

    private String observacao;

}
