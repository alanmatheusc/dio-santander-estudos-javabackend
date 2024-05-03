package edu.alan.estudos.urijudge;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int pesoDasNotas = 2 + 3 + 4 + 1;

        double notaA = sc.nextDouble() * 2;
        double notaB = sc.nextDouble() * 3;
        double notaC = sc.nextDouble() * 4;
        double notaD = sc.nextDouble() * 1;
        double mediaDoAluno = (notaA + notaB + notaC + notaD) / pesoDasNotas;
        DecimalFormat formatoDaMedia = new DecimalFormat("#0.0");

        if(mediaDoAluno >= 7){
            System.out.println("Media: "+ String.format("%.1f", mediaDoAluno));
            System.out.println("Aluno aprovado.");
        }
        if(mediaDoAluno < 5){
            System.out.println("Media: "+ formatoDaMedia.format(mediaDoAluno));
            System.out.println("Aluno reprovado.");
        }
        if(mediaDoAluno >= 5 && mediaDoAluno <= 6.9){
            System.out.println("Media: "+ formatoDaMedia.format(mediaDoAluno));
            System.out.println("Aluno em exame.");
            double notaExameFinal = sc.nextDouble();
            System.out.println("Nota do exame: "+ notaExameFinal);
            double notaFinal = (mediaDoAluno + notaExameFinal) / 2;
            if(notaFinal >= 5){
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: "+ formatoDaMedia.format(notaFinal));
            }else{
                if(notaFinal < 5){
                    System.out.println("Aluno reprovado.");
                    System.out.println("Media final: "+ formatoDaMedia.format(notaFinal));
                }
            }
        }
        sc.close();
    }

}
