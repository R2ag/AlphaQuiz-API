package com.r2ag.alphaquiz.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "progresso_habilidade")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProgressoHabilidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "habilidade_id")
    private Habilidade habilidade;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private int pontuacao;

    private LocalDateTime adquiridaEm;
}
