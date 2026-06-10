package com.cefet.sistema_carcerario_digital.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_registro_atividade")
public class RegistroAtividade {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "BINARY(16)", updatable = false, nullable = false)
    private UUID id;

    @Column(nullable = false)
    private LocalDateTime data; // LocalDateTime pega a data e a hora
    // LocalDateTime.of(ano, mes, dia, hora, min)

    @Column(nullable = false, length = 200)
    private String descricao;

    @Column(nullable = false)
    private Boolean status; // vai precisar ou pode deixar sem ?

    @ManyToOne
    @JoinColumn(name = "tipo_atividade_id", nullable = false)
    private TipoAtividade tipo;

    @ManyToOne
    @JoinColumn(name = "detento_id", nullable = false)
    private Detento detendo;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    public RegistroAtividade() {
    }

    public RegistroAtividade(UUID id, LocalDateTime data, String descricao, Boolean status, TipoAtividade tipo, Detento detendo,
            Usuario usuario) {
        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.status = status;
        this.tipo = tipo;
        this.detendo = detendo;
        this.usuario = usuario;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public TipoAtividade getTipo() {
        return tipo;
    }

    public void setTipo(TipoAtividade tipo) {
        this.tipo = tipo;
    }

    public Detento getDetendo() {
        return detendo;
    }

    public void setDetendo(Detento detendo) {
        this.detendo = detendo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


}
