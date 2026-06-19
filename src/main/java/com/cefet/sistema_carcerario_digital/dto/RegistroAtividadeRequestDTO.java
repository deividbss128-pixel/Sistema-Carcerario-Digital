package com.cefet.sistema_carcerario_digital.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotBlank;

public class RegistroAtividadeRequestDTO extends BaseDTO {

    @NotBlank(message = "O campo 'dataRegistro' é obrigatório.")
    private LocalDateTime dataRegistro;

    private String descricao;

    @NotBlank(message = "O campo 'tipoId' é obrigatório.")
    private UUID tipoId;

    @NotBlank(message = "O campo 'condenacaoId' é obrigatório.")
    private UUID condenacaoId;

    @NotBlank(message = "O campo 'pessoaId' é obrigatório.")
    private UUID pessoaId;

    public RegistroAtividadeRequestDTO() {
    }

    public RegistroAtividadeRequestDTO(UUID id, LocalDateTime dataRegistro, String descricao, Boolean status,
            UUID tipoId, UUID condenacaoId, UUID pessoaId) {
        super(id);
        this.dataRegistro = dataRegistro;
        this.descricao = descricao;
        this.tipoId = tipoId;
        this.condenacaoId = condenacaoId;
        this.pessoaId = pessoaId;
    }

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public UUID getTipoId() {
        return tipoId;
    }

    public void setTipoId(UUID tipoId) {
        this.tipoId = tipoId;
    }

    public UUID getCondenacaoId() {
        return condenacaoId;
    }

    public void setCondenacaoId(UUID condenacaoId) {
        this.condenacaoId = condenacaoId;
    }

    public UUID getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(UUID pessoaId) {
        this.pessoaId = pessoaId;
    }
}
