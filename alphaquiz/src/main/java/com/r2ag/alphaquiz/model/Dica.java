package com.r2ag.alphaquiz.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "dica")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String texto;
    private int custoMoedas;

    @ManyToOne
    @JoinColumn(name = "pergunta_id")
    private Pergunta pergunta;


}
