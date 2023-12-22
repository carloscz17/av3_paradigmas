package Questao1.entidades;

public class Jogador {
    private int pontuacao;

    public Jogador() {
        this.pontuacao = 0;
    }

    public void adicionarPontos(int pontos) {
        this.pontuacao += pontos;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
