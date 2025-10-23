import java.util.Scanner;

public class n27 {
           public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int combustivel;
        float preco, desconto, total ;

        System.out.println("Informe o preço do carro: ");
        preco = var.nextInt();
        System.out.println("Informe o combustivel (1)alcool (2)gasolina (3)dissel: ");
        combustivel = var.nextInt();

        switch (combustivel) {
            case 1:
            desconto = (float)(preco*0.25);
            total= preco-desconto;
            System.out.println("O preço do seu carro a alcool é R$"+total);
                break;
            case 2:
            desconto = (float)(preco*0.21);
            total= preco-desconto;
            System.out.println("O preço do seu carro a alcool é R$"+total);
                break;
            case 3:
            desconto = (float)(preco*0.14);
            total= preco-desconto;
            System.out.println("O preço do seu carro a alcool é R$"+total);    
                break;
            default:
            System.out.println("Invalido");    
                break;
        }

    }    
}
