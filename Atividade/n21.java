import java.util.Scanner;

public class n21 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        float quantidade;
        int apto;
        String nome, sexo, saude;
        int contador = 0;
        int i=0;

        System.out.print("Informe a quantidade de pessoas: ");
        quantidade = var.nextFloat();

        while (i<quantidade) {
            i++;
            System.out.println("Informe o nome: ");
            nome = var.nextLine();
            System.out.println("Informe o sexo: ");
            sexo = var.nextLine();
            System.out.println("Informe a idade: ");
            int idade = var.nextInt();
            var.nextLine();
            System.out.println("Informe a saúde: ");
            saude = var.nextLine();
            System.out.println("Informe se a pessoa é apta (1)Sim (2)Não: ");
            apto = var.nextInt();
            var.nextLine(); 
            switch (apto) {
                case 1:
                    contador++;
                    break;
                case 2:
                    break;
                default:
                    System.out.print("Inválido! Por favor, escolha entre 1 e 2.");
                    break;
            }
        }
        System.out.print("São " + contador + " pessoas aptas para o trabalho");
    }
}