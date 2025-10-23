import java.util.Scanner;

public class n10 {
     public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        float m, p, r;

        System.out.print("Quantos mamãos você deseja: ");
        m = var.nextFloat();

        r = m*5;
        p = r/5;

        System.out.print("O total do preço de mamaões é de R$" + r + " Reais e cada prestação ficou R$" +p);
    }
}
