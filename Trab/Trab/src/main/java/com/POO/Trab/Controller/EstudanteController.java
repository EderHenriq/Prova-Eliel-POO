package com.POO.Trab.Controller;


import com.POO.Trab.Entitys.Estudante;
import com.POO.Trab.Repository.EstudanteRepository;
import com.POO.Trab.Service.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/prova")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @GetMapping
    public List<Estudante> listarEstudante() {
        return estudanteService.listarEstudante();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirEstudante(@PathVariable Long id) {
        estudanteService.excluirEstudante(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<Estudante> criarEstudante(@RequestBody Estudante estudante) {
        Estudante novoEstudante = estudanteService.criarEstudante(estudante);
        return new ResponseEntity<>(novoEstudante, HttpStatus.CREATED);
    }

}
