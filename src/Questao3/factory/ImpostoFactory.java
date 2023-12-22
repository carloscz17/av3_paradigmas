package Questao3.factory;

import Questao3.imposto.*;

public class ImpostoFactory {
    public Imposto getImposto(TipoImposto tipo) {
        return switch (tipo) {
            case TIPOICMS -> new ICMS();
            case TIPOIPI -> new IPI();
            case TIPOISS -> new ISS();
            case TIPOPIS -> new PIS();
            default -> throw new IllegalArgumentException("Tipo de imposto não suportado: " + tipo);
        };
    }
}
