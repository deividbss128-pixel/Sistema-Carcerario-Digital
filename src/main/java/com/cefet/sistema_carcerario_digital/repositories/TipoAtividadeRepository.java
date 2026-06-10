package com.cefet.sistema_carcerario_digital.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cefet.sistema_carcerario_digital.entities.TipoAtividade;

public interface TipoAtividadeRepository extends JpaRepository<TipoAtividade, UUID> {

}
