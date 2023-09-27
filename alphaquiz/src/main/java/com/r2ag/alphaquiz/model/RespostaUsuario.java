package com.r2ag.alphaquiz.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "resposta_usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RespostaUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "pergunta_id")
    private Pergunta pergunta;

    @ManyToOne
    @JoinColumn(name = "opcao_resposta_id")
    private OpcaoResposta opcaoResposta;

    private boolean correto;

    private int pontuacaoObtida;

    private int moedasGanhas;

}
