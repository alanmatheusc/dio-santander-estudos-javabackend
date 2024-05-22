package edu.alan.estudos.urijudge;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        int codigoPeca1 = sc.nextInt();
        int qtdPeca1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();

        int codigoPeca2 = sc.nextInt();
        int qtdPeca2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();

        double total = (valorPeca1 * qtdPeca1) + (valorPeca2 * qtdPeca2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);
    }

}
