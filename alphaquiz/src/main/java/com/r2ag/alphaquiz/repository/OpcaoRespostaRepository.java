package com.r2ag.alphaquiz.repository;

import com.r2ag.alphaquiz.model.OpcaoResposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpcaoRespostaRepository extends JpaRepository<OpcaoResposta, Long> {
}
