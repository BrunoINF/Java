import java.util.Scanner;

public class n13 {
     public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        float numero;

        System.out.print("Insira um numero desejado: ");
        numero = var.nextFloat();

        if (numero>10) {
            System.out.print(" Seu numero é maior que 10");
        } else
        System.out.print(" Seu numero é menor ou igual a 10");
    }
}
