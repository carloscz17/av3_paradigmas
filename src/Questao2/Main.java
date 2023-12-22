package Questao2;

import Questao2.etiquetas.GeradorEtiquetasZPL;
import Questao2.interfaces.GeradorEtiquetas;
import Questao2.model.Armazem;
import Questao2.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("CERVEJA LAGER HEINEKEN", 6.0, 35.0, "78936683");

        List<Produto> estoque = new ArrayList<>();
        estoque.add(produto1);

        GeradorEtiquetas geradorEtiquetas = new GeradorEtiquetasZPL();
        Armazem armazem = new Armazem(estoque, geradorEtiquetas);
        armazem.emitirEtiquetas();
    }
}
