package com.r2ag.alphaquiz.service;

import com.r2ag.alphaquiz.model.Dica;
import com.r2ag.alphaquiz.repository.DicaRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DicaService {
    final DicaRepository dicaRepository;

    public DicaService(DicaRepository dicaRepository){
        this.dicaRepository = dicaRepository;
    }

    @Transactional
    public Dica save(Dica dica){
        return dicaRepository.save(dica);
    }

    public Page<Dica> findAll(Pageable page){
        return dicaRepository.findAll(page);
    }

    public Dica obterDica(Long perguntaId, Long usuarioId){
        //Verificar Dicas para a pergunta
        //Verificar Dicas utilizadas para a pergunta
        //Selecionar a primeira dica ainda não utilizada
        //Verificar Saldo do Usuario
        //Se o usuario tiver saldo, responder a proxima dica disponivel
        //Atualizar saldo do usuario

    }

    @Transactional
    public void delete(Dica dica){
        dicaRepository.delete(dica);
    }
}
