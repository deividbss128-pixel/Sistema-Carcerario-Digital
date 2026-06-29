package com.cefet.sistema_carcerario_digital.dto;

import java.time.LocalDateTime;
import com.cefet.sistema_carcerario_digital.entities.RegistroAtividade;
// import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class RegistroAtividadeResponseDTO {
    private LocalDateTime dataRegistro;
    private String descricao;
    private Long tipoId;
    private Long condenacaoId;
    private Long pessoaId;

    // @JsonPropertyOrder({ "id", "nome", "cpf" }) ajustar
    public RegistroAtividadeResponseDTO(RegistroAtividade entity) {
        this.dataRegistro = entity.getDataRegistro();
        this.descricao = entity.getDescricao();
        this.condenacaoId = entity.getCondenacaoId();
        this.tipoId = entity.getTipoId();
    }

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public String getDescricao() {
        return descricao;
    }

    public Long getCondenacaoId() {
        return condenacaoId;
    }

    public Long getPessoaId() {
        return pessoaId;
    }

    public Long getTipoId() {
        return tipoId;
    }
}
