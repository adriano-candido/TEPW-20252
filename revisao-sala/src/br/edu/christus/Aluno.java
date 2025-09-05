package br.edu.christus;

public class Aluno extends Pessoa{

    @Override
    public String apresentar() {
        return String.format("Olá tudo bem? sou o aluno %s", getNome());
    }


}
