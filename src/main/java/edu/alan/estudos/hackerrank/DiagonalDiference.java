package edu.alan.estudos.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDiference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int diagonalValue1 = 0;
        int diagonalValue2 = 0;
        for(int i = 0; i<arr.size();i++){
            diagonalValue1 += arr.get(i).get(i);
        }
        for(int j = 0; j< arr.size(); j++){
            diagonalValue2+=arr.get(j).get(arr.size() -1 -j);
        }
        if(diagonalValue1 > diagonalValue2){
            return diagonalValue1 - diagonalValue2;
        }else{
            return diagonalValue2 - diagonalValue1;
        }
    }

}
