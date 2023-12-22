package Questao2.model;

import Questao2.interfaces.GeradorEtiquetas;

import java.util.List;

public class Armazem {
    private List<Produto> estoque;
    private GeradorEtiquetas geradorEtiquetas;

    public Armazem(List<Produto> estoque, GeradorEtiquetas geradorEtiquetas) {
        this.estoque = estoque;
        this.geradorEtiquetas = geradorEtiquetas;
    }

    public void emitirEtiquetas() {
        if (estoque == null || geradorEtiquetas == null) {
            System.out.println("Configure o estoque e o gerador de etiquetas antes de emitir as etiquetas.");
            return;
        }

        for (Produto produto : estoque) {
            String etiqueta = geradorEtiquetas.gerarEtiqueta(produto);
            System.out.println("Etiqueta gerada:\n" + etiqueta);
        }
    }
}