package com.r2ag.alphaquiz.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Habilidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int pontuacaoNecessaria;

    @OneToMany(mappedBy = "habilidade", cascade = CascadeType.ALL)
    private List<Pergunta> perguntas;

    @OneToMany(mappedBy = "habilidade", cascade = CascadeType.ALL)
    private List<VideoAula> videoAulas;
}
