import java.util.Scanner;

public class n14 {
     public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        float numero, numero2;

        System.out.print("Insira o primeiro numero desejado: ");
        numero = var.nextFloat();
        System.out.print("Insira o segundo numero desejado: ");
        numero2 = var.nextFloat();

        if (numero>numero2) {
            System.out.print("Primeiro numero é maior");
        } else
        System.out.print("Segundo numero é maior");
    }
}
