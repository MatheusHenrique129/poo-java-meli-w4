package com.company.aula1;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int n;

        System.out.println("Exercicio 3" + "\n");

        System.out.println("Informe um numero: ");
        n = ler.nextInt();

        if ((n % n) == 0) {

            if (n % 1 == 0) {

                System.out.println("O numero " + n + " é primo");
            } else {
                System.out.println("O numero " + n + " não é primo");
            }

        } else {
            System.out.println("O num");
        }

    }
}
