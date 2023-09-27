package com.r2ag.alphaquiz.repository;

import com.r2ag.alphaquiz.model.VideoAulaAssistida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoAulaAssistidaRepository extends JpaRepository<VideoAulaAssistida, Long> {
}
