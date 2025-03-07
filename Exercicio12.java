/*Ler dois números inteiros (a e b) e imprimir os pares no intervalo a..b,
além da soma e da média desses números. Caso a seja maior que b,
imprima os números no intervalo b..a. */

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Insira um número");
        int a = t.nextInt();
        System.out.println("Insira outro número");
        int b = t.nextInt();

        int inicio = a; // usando inicio para não perder o valor de a

        if (a < b) {
            while (inicio <= b) {
                if (inicio % 2 == 0) {
                    System.out.println(inicio + " ");
                }
                inicio++;
            }
        } else {
            while (inicio >= b) {
                if (inicio % 2 == 0) {
                    System.out.println(inicio + "");
                }
                inicio--;
            }

        }
        int soma = 0;
        int Quantidade_Numero = 0;
        inicio = a;

        if (a < b) {
            while (inicio <= b) {
                soma = soma + inicio;
                Quantidade_Numero++;
                inicio++;
            }
        } else {
            while (inicio >= b) {
                soma = soma + inicio;
                Quantidade_Numero++;
                inicio--;
            }
        }
        double media = (double) soma / Quantidade_Numero;

        System.out.println("A soma desses números são" + soma);
        System.out.println("A média desses números é igual a:" + media);
    }
}
