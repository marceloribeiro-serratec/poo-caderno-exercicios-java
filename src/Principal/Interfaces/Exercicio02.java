package Principal.Interfaces;

import Entities.Administrador;
import Entities.Cliente;

public class Exercicio02 {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Marcus Braze");

        if(administrador.realizarLogin("admin123")) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Falha no login!");
        }

        Cliente cliente = new Cliente("Lucas Leme");
        if(cliente.realizarLogin("cliente")) {
            System.out.println("Login realizado com sucesso!");
        }
        else {
            System.out.println("Falha no login!");
        }

    }
}
