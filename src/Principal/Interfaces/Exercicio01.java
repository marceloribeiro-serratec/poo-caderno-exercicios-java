package Principal.Interfaces;

import Entities.Email;
import Entities.Sms;

public class Exercicio01 {
    public static void main(String[] args) {
        Email email = new Email();
        email.enviarMensagem("Olá, esta é uma mensagem de email!");

        Sms sms = new Sms();
        sms.enviarMensagem("Esta é uma mensagem de sms");
    }
}
