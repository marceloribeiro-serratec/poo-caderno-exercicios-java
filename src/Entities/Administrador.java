package Entities;

import Entities.Base.Usuario;
import Interfaces.Autenticavel;

public class Administrador extends Usuario implements Autenticavel {
    public Administrador(String nome) {
        super(nome);
    }

    @Override
    public boolean realizarLogin(String senha) {
        return "admin123".equalsIgnoreCase(senha);
    }
}
