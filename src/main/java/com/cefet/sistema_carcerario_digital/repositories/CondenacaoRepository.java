package com.cefet.sistema_carcerario_digital.repositories;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cefet.sistema_carcerario_digital.entities.Condenacao;

public interface CondenacaoRepository extends JpaRepository<Condenacao, UUID> {

    boolean existsByDataEntrada(LocalDateTime dataEntrada);

    boolean existsByPessoa(UUID pessoaId);

}
