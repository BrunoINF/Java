import java.util.Scanner;

public class n11 {
     public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        float percentual, valorProduto, total, total2;

        System.out.print("Qual o valor do produto: ");
        valorProduto = var.nextFloat();
        System.out.print("Qual o percentual: ");
        percentual = var.nextFloat();

        total = (percentual/100)*valorProduto;
        total2 = total+valorProduto;

        System.out.print("O produto vai receber um acressimo de R$" +total+ " e o valor total é R$"+ total2);
    }
}
