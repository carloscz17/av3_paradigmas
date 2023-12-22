package Questao2.etiquetas;

import Questao2.interfaces.GeradorEtiquetas;
import Questao2.model.Produto;

public class GeradorEtiquetasZPL implements GeradorEtiquetas {
    @Override
    public String gerarEtiqueta(Produto produto) {
        // Lógica de geração de etiquetas ZPL aqui
        String descricaoFormatada = produto.getDescricaoFormatada();
        String precoLataFormatado = produto.getPrecoLataFormatado();
        String precoCaixaFormatado = produto.getPrecoCaixaFormatado();
        String codigoBarrasFormatado = produto.getCodigoBarras();

        return String.format("^XA\n" +
                        "^CF0,60\n" +
                        "^FO50,50^FD %s^FS\n" +
                        "^CFA,50\n" +
                        "^FO50,200^FDLata   %s^FS\n" +
                        "^FO50,280^FDCaixa   %s^FS\n" +
                        "^BY5,2,100\n" +
                        "^FO50,450^BC^FD%s^FS\n" +
                        "^XZ\n",
                        descricaoFormatada,
                        precoLataFormatado,
                        precoCaixaFormatado,
                        codigoBarrasFormatado);
    };
}

