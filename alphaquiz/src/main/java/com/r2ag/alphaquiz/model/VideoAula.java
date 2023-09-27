package com.r2ag.alphaquiz.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "video_aula")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VideoAula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "habilidade_id")
    private Habilidade habilidade;

    private String titulo;

    private String url;

    private int valorMoedas;

}
