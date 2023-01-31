package dev.fujioka.java.avancado.web.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Curso  implements Serializable {

    private Integer id;

    private String nome;

    private String descricao;

}
