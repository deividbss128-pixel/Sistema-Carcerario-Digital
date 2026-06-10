package com.cefet.sistema_carcerario_digital.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class RegistroAtividadeDTO extends BaseDTO {
    private LocalDateTime data;
    private String descricao;
    private Boolean status;
    private UUID tipoId;
    private UUID detentoId;
    private UUID usuarioId;

    public RegistroAtividadeDTO() {}

    public RegistroAtividadeDTO(UUID id, LocalDateTime data, String descricao, Boolean status, UUID tipoId, UUID detentoId, UUID usuarioId) {
        super(id);
        this.data = data;
        this.descricao = descricao;
        this.status = status;
        this.tipoId = tipoId;
        this.detentoId = detentoId;
        this.usuarioId = usuarioId;
    }

    public LocalDateTime getData() { return data; }
    public void setData(LocalDateTime data) { this.data = data; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public Boolean getStatus() { return status; }
    public void setStatus(Boolean status) { this.status = status; }
    public UUID getTipoId() { return tipoId; }
    public void setTipoId(UUID tipoId) { this.tipoId = tipoId; }
    public UUID getDetentoId() { return detentoId; }
    public void setDetentoId(UUID detentoId) { this.detentoId = detentoId; }
    public UUID getUsuarioId() { return usuarioId; }
    public void setUsuarioId(UUID usuarioId) { this.usuarioId = usuarioId; }
}
