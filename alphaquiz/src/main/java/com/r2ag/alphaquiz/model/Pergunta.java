package com.r2ag.alphaquiz.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "pergunta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pergunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private int valorPontos;
    private int valorMoedas;

    @ManyToOne
    @JoinColumn(name = "habilidade_id")
    private Habilidade habilidade;

    @OneToMany(mappedBy = "pergunta", cascade = CascadeType.ALL)
    private List<OpcaoResposta> opcaoResposta;

    @OneToMany(mappedBy = "pergunta", cascade = CascadeType.ALL)
    private List<RespostaUsuario> respostasUsuario;

    @OneToMany(mappedBy = "pergunta", cascade = CascadeType.ALL)
    private List<Dica> dicas;

    @ManyToOne
    @JoinColumn(name = "video_aula_id")
    private VideoAula videoAula;
}
