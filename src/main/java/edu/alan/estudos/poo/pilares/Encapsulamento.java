package edu.alan.estudos.poo.pilares;

public class Encapsulamento {
    /*
    * Encapsulamento -> Tem como proposito não deixar tudo visivel para o usuario e esconder certos metodos que não fazem sentido o usuario
    * visualizar, então usamos o private para encapsular ele dentro de uma classe.
    * */


    public static void main(String[] args) {
        // O usuario vai tentar executar o ligar carro mas antes de executar esse metodo eu quero executar a engenharia interna do automovel
        // mas eu não vou deixar ele sabendo que eu estou executando isso, então quando ele tentar executar o metodo ligarcarro
        // eu vou chamar o executarEngenhariaInterna
        ligarCarro();
        // O meu usuario só tem a preocupação de ligar o Carro de resto ele não está nem ai.
    }

    public static void ligarCarro(){
        executarEngenhariaInternaDoCarro();
        System.out.println("Ligar carro.");
    }

    private static void executarEngenhariaInternaDoCarro(){
        System.out.println("Na maioria dos casos se você não for um mecanico ou um engenheiro mecanico não faz sentido você ficar sabendo" +
                "o que está acontecendo na engenharia interna do seu automovel, pois você é o usuario.");
    }



}
