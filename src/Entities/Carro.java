package Entities;

import Entities.Base.Veiculo;
import Interfaces.EmissorCarbono;

public final class Carro extends Veiculo implements EmissorCarbono {
    private int velocidade;

    public int getVelocidade() {
        return velocidade;
    }

    public Carro(String marca, String modelo, int velocidade){
        super(marca, modelo);
        setVelocidade(velocidade);
    }

    public void setVelocidade(int velocidade) {
        if(velocidade < 0) {
            throw new IllegalArgumentException("Velocidade não pode ser negativa.");
        }
        this.velocidade = velocidade;
    }
    @Override
    public void acelerar() {
        this.velocidade++;
    }

    @Override
    public void emitirGases() {
        System.out.println("Emitindo gasses.");
    }

    @Override
    public String toString() {
        return "Carro{ " +
                "velocidade atual= " + velocidade +
                ", marca= '" + marca + '\'' +
                ", modelo= '" + modelo + '\'' +
                '}';
    }
}
