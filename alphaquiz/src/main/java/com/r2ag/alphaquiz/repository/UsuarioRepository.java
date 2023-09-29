package com.r2ag.alphaquiz.repository;

import com.r2ag.alphaquiz.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmailAndSenha(String email, String senha);
    Usuario findByEmail(String email);
}
