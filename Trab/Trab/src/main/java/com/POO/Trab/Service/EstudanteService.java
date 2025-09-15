package com.POO.Trab.Service;

import com.POO.Trab.Entitys.Estudante;
import com.POO.Trab.Repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository estudanteRepository;

    public Estudante criarEstudante(Estudante estudante){
    return estudanteRepository.save(estudante);
    }

    public List<Estudante> listarEstudante(){
        return estudanteRepository.findAll();
    }
    public void excluirEstudante(Long id){
        estudanteRepository.deleteById(id);
    }

}
