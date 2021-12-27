package com.company.aula1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int n;

        System.out.println("Exercicio 1" + "\n");

        System.out.println("Informe um numero: ");
        n = ler.nextInt();

        for (int i = 0; i <= n; i++) {

            if ((i % 2) == 0) {

                System.out.println("O numero " + i + " é Par");

            } else {
                System.out.println("O numero " + i + " é Impar");
            }
        }
    }
}
