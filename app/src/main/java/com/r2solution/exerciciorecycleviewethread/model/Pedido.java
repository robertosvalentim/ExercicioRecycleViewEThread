package com.r2solution.exerciciorecycleviewethread.model;

public class Pedido {

    private Integer numero;
    private Double valor;

    public Pedido(Integer numero, Double valor) {
        this.numero = numero;
        this.valor = valor;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
