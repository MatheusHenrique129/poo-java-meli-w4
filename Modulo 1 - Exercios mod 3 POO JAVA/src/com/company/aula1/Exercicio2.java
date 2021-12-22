package com.company;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int n;
        int m;
        int k;

        System.out.println("Exercicio 2" + "\n");

        System.out.println("Informe um numero para exibir a quantidade de multiplos: ");
        n = ler.nextInt();

        System.out.println("Informe o numero que vc quer saber se é multiplo: ");
        m = ler.nextInt();

        for(int i=0; i <= n; i++){

             if((i % m) == 0){
                 System.out.println("é multiplo de " + i);
                 i++;
             }else {
                 System.out.println(n + " não é multiplo de " + i);
             }
        }
    }
}
