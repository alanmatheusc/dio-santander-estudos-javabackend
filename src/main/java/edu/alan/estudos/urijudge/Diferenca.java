package edu.alan.estudos.urijudge;

import java.util.Locale;
import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        calculoDiferencaEntreOsNumeros(a,b,c,d);

        sc.close();
    }

    public static void calculoDiferencaEntreOsNumeros(int a, int b, int c, int d){
        int calculoAeB = (a * b);
        int calculoCeD = (c*d);
        int diferenca = calculoAeB - calculoCeD;
        System.out.println("DIFERENCA = "+diferenca);
    }

}
