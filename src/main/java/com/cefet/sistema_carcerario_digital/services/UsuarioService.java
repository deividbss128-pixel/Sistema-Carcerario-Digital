package com.cefet.sistema_carcerario_digital.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.cefet.sistema_carcerario_digital.entities.Pessoa;
import com.cefet.sistema_carcerario_digital.exceptions.ResourceNotFoundException;
import com.cefet.sistema_carcerario_digital.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository repo;

    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }

    public List<Pessoa> findAll() {
        return repo.findAll();
    }

    public Pessoa findById(UUID id) {
        return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Usuario not found"));
    }

    public Pessoa create(Pessoa usuario) {
        return repo.save(usuario);
    }

    public Pessoa update(UUID id, Pessoa usuario) {
        if (!repo.existsById(id)) throw new ResourceNotFoundException("Usuario not found");
        usuario.setId(id);
        return repo.save(usuario);
    }

    public void delete(UUID id) {
        if (!repo.existsById(id)) throw new ResourceNotFoundException("Usuario not found");
        repo.deleteById(id);
    }
}
