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
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private int pontos;
    private int moedas;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<RespostaUsuario> respostasUsuario;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<VideoAulaAssistida> videoAulasAssistidas;

}
