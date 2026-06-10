package com.cefet.sistema_carcerario_digital.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import com.cefet.sistema_carcerario_digital.entities.StatusDetento;

public class DetentoDTO extends BaseDTO {
    private String nome;
    private LocalDate dataNasc;
    private StatusDetento status;
    private LocalDateTime dataEntrada;
    private String matricula;
    private String bloco;
    private Integer cela;

    public DetentoDTO() {}

    public DetentoDTO(UUID id, String nome, LocalDate dataNasc, StatusDetento status, LocalDateTime dataEntrada,
                     String matricula, String bloco, Integer cela) {
        super(id);
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.status = status;
        this.dataEntrada = dataEntrada;
        this.matricula = matricula;
        this.bloco = bloco;
        this.cela = cela;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public LocalDate getDataNasc() { return dataNasc; }
    public void setDataNasc(LocalDate dataNasc) { this.dataNasc = dataNasc; }
    public StatusDetento getStatus() { return status; }
    public void setStatus(StatusDetento status) { this.status = status; }
    public LocalDateTime getDataEntrada() { return dataEntrada; }
    public void setDataEntrada(LocalDateTime dataEntrada) { this.dataEntrada = dataEntrada; }
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public String getBloco() { return bloco; }
    public void setBloco(String bloco) { this.bloco = bloco; }
    public Integer getCela() { return cela; }
    public void setCela(Integer cela) { this.cela = cela; }
}
