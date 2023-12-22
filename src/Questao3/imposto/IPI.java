package Questao3.imposto;

import Questao3.model.*;
public class IPI implements Imposto {
    @Override
    public double calcular(Item item) {
        if (item instanceof Produto && ((Produto) item).isIndustrial()) {
            double percentual = 0.12;
            double imposto = item.getValor() * percentual;
            item.setImpostoCalculado(imposto);
            item.setTotal(item.getValor() + imposto);
            return imposto;
        } else {
            return 0;
        }
    }
}