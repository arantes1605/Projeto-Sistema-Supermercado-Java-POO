package com.Supermecados.Entidade;

import java.util.UUID;

public abstract class Entidade {
    private String id;

    public Entidade() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id;
    }
}