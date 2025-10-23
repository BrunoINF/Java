import java.util.Scanner;

public class n25 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        float numero, numero2;

            System.out.println("Informe o primeiro numero: ");
            numero = var.nextFloat();
            System.out.println("Informe o segundo numero: ");
            numero2 = var.nextFloat();

        if (numero==numero2) {
            System.out.println("Os dois numeros são iguais");
        }else if(numero>numero2){
        System.out.println("O primero numero é maior e eles são diferentes");
        }else if(numero<numero2){
        System.out.print("O segundo numero é maior e eles são diferentes");
        }
        }
    }