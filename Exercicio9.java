import java.util.Scanner;

/*Ler um número real x e imprimi-lo arredondando seu valor para mais
ou para menos. Se a parte decimal for menor que 0.5 arredonda para
menos. Se for maior ou igual a 0.5 arredonda para mais.*/

public class Exercicio9 {
    public static void main(String[] args) {
        float numero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha um número real");
        numero = teclado.nextFloat();
        int numeroInteiro = (int)numero;
        float Parte_Decimal = numero - numeroInteiro;

        if(Parte_Decimal> 0.5){
            System.out.println(numeroInteiro +1);
        }
        else{
            System.out.println(numeroInteiro);
        }

    }
    
}
