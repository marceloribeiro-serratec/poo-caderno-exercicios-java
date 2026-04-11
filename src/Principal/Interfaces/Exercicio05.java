// TODO - 5. Herança e Interface
//  Juntas Crie uma classe abstrata Veiculo com os
//  atributos marca e modelo, e um metodo abstrato acelerar().
//  Crie uma interface EmissorCarbono com o metodo emitirGases().
//  Crie uma classe Carro que herde de Veiculo e implemente EmissorCarbono. Implemente os métodos e teste.

package Principal.Interfaces;

import Entities.Carro;

public class Exercicio05 {
    public static void main(String[] args) {
        Carro carro = new Carro("Volkswagen", "polo msi 1.0", 80);

        carro.setVelocidade(100);
        carro.acelerar();
        carro.emitirGases();
        System.out.println("Velocidade atual: " + carro.getVelocidade() + "km/h");
        System.out.println(carro.toString());
    }
}
