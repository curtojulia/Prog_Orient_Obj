import java.util.Scanner;

public class Exercicio6 {
    /*Leia a distância percorrida por um carro, o tempo gasto e a quantidade de
gasolina consumida. Em seguida, imprima a velocidade média (KM/h) e o
consumo de combustível (Km/l).
 */
 public static void main(String [] args){
        Scanner t = new Scanner(System.in);
        System.out.println("Insira a distância percorrida em KM:");
        float distancia = t.nextFloat();
        System.out.println("Insira a quantidade de gasolina consumida em L: ");
        float gasolina = t.nextFloat();
        System.out.println("Insira o tempo gasto em H:");
        float Tempo_Gasto = t.nextFloat();
    
        System.out.printf("A distância percorrida foi igual: %f \n O tempo gasto foi: %f \n A gasolina consumida foi: %f \n", distancia, Tempo_Gasto,gasolina);
   

         float velocidade_Media = (distancia / Tempo_Gasto);
         float Consumo_Combustível = (distancia/ gasolina);
         System.out.printf("A velocidade média do carro foi: %f \n E o consumo de combustível foi %f \n", velocidade_Media, Consumo_Combustível);
 
    }
    
}
