package com.r2ag.alphaquiz.repository;

import com.r2ag.alphaquiz.model.Meta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetaRepository extends JpaRepository<Meta, Long> {

}
