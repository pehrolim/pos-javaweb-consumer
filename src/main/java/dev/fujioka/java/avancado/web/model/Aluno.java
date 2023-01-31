package dev.fujioka.java.avancado.web.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
public class Aluno implements Serializable {

    private static final long  serialVersionUID = 1L;

    private Integer id;

    private String nome;

    private String matricula;

    private String curso;


}