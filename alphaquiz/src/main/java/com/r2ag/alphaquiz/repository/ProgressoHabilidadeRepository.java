package com.r2ag.alphaquiz.repository;

import com.r2ag.alphaquiz.model.ProgressoHabilidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgressoHabilidadeRepository extends JpaRepository<ProgressoHabilidade, Long> {
}
