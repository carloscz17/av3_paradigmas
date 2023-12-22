package Questao3.model;

public class Produto extends Item {
    private boolean industrial;

    // Construtor com argumentos
    public Produto(int codigo, String descricao, double valor, boolean industrial) {
        super(codigo, descricao, valor);
        this.industrial = industrial;
    }

    // Getters e setters para 'industrial'
    public boolean isIndustrial() {
        return industrial;
    }

    public void setIndustrial(boolean industrial) {
        this.industrial = industrial;
    }
}
