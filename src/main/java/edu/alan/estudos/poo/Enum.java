package edu.alan.estudos.poo;

public enum Enum {
    SAO_PAULO ("SP","São Paulo"),
    RIO_JANEIRO ("RJ", "Rio de Janeiro"),
    PIAUI ("PI", "Piauí"),
    MARANHAO ("MA","Maranhão") ;

    // ENUM SERVE PARA VALORES PRÉ ESTABELECIDOS.

    private String nome;
    private String sigla;

    // AQUI DEFINIMOS A ESTRUTURA DO ENUM:
    private Enum(String sigla, String nome) {
        this.nome = nome;
        this.sigla = sigla;
    }
    public String getSigla() {
        return sigla;
    }
    public String getNome() {
        return nome;
    }
    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }


    public static void main(String[] args) {
        Enum e = Enum.MARANHAO;

        System.out.println(e.getNome());
    }
}