import java.util.Scanner;

public class n4 {
        public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        float s, v,c, cc, r;
        String nome;

        System.out.print("Digite seu nome: ");
        nome=var.nextLine ();
        System.out.print("informe o seu salario: ");
        s = var.nextFloat();
        System.out.print("inforrme valor de vendas: ");
        v = var.nextFloat();

        c = (s+v)/100;
        cc = c*15;
        r = s+v+cc;

        System.out.print("O vendedor " + nome + " recebeu R$" + r + " e sua comição foi de R$" +cc);
    }
}