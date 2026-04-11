package Entities;

import java.io.PrintStream;

import Interfaces.ConfiguracoesSistema;

public class Sobre implements ConfiguracoesSistema {
    private final PrintStream out;

    public Sobre() {
        this(System.out);
    }

    public Sobre(PrintStream out) {
        this.out = out;
    }

    public void exibirInfo() {
        out.println("Nome: " + NOME_EMPRESA);
        out.println("Versão: " + VERSAO);
    }
}
