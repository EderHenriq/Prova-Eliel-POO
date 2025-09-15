package com.POO.Trab.Repository;

import com.POO.Trab.Entitys.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Estudante, Long> {
}
