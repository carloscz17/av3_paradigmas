
package Questao1;

import Questao1.entidades.Jogador;
import Questao1.entidades.Pergunta;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jogador jogador = new Jogador();

        Pergunta[] perguntas = {
                new Pergunta("O que é programação estruturada?",
                        new String[]{"a) Um paradigma de programação.", "b) Uma linguagem de programação.", "c) Um compilador."},
                        "a"),
                new Pergunta("Quais as características da programação estruturada?",
                        new String[]{"a) Modularidade e estruturação.", "b) Herança e polimorfismo.", "c) Orientação a objetos."},
                        "a"),
                new Pergunta("O que é programação orientada a objetos (POO)?",
                        new String[]{"a) Um livro sobre programação.", "b) Um paradigma de programação.", "c) Uma linguagem de programação."},
                        "b"),
                new Pergunta("O que é Herança?",
                        new String[]{"a) Um conceito que permite herdar características de uma classe para outra.", "b) Uma linguagem de programação.", "c) Um compilador."},
                        "a"),
                new Pergunta("O que é Interfaces?",
                        new String[]{"a) Um conceito que permite herdar características de uma classe para outra.", "b) Um conjunto de instruções.", "c) Um contrato para implementação."},
                        "c"),
                new Pergunta("O que é Polimorfismo?",
                        new String[]{"a) Uma forma de estruturar um programa.", "b) Um conceito que permite vários comportamentos em um mesmo método.", "c) Uma linguagem de programação."},
                        "b")
        };

        for (Pergunta pergunta : perguntas) {
            exibirPergunta(pergunta);
            System.out.print("Digite a letra da alternativa correta: ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase(pergunta.getRespostaCorreta())) {
                System.out.println("Resposta correta! +5 pontos\n");
                jogador.adicionarPontos(5);
            } else {
                System.out.println("Resposta incorreta! -1 ponto\n");
                jogador.adicionarPontos(-1);
            }
        }

        exibirRespostasCorretas(perguntas);
        exibirPontuacaoFinal(jogador.getPontuacao());

        scanner.close();
    }
    private static void exibirPergunta(Pergunta pergunta) {
        System.out.println(pergunta.getPergunta());
        for (String alternativa : pergunta.getAlternativas()) {
            System.out.println(alternativa);
        }
    }
    private static void exibirRespostasCorretas(Pergunta[] perguntas) {
        System.out.println("Respostas corretas:");
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println((i + 1) + ". " + perguntas[i].getRespostaCorreta());
        }
    }
    private static void exibirPontuacaoFinal(int pontuacao) {
        System.out.println("Pontuação final: " + pontuacao + " pontos");
    }
}
