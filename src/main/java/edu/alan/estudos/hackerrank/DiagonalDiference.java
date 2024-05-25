package edu.alan.estudos.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDiference {
    public static void main(String[] args) {
        List<List<Integer>> matriz = new ArrayList<>();
        List<Integer> lista1 = new ArrayList<Integer>();
        List<Integer> lista2 = new ArrayList<Integer>();
        List<Integer> lista3 = new ArrayList<Integer>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista2.add(4);
        lista2.add(5);
        lista2.add(6);
        lista3.add(9);
        lista3.add(8);
        lista3.add(9);
        matriz.add(lista1);
        matriz.add(lista2);
        matriz.add(lista3);
        System.out.println(diagonalDifference(matriz));
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        int valorDiagonal1 = 0;
        int valorDiagonal2 = 0;

        for(int i = 0; i<arr.size();i++){
            valorDiagonal1 += arr.get(i).get(i);
        }
        for(int j = 0; j< arr.size(); j++){
            valorDiagonal2+=arr.get(j).get(arr.size() -1 -j);
        }
        if(valorDiagonal1 > valorDiagonal2){
            return valorDiagonal1 - valorDiagonal2;
        }else{
            return valorDiagonal2 - valorDiagonal1;
        }
    }

}
