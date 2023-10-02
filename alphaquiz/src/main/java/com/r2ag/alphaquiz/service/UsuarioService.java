package com.r2ag.alphaquiz.service;

import com.r2ag.alphaquiz.model.Usuario;
import com.r2ag.alphaquiz.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    final
    UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Transactional
    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Page<Usuario> findAll(Pageable page){
        return usuarioRepository.findAll(page);
    }

    public Optional<Usuario> findById(Long id){
        return usuarioRepository.findById(id);
    }

    public Optional<Usuario> findByEmail(String email){
        return Optional.ofNullable(usuarioRepository.findByEmail(email));
    }

    public Optional<Usuario> findByEmailAndSenha(String email, String senha){
        return Optional.ofNullable(usuarioRepository.findByEmailAndSenha(email, senha));
    }
    @Transactional
    public void delete(Usuario usuario){
        usuarioRepository.delete(usuario);
    }

    public int verificarSaldo(Long id){
        //Buscar o saldo do usuario;
    }

    public void atualizarSaldo(Long id, int valor){
        //Atualizar o saldo do usuario a partir do valor recebido;
    }

}
