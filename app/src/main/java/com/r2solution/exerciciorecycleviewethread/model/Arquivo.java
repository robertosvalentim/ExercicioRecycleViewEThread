package com.r2solution.exerciciorecycleviewethread.model;

public class Arquivo {

    private String nome;
    private Double tamanho;

    public Arquivo(String nome, Double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public Arquivo(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }
}
