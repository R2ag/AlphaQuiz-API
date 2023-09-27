package com.r2ag.alphaquiz.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "video_aula_assistida")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VideoAulaAssistida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime assistidaEm;

    @ManyToOne
    @JoinColumn(name = "video_aula_id")
    private VideoAula videoAula;
}
