package Questao3;

import Questao3.imposto.*;
import Questao3.model.*;
import Questao3.factory.*;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ImpostoFactory impostoFactory = new ImpostoFactory();
        List<Item> itens = new ArrayList<>();

        Produto produtoIndustrial = new Produto(1, "Achocolatado", 100.0, true);
        calcularImpostoEAdicionarNaLista(impostoFactory, produtoIndustrial, TipoImposto.TIPOICMS);
        itens.add(produtoIndustrial);

        Produto produtoIndustrial2 = new Produto(2, "Sardinha", 150.0, true);
        calcularImpostoEAdicionarNaLista(impostoFactory, produtoIndustrial2, TipoImposto.TIPOIPI);
        itens.add(produtoIndustrial2);

        Produto produtoIndustrial3 = new Produto(2, "Leite Integral", 150.0, true);
        calcularImpostoEAdicionarNaLista(impostoFactory, produtoIndustrial3, TipoImposto.TIPOPIS);
        itens.add(produtoIndustrial3);

        Produto produtoNaoIndustrial = new Produto(3, "Milho", 120.0, false);
        calcularImpostoEAdicionarNaLista(impostoFactory, produtoNaoIndustrial, TipoImposto.TIPOIPI);
        itens.add(produtoNaoIndustrial);

        Servico servico = new Servico(4, "Serviço de Marketing", 80.0);
        calcularImpostoEAdicionarNaLista(impostoFactory, servico, TipoImposto.TIPOISS);
        itens.add(servico);

        exibirDetalhesDosItens(itens);
    }
    private static void calcularImpostoEAdicionarNaLista(ImpostoFactory impostoFactory, Item item, TipoImposto tipoImposto) {
        Imposto imposto = impostoFactory.getImposto(tipoImposto);
        double impostoCalculado = imposto.calcular(item);
        item.setImpostoCalculado(impostoCalculado);
        item.setTotal(item.getValor() + impostoCalculado);
    }

    private static void exibirDetalhesDosItens(List<Item> itens) {
        for (Item item : itens) {
            System.out.println("Tipo de Item: " + (item instanceof Produto ? "Produto" : "Serviço"));
            System.out.println("Descrição: " + item.getDescricao());
            System.out.println("Valor: " + item.getValor());
            System.out.println("Imposto Calculado: " + item.getImpostoCalculado());
            System.out.println("Total: " + item.getTotal());
            System.out.println();
        }
    }
}