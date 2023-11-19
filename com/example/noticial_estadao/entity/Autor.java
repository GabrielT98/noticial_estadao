package com.example.noticial_estadao.entity;
public class Autor {
    private int id;
    private String nomeCompleto;
    private String cargo;

    public Autor(int id, String nomeCompleto, String cargo) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getCargo() {
        return cargo;
    }
}