import java.util.Scanner;

public class Exercicio5{
    public static void main(String [] args){
        Scanner t = new Scanner(System.in);
        System.out.println("Insira o tempo em segundos. ");
        int segundos = t.nextInt();
        System.out.printf("Segundos = %d\n", segundos); /* %d é para a variavel entrar onde está e \n é ára formatar e pular de linha*/
        /*System.out.println("Segundos = " + segundos);  aqui é a mesma coisa porém a formatação ja vem com uma linha pulada*/

         int hora = (segundos / 3600);
         int restoDeSegundosNaoTransformadosEmHora = segundos % 3600;
         int minutos = restoDeSegundosNaoTransformadosEmHora/60;
         int restoDeSegundosNaoTransformadosEmMinuto = restoDeSegundosNaoTransformadosEmHora % 60;
         System.out.printf("E %d hora. \n", hora);

         System.out.printf("E %d minutos \n", minutos);
    }
}