package com.cefet.sistema_carcerario_digital.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.cefet.sistema_carcerario_digital.entities.Usuario;
import com.cefet.sistema_carcerario_digital.exceptions.ResourceNotFoundException;
import com.cefet.sistema_carcerario_digital.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository repo;

    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }

    public List<Usuario> findAll() {
        return repo.findAll();
    }

    public Usuario findById(UUID id) {
        return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Usuario not found"));
    }

    public Usuario create(Usuario usuario) {
        return repo.save(usuario);
    }

    public Usuario update(UUID id, Usuario usuario) {
        if (!repo.existsById(id)) throw new ResourceNotFoundException("Usuario not found");
        usuario.setId(id);
        return repo.save(usuario);
    }

    public void delete(UUID id) {
        if (!repo.existsById(id)) throw new ResourceNotFoundException("Usuario not found");
        repo.deleteById(id);
    }
}
