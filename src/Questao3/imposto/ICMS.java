package Questao3.imposto;


import Questao3.model.Item;

public class ICMS implements Imposto {
    @Override
    public double calcular(Item item) {
        return item.getValor() * 0.18;
    }
}
