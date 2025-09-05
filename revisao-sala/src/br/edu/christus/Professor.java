package br.edu.christus;

public class Professor extends Pessoa{
    private double salario;

    public Professor(){

    }

    public Professor(String nome){
        super(nome);
    }

    @Override
    public String apresentar() {
        return String.format("Olá tudo bem? sou o professor %s", getNome());
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
