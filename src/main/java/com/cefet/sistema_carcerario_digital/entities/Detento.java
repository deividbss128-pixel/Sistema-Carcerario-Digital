package com.cefet.sistema_carcerario_digital.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_detento")
public class Detento {
	@Id
	@GeneratedValue
	@Column(columnDefinition = "BINARY(16)", updatable = false, nullable = false)
	private UUID id;

	@Column(nullable = false, length = 150)
	private String nome;

	@Column(nullable = false)
	private LocalDate dataNasc;// (Service) inserção manual
	// LocalDate.of(ano, mes, dia)

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private StatusDetento status;

	@Column(nullable = false)
	private LocalDateTime dataEntrada; // (Service) usamos o LocalDateTime.now()

	// CONFERIR DEPOIS SE VAMOS DEIXAR

	@Column(nullable = false, length = 9)
	private String matricula;// usamos um modelo(2024-0001) ou deixamos só o ID para identificação

	@Column(nullable = false, length = 150)
	private String bloco;

	@Column(nullable = false)
	private Integer cela;

	@ManyToMany
	@JoinTable(
		name = "tb_ocorrencia_detento", 
		joinColumns = @JoinColumn(name = "detento_id"), 
		inverseJoinColumns = @JoinColumn(name = "ocorrencia_id")
	)
	private List<Ocorrencia> ocorrencias; // tabela N:N de detentos e ocorrencias
	// coloquei aqui pois precisamos listar as ocorrencias de um detento na
	// funcionalidade (Histórico do Detento)

	public Detento() {
	}

	public Detento(UUID id, String nome, LocalDate dataNasc, StatusDetento status, LocalDateTime dataEntrada,
			String matricula, String bloco, Integer cela, List<Ocorrencia> ocorrencias) {
		this.id = id;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.status = status;
		this.dataEntrada = dataEntrada;
		this.matricula = matricula;
		this.bloco = bloco;
		this.cela = cela;
		this.ocorrencias = ocorrencias;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public StatusDetento getStatus() {
		return status;
	}

	public void setStatus(StatusDetento status) {
		this.status = status;
	}

	public LocalDateTime getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDateTime dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

	public Integer getCela() {
		return cela;
	}

	public void setCela(Integer cela) {
		this.cela = cela;
	}

	public List<Ocorrencia> getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(List<Ocorrencia> ocorrencias) {
		this.ocorrencias = ocorrencias;
	}
}
