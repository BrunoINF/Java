import java.util.Scanner;

public class n12 {
     public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        float valorProduto, total, total2;

        System.out.print("Qual o valor do carro novo: ");
        valorProduto = var.nextFloat();

        total = (float) (valorProduto*0.73);
        total2 = total+valorProduto;

        System.out.print("O carro vai receber um acressimo de R$" +total+ " e o valor total do carro é R$"+ total2);
    }
}
