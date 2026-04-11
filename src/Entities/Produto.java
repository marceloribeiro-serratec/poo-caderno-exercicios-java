package Entities;

import Interfaces.Tributavel;

public final class Produto implements Tributavel {
    private String nome;
    private double valor;
    private double peso;

    public Produto(String nome, double valor, double peso) {
        this.nome = nome;
        setValor(valor);
        setPeso(peso);
    }

    public void setValor(double valor) {
        if( valor <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        }
        this.valor = valor;
    }

    public void setPeso(double peso) {
        if(peso <= 0) {
            throw new IllegalArgumentException("Peso invalido");
        }
        this.peso = peso;
    }

    @Override
    public double calcularTributos() {
        return (this.valor * 0.10) + (this.peso * 5.00);
    }
}
