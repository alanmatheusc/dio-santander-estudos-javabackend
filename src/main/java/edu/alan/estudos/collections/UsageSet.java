package edu.alan.estudos.collections;

import java.util.*;

public class UsageSet {



    public static void main(String[] args) {
        /*
        * O set não permite repetiçõo do mesmo valor, ou seja se eu tiver 2 valores iguais ele exclui um!
        * HashSet => Não segue uma ordem de dados, a ordem é pela inserção.
        * TreeSet => A estrutura dos dados  respeita uma ordem e sua estrutura é como de uma Arvore.
        *
        * */
        Set<String> nomeSet = new HashSet<String>();
        nomeSet.add("Pedro");
        nomeSet.add("Alan");

        Set<String> nome = new TreeSet<String>();

        nome.add("Bernardo");
        nome.add("Joao");
        nome.add("Alan");

        System.out.println(nomeSet);
        System.out.println(nome);

    }

}
