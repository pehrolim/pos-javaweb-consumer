package dev.fujioka.java.avancado.web.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Professor implements Serializable {

    private Integer id;

    private String nome;

    private String email;

}
