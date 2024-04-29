package edu.alan.projeto.contabancaria;

public class Conta {
    private String nome;
    private double dataNascimento;
    private double cpf;
    private double saldoBancario = 0;


    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public double getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(double dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public double getSaldoBancario(){
        return saldoBancario;
    }
    public void setSaldoBancario(double saldoBancario) {
        this.saldoBancario += saldoBancario;
    }
}
