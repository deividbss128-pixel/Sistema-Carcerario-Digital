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
    private LocalDateTime dataRegistro; 

    @Column(nullable = false, length = 200)
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "tipo_atividade_id", nullable = false)
    private UUID tipo_id;

    @ManyToOne
    @JoinColumn(name = "pena_id", nullable = false)
    private UUID pena_id;// o detento

    // verificar se deixamos ou se tiramos depois !
    @ManyToOne
    @JoinColumn(name = "pessoa_id", nullable = false)
    private UUID pessoa_id;// agente que registrou a pena

    public RegistroAtividade() {
    }

    public RegistroAtividade(UUID id, LocalDateTime dataRegistro, String descricao, UUID tipo_id, UUID pena_id,
            UUID pessoa_id) {
        this.id = id;
        this.dataRegistro = dataRegistro;
        this.descricao = descricao;
        this.tipo_id = tipo_id;
        this.pena_id = pena_id;
        this.pessoa_id = pessoa_id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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
        return tipo_id;
    }

    public void setTipoId(UUID tipo_id) {
        this.tipo_id = tipo_id;
    }

    public UUID getPenaId() {
        return pena_id;
    }

    public void setPenaId(UUID pena_id) {
        this.pena_id = pena_id;
    }

    public UUID getPessoaId() {
        return pessoa_id;
    }

    public void setPessoaId(UUID pessoa_id) {
        this.pessoa_id = pessoa_id;
    }
}
