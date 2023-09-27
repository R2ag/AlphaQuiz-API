package com.r2ag.alphaquiz.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "progresso_meta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProgressoMeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "meta_id")
    private Meta meta;

    @OneToMany(mappedBy = "progresso_meta", cascade = CascadeType.ALL)
    private List<ProgressoHabilidade> habilidadesAdquiridas;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private LocalDateTime adquiridaEm;
}
