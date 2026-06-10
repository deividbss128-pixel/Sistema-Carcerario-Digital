package com.cefet.sistema_carcerario_digital.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class OcorrenciaDTO extends BaseDTO {
    private LocalDateTime data;
    private String descricao;
    private UUID tipoId;
    private UUID usuarioId;

    public OcorrenciaDTO() {}

    public OcorrenciaDTO(UUID id, LocalDateTime data, String descricao, UUID tipoId, UUID usuarioId) {
        super(id);
        this.data = data;
        this.descricao = descricao;
        this.tipoId = tipoId;
        this.usuarioId = usuarioId;
    }

    public LocalDateTime getData() { return data; }
    public void setData(LocalDateTime data) { this.data = data; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public UUID getTipoId() { return tipoId; }
    public void setTipoId(UUID tipoId) { this.tipoId = tipoId; }
    public UUID getUsuarioId() { return usuarioId; }
    public void setUsuarioId(UUID usuarioId) { this.usuarioId = usuarioId; }
}
