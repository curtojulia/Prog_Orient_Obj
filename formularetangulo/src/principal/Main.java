package principal;

import formas.Circulo;
import formas.Retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        int valor_x = teclado.nextInt();
        int valor_y = teclado.nextInt();
        int valor_largura = teclado.nextInt();
        int valor_altura = teclado.nextInt();

        Retangulo r1 = new Retangulo(valor_x, valor_altura,valor_largura,valor_altura);

        r1.mover(6,7);
        r1.desenhar();
        r1.redimensionar(8,9);
        r1.dividir();

        Circulo c1 = new Circulo(5,6,8);
        Circulo c2 = new Circulo(5,7,12);
        Circulo c3 = new Circulo(c1);

        c1.setX(0); // c1.x = 0;

        c1.desenhar();
        c2.mover(5,10);
        c3.redimensionar(4,8);
        c1.dividir();


    }
}
