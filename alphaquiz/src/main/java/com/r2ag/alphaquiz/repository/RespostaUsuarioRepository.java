package com.r2ag.alphaquiz.repository;

import com.r2ag.alphaquiz.model.RespostaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespostaUsuarioRepository extends JpaRepository<RespostaUsuario, Long> {

}
