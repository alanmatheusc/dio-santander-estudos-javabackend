package edu.alan.estudos.entendendo.algoritimos;

import java.util.ArrayList;
import java.util.List;

public class PesquisaBinaria {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(0,1);
        lista.add(1,2)  ;
        lista.add(2,3);
        lista.add(3,4);
        lista.add(4,5);

        //Definimos uma variavel inicial para o começo da lista e para o final
        // defini também a variavel do numero que quero achar dentro da lista.

        int inicio = 0;
        int finalist = lista.size();
        int number = 4;

        while(inicio <= finalist){
            // o meio eu divido o array para pegar o valor da metade da lista.
            int meio = (inicio + finalist) / 2;

            int chute = lista.get(meio);
            // se o chute for igual ao numero que eu espero, pulo fora
            if(chute == number){
                System.out.println("Chute:"+chute);
                System.out.println("Meio:"+meio);
                break;
            }
            // se chute for maior que number, então eu tenho que ver a lista da esquerda até o centro
            if(chute > number){
                finalist = meio - 1;
            }
            // chute for menor que o numero eu digo que o inicio vai ser igual ao meio + 1.
            else{
                inicio = meio + 1;
            }
        }
    }

}
