// TODO - Crie duas interfaces: Imprimível (com o método imprimir()) e Salvavel (com o metodo salvar()).
//  Crie uma classe DocumentoWord que implemente ambas as interfaces. No metodo main, instancie
//  um DocumentoWord e chame os dois métodos.

package Principal.Interfaces;

import Entities.DocumentoWord;

public class Exercicio04 {
    public static void main(String[] args) {
        DocumentoWord documento = new DocumentoWord();
        documento.imprimir();
        documento.salvar();
    }
}
