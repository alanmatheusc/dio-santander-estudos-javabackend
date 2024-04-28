package edu.alan.estudos.javabasico;

import java.util.Scanner;

public class DefinirAnoBissexto {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o ano desejado: ");
        int year = sc.nextInt();
        isAnoBissexto(year);
    }
    // Static é usado quando eu quero dizer que o método é da  classe que estou trabalhando, no caso DefinirAnoBissexto
    public static void isAnoBissexto(int ano) throws Exception {
        // Eu criei essa lista de arrays para poder simular uma iteração em dados que eu não sei que valores irão vir..

        int [] anoBissexto = {4,100,400};
        boolean isAnoBissexto = false;
        if(ano == 0){
            throw new Exception();
        }
        // Então nessa iteração que eu fiz eu validei se o valor que eu estava iterando era o que eu precisava dentro do array
        // Logicamente era pois estou vendo visualmente o valor, mas se viesse de uma estrutura mais complexa de milhares de dados
        // eu teria que filtrar para buscar apenas o que condiz com o que eu quero.
        for(int i = 0; i < anoBissexto.length; i++){
           if(anoBissexto[i] == 4){
               boolean b = ano % anoBissexto[i] == 0 ? isAnoBissexto = true : false;
           }
           if(anoBissexto[i] == 100){
               boolean b = ano % anoBissexto[i] == 0 ? isAnoBissexto = false : true;
           }
            if(anoBissexto[i] == 400){
                boolean b = ano % anoBissexto[i] == 0 ? isAnoBissexto = true : false;
            }
        }

        // Imprimir mensagem situacional, caso o ano seja bissexto quero exibir uma mensagem, caso não outra.
        if(isAnoBissexto){
            System.out.println("O Ano de " + ano + " é um ano bissexto!");
        }
        if(!isAnoBissexto){
            System.out.println("O Ano de " + ano + " não é um ano bissexto!");
        }

    };

}


