package edu.alan.estudos.urijudge;

import java.util.Locale;
import java.util.Scanner;

public class AumentoSalarial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        double salarioAtual = sc.nextDouble();
        double percentualDeAjuste = 0.0;
        double valorAplicadoPercentual = 0;
        double total = 0;

        if(salarioAtual <= 400.0){
            percentualDeAjuste = 0.15;
            valorAplicadoPercentual = salarioAtual*percentualDeAjuste;

            total = salarioAtual + valorAplicadoPercentual;
            int percentual = (int)(percentualDeAjuste*100);
            System.out.printf("Novo salario: %.2f%n",total);
            System.out.printf("Reajuste ganho: %.2f%n" ,valorAplicadoPercentual);
            System.out.println("Em percentual: "+percentual + " %");
        }
        if(salarioAtual > 400.0 && salarioAtual <= 800.0){
            percentualDeAjuste = 0.12;
            valorAplicadoPercentual = salarioAtual*percentualDeAjuste;

            total = salarioAtual + valorAplicadoPercentual;
            int percentual = (int)(percentualDeAjuste*100);
            System.out.printf("Novo salario: %.2f%n",total);
            System.out.printf("Reajuste ganho: %.2f%n" ,valorAplicadoPercentual);
            System.out.println("Em percentual: "+percentual + " %");
        }
        if(salarioAtual > 800.0 && salarioAtual <= 1200.0){
            percentualDeAjuste = 0.10;
            valorAplicadoPercentual = salarioAtual*percentualDeAjuste;

            total = salarioAtual + valorAplicadoPercentual;
            int percentual = (int)(percentualDeAjuste*100);
            System.out.printf("Novo salario: %.2f%n",total);
            System.out.printf("Reajuste ganho: %.2f%n" ,valorAplicadoPercentual);
            System.out.println("Em percentual: "+percentual + " %");
        }
        if(salarioAtual > 1200.0 && salarioAtual <= 2000.0){
            percentualDeAjuste = 0.07;
            valorAplicadoPercentual = salarioAtual*percentualDeAjuste;

            total = salarioAtual + valorAplicadoPercentual;
            int percentual = (int)(percentualDeAjuste*100);
            System.out.printf("Novo salario: %.2f%n",total);
            System.out.printf("Reajuste ganho: %.2f%n" ,valorAplicadoPercentual);
            System.out.println("Em percentual: "+percentual + " %");
        }
        if(salarioAtual > 2000.0){
            percentualDeAjuste = 0.04;
            valorAplicadoPercentual = salarioAtual*percentualDeAjuste;

            total = salarioAtual + valorAplicadoPercentual;
            int percentual = (int)(percentualDeAjuste*100);
            System.out.printf("Novo salario: %.2f%n",total);
            System.out.printf("Reajuste ganho: %.2f%n" ,valorAplicadoPercentual);
            System.out.println("Em percentual: "+percentual + " %");
        }

        sc.close();
    }

}
