import java.util.Scanner;

public class n8 {
        public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        float D, C, r;

        System.out.print("informe quantos dolares você tem: ");
        D = var.nextFloat();
        System.out.print("inforrme a Cotação do dolar atualmente: ");
        C = var.nextFloat();

        r = D*C;
        System.out.print("Você: R$" + r + " Reais");
    }
}
