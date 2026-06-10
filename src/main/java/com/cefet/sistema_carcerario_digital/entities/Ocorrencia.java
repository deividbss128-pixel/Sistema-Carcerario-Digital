package com.cefet.sistema_carcerario_digital.entities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_ocorrencia")
public class Ocorrencia {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "BINARY(16)", updatable = false, nullable = false)
    private UUID id;

    @Column(nullable = false)
    // a IA deu a ideia de separar a hora da ocorrencia
    // da hora em que ela foi registrada no sistema
    private LocalDateTime data;
    // Podemos fazer um esquema baseado nisso para termos os campos de data e hora
    // no front:
    // LocalDate date = LocalDate.of(year, month, dayOfMonth);
    // LocalTime time = LocalTime.of(hour, minute);
    // return new LocalDateTime(date, time);

    @Column(nullable = false, length = 200)
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "tipo_ocorrencia_id", nullable = false)
    private TipoOcorrencia tipo;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToMany(mappedBy = "ocorrencias")
    private List<Detento> detentos; // ESTÁ CORRETO ?

    public Ocorrencia() {
    }

    // QUAL DOS DOIS FICA, OU PRECISAMOS DOS DOIS CONSTRUTURES?
    public Ocorrencia(UUID id, LocalDateTime data, String descricao, TipoOcorrencia tipo,
            Usuario usuario, List<Detento> detentos) {
        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.tipo = tipo;
        this.usuario = usuario;
        this.detentos = detentos;
    }

    public Ocorrencia(UUID id, LocalDateTime data, String descricao, TipoOcorrencia tipo, Usuario usuario) {
        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.tipo = tipo;
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

    public TipoOcorrencia getTipo() {
        return tipo;
    }

    public void setTipo(TipoOcorrencia tipo) {
        this.tipo = tipo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Detento> getDetentos() {
        return detentos;
    }

    public void setDetentos(List<Detento> detentos) {
        this.detentos = detentos;
    }
}
