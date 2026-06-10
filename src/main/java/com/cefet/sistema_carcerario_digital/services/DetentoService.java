package com.cefet.sistema_carcerario_digital.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.cefet.sistema_carcerario_digital.entities.Detento;
import com.cefet.sistema_carcerario_digital.exceptions.ResourceNotFoundException;
import com.cefet.sistema_carcerario_digital.repositories.DetentoRepository;

@Service
public class DetentoService {

    private final DetentoRepository repo;

    public DetentoService(DetentoRepository repo) {
        this.repo = repo;
    }

    public List<Detento> findAll() { return repo.findAll(); }

    public Detento findById(UUID id) { return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Detento not found")); }

    public Detento create(Detento d) { return repo.save(d); }

    public Detento update(UUID id, Detento d) {
        if (!repo.existsById(id)) throw new ResourceNotFoundException("Detento not found");
        d.setId(id);
        return repo.save(d);
    }

    public void delete(UUID id) {
        if (!repo.existsById(id)) throw new ResourceNotFoundException("Detento not found");
        repo.deleteById(id);
    }
}
