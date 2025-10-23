import java.util.Scanner;

public class n7 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        float C, F;

        System.out.print("informe a temperatura em Celsius: ");
        C = var.nextFloat();

        F = (9*C+160)/5;
        System.out.print("A temperatura em Fahrenheit " + F);
    }
}
