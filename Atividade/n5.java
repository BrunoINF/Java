import java.util.Scanner;



class n5 {

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        float n1, n2, n3, n4, media;
        String nome;

        System.out.print("Digite seu nome: ");
        nome=var.nextLine ();
        System.out.print("informe nota1: ");
        n1 = var.nextFloat();
        System.out.print("inforrme nota2: ");
        n2 = var.nextFloat();
        System.out.print("inforrme nota3: ");
        n3 = var.nextFloat();
        media = (n1+n2+n3)/3;
        System.out.print("A média de " + nome + " é " + media);
    }
}