package edu.alan.estudos.javabasico;

public class Operadores {
    /*
    * Um programa de computador é uma sequencia de instuções logicas. é comum receber dados do usuário, prover alguma lógica para processá-los e então apresentar o resultado desse processamento.
    * Operador de Atribuição "="
    * Esse operador serve para atribuir valor a uma variavel ou sobrescever o valor de uma variavel.
    *
    * Operadores Aritimeticos = /, * , + , - , %.
    * Soma = a + b;
    * Subtração = a - b;
    * Multiplicação = a * b;
    * Divisão = a / b;
    * Modulo = a % b;
    *
    * Operador Unário = ++, --, !, + , -
    * ++ = incrementação.
    * -- = decrementação.
    * ! = negação de valor.
    * - = transforma o numero para negativo.
    * + = numero vira positivo.
    *
    * Operador Ternário = If else escrito em uma linha.
    * <Condição> ? SE FOR TRUE EXECUTA ESSA LINHA : SE FOR FALSE EXECUTA ESSA LINHA.
    * ? true : false.
    *
    *
    * Operador Relacional = ==, != , > , <, >= , <=
    * "==" = Quando queremos comparar se o valor da esquerda é igual ao valor da direita, EX: a == b
    * != = Quando queremos comparar se o valor da esquerda é diferente do valor da direita, EX: a != b
    * > = Quando queremos comparar se o valor da esquerda é maior que o da direita, EX: a > b
    * < = Quando queremos comparar se o valor da direita é maior que o da esquerda, EX: a < b
    * >= = Quando queremos comparar se o valor da esquerda é maior ou igual ao da direita, EX: a >= b
    * <= = Quando queremos comparar se o valor da direita é igual ou maior que o da esquerda, EX: a <= b
    *
    *  Se aprofundar no conceito de espaço em memória Stack versus Heap.
    *
    * QUANDO QUEREMOS COMPARAR OBJETOS EM JAVA UTILIZAMOS O OPERADOR EQUALS
    * */

    public static void main(String[] args){
        int number = 10;
        int number1 = 10;

        System.out.println(number == number1);


        Integer numero1 = 130;
        Integer numero2 = 130;

        System.out.println(numero1 == numero2);
        System.out.println(numero1.equals(numero2));
        // O metodo equals é para comparar objetos.
    }
}
