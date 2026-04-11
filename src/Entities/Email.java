package Entities;

import Interfaces.Mensageiro;

public class Email implements Mensageiro {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
