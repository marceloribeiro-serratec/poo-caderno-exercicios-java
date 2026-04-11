package Entities;

import Interfaces.Autenticavel;

public class Cliente extends Usuario implements Autenticavel {
    public Cliente(String nome) {
        super(nome);
    }

    @Override
    public boolean realizarLogin(String senha) {
        return "cliente123".equalsIgnoreCase(senha);
    }
}
