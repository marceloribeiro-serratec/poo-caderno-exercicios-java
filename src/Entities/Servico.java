package Entities;

import Interfaces.Tributavel;

public final class Servico implements Tributavel {
    private String descricao;
    private double valor;
    private int horasTrabalhadas;

    public Servico(String descricao, double valor, int horasTrabalhadas) {
        this.descricao = descricao;
        setValor(valor);
        setHorasTrabalhadas(horasTrabalhadas);
    }

    public void setValor(double valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("Valor invalido.");
        }
        this.valor = valor;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        if(horasTrabalhadas <= 0) {
            throw new IllegalArgumentException("Horas trabalhadas inválidas.");
        }
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularTributos() {
        return (this.valor * 0.12) + (this.horasTrabalhadas * 10.00);
    }
}
