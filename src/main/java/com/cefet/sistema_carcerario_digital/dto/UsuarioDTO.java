package com.cefet.sistema_carcerario_digital.dto;

import java.util.UUID;

import com.cefet.sistema_carcerario_digital.entities.TipoUsuario;

public class UsuarioDTO extends BaseDTO {
    private String nome;
    private String cpf;
    private String login;
    private String senha;
    private TipoUsuario tipo;

    public UsuarioDTO() {}

    public UsuarioDTO(UUID id, String nome, String cpf, String login, String senha, TipoUsuario tipo) {
        super(id);
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
    public TipoUsuario getTipo() { return tipo; }
    public void setTipo(TipoUsuario tipo) { this.tipo = tipo; }
}
