package ex3;

import java.util.Scanner;

public class merca {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        float produto;
        float quantidade, preco, total = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o nome do produto: ");
            nome = input.next();
            System.out.print("Informe o valor do produto: ");
            preco = input.nextFloat();
            System.out.print("Informe a quantidade desejada: ");
            quantidade = input.nextFloat();

            total += preco * quantidade;
        }

        System.out.print("Informe o nome do cliente: ");
        nome = input.next();
        System.out.println(nome + " comprou itens e o valor total da sua compra é de " + total);

        input.close();
    }

}
