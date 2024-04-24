package edu.alan.estudos.javabasico;

public class TiposVariaveis {


    public static void main(String[] args) {
        // Declaração de Constantes em Java possui a palavra reservada final seguido de uma nomeação em caixa alta.
        final  String NOME = "Alan";
      // NOME = "Matheus"; vai dar erro! pois eu transformei a variavel NOME em uma constante usando a palavra final

        int idade = 20;
        idade=21;
        System.out.println(idade);

        // Tipos Primitivos -> int, byte, short, long, float, double, boolean e char. Esses valores são armazenados no memory stack.
        /*
        * Byte -> -128 a 127. Armazena 1 byte de memoria.
        * Short -> -32.768 a 32.767. Armazena 2 byte de memoria.
        * Int -> -2.147.483.648 a -2.147.483.647. Armazena 4 bytes de memoria.
        * Long -> -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807. Armazena 8 bytes de memoria.
        * Float -> 	-3,4028E + 38 a 3,4028E + 38. Armazena 4 bytes
        * double -> -1,7976E + 308 a 1,7976E + 308. Armazena 8 bytes.
        *
        * A diferença dos tipos númericos é a quantidade de valor em memoria que cada tipo consegue armazenar
        * um numero Long consegue receber o valor de um inteiro, mas um inteiro não consegue receber o valor de um long
        * mesmo que o valor atribuido a variavel long esteja dentro dos limites do inteiro, porque em algum momento essa variavel
        * Long pode receber outro valor que seja maior que a Memoria suportada pela variavel int.
        *
        * Toda variavel em java é composta por, <Tipo> <nomeDaVariavel> = <valorDaVariavelOpcional>
         * * */
    }
}
