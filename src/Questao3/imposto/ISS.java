package Questao3.imposto;

import Questao3.model.*;
public class ISS implements Imposto {
    @Override
    public double calcular(Item item) {
        return item.getValor() * 0.22;
    }
}
