package com.cefet.sistema_carcerario_digital.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.cefet.sistema_carcerario_digital.entities.Pena;
import com.cefet.sistema_carcerario_digital.exceptions.ResourceNotFoundException;
import com.cefet.sistema_carcerario_digital.repositories.PenaRepository;

@Service
public class PenaService {

    private final PenaRepository repo;

    public PenaService(PenaRepository repo) {
        this.repo = repo;
    }

    public List<Pena> findAll() { return repo.findAll(); }

    public Pena findById(UUID id) { return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Pena not found")); }

    public Pena create(Pena d) { return repo.save(d); }

    public Pena update(UUID id, Pena d) {
        if (!repo.existsById(id)) throw new ResourceNotFoundException("Pena not found");
        d.setId(id);
        return repo.save(d);
    }

    public void delete(UUID id) {
        if (!repo.existsById(id)) throw new ResourceNotFoundException("Pena not found");
        repo.deleteById(id);
    }
}
