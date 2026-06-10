package com.cefet.sistema_carcerario_digital.dto;

import java.util.UUID;

public class TipoOcorrenciaDTO extends BaseDTO {
    private String nome;

    public TipoOcorrenciaDTO() {}

    public TipoOcorrenciaDTO(UUID id, String nome) {
        super(id);
        this.nome = nome;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}
