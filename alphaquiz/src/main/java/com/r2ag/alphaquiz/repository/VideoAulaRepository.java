package com.r2ag.alphaquiz.repository;

import com.r2ag.alphaquiz.model.VideoAula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoAulaRepository extends JpaRepository<VideoAula, Long> {
}
