package com.cefet.sistema_carcerario_digital.dto;

import java.util.UUID;

public class BaseDTO {
    private UUID id;

    public BaseDTO() {
    }

    public BaseDTO(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
