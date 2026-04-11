package Entities;

import Interfaces.Imprimivel;
import Interfaces.Salvavel;

public class DocumentoWord implements Imprimivel, Salvavel {

    @Override
    public void imprimir() {
        System.out.println("Imprimindo Documento Word");
    }

    @Override
    public void salvavel() {
        System.out.println("Salvando Documento Word");
    }
}
