package com.r2ag.alphaquiz.repository;

import com.r2ag.alphaquiz.model.ProgressoMeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgressoMetaRepository extends JpaRepository<ProgressoMeta, Long> {

}
