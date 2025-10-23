import java.util.Scanner;

public class n9 {
     public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        float D, m, r;

        System.out.print("Qual o valor depositado: ");
        D = var.nextFloat();
        System.out.print("Quantos meses rendeu: ");
        m = var.nextFloat();

        r = (float) ((D*0.17)*m);

        System.out.print("Você: R$" + r + " Reais");
    }
}
