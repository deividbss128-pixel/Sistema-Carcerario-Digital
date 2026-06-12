package com.cefet.sistema_carcerario_digital.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pessoa")
public class Pessoa {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "BINARY(16)", updatable = false, nullable = false)
    private UUID id;

    @Column(nullable = false, length = 150)
    private String nome;

    @Column(nullable = false, unique = true, length = 14)
    private String cpf; 

    // @Column(nullable = false, unique = true)
    // private String login;
    // // para simplificar vamos ter um email diferente para cada acesso
    // // no caso de uma pessoa ter acesso como AGENTE e SUPERVISOR

    // @Column(nullable = false)
    // private String senha;

    // @Enumerated(EnumType.STRING)
    // @Column(nullable = false)
    // private TipoUsuario tipo; // aqui diferenciamos os usuários em AGENTE e SUPERVISOR

    public Pessoa() {
    }

    public Pessoa(UUID id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
