import java.util.Scanner;

public class prova4 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int numero;
        int contador=0, contador2=0, i=0;

        while (i<20) {
            i++;
            System.out.print("Escreva um numero: ");
            numero = var.nextInt();
            if (numero>=92 && numero<=1438) {
                if (numero % 2 == 0) {
                    System.out.println("Esse numero não é primo");
                }else{
                    System.out.println("Esse numero é primo");
                    contador++;
                }
            }else{
                System.out.println("Esse numero invalido");
                contador2++;
            }  
        }
        
        System.out.println("Apareceu "+contador+" de numero primos");
        System.out.println("Apareceu "+contador2+" numeros invalidos");

        }
    }