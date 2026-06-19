package com.cefet.sistema_carcerario_digital.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import com.cefet.sistema_carcerario_digital.entities.Condenacao;
import com.cefet.sistema_carcerario_digital.entities.StatusDetento;

public class CondenacaoResponseDTO {

    private String descricao;
    private LocalDateTime dataEntrada, dataSaida;
    private StatusDetento situacao;
    private UUID pessoaId;

    public CondenacaoResponseDTO(Condenacao entity) {
        this.descricao = entity.getDescricao();
        this.dataEntrada = entity.getDataEntrada();
        this.dataSaida = entity.getDataSaida();
        this.pessoaId = entity.getPessoaId();
        this.situacao = entity.getSituacao();
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getDataEntrada() {
        return dataEntrada;
    }

    public LocalDateTime getDataSaida() {
        return dataSaida;
    }

    public StatusDetento getSituacao() {
        return situacao;
    }

    public UUID getPessoaId() {
        return pessoaId;
    }
}
