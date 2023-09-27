package com.r2ag.alphaquiz.repository;

import com.r2ag.alphaquiz.model.UsoDica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsoDicaRepository extends JpaRepository<UsoDica, Long> {
}
