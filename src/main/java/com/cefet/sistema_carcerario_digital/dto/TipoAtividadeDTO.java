package com.cefet.sistema_carcerario_digital.dto;

import java.util.UUID;

public class TipoAtividadeDTO extends BaseDTO {
    private String nome;
    private String observacoes;

    public TipoAtividadeDTO() {}

    public TipoAtividadeDTO(UUID id, String nome, String observacoes) {
        super(id);
        this.nome = nome;
        this.observacoes = observacoes;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }
}
