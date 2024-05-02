package edu.alan.estudos.urijudge;

import java.util.Locale;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x1 =  sc.nextDouble();
        double y1 =  sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        DistanciaDeDoisPontos(x1,x2,y1,y2);
        sc.close();
    }
    public static void DistanciaDeDoisPontos(double x1,double x2, double y1, double y2){
        double distanciaX = Math.pow((x2 - x1),2);
        double distanciay = Math.pow((y2 - y1),2);
        double distanciaEntreXeY = Math.sqrt(distanciaX + distanciay);
        System.out.println(String.format("%.4f", distanciaEntreXeY));
    }
}
