package Questao2.model;

import java.text.NumberFormat;
import java.util.Locale;

public class Produto {
    private String descricao;
    private Double precoLata;
    private Double precoCaixa;
    private String codigoBarras;

    public Produto(String descricao, Double precoLata, Double precoCaixa, String codigoBarras) {
        this.descricao = descricao;
        this.precoLata = precoLata;
        this.precoCaixa = precoCaixa;
        this.codigoBarras = codigoBarras;
    }
    public String getDescricaoFormatada() {
        return descricao.length() > 22 ? descricao.substring(0, 22) : descricao;
    }
    public String getPrecoLataFormatado() {
        return NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(precoLata);
    }
    public String getPrecoCaixaFormatado() {
        return NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(precoCaixa);
    }
    public String getCodigoBarras() {
        return codigoBarras;
    }
}
