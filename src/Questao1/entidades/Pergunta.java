package Questao1.entidades;

public class Pergunta {
    private String pergunta;
    private String[] alternativas;
    private String respostaCorreta;

    public Pergunta(String pergunta, String[] alternativas, String respostaCorreta) {
        this.pergunta = pergunta;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }
}
