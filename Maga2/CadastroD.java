import java.util.Scanner;
//Bruno & Diogo 2-53
public class CadastroD {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        String nome, sobrenome, sexo, endereco, rg;
        int idade, cpf;
        float salario;

        System.out.print("Escreva seu nome: ");
        nome = var.nextLine();
        System.out.print("Escreva seu sobrenome:");
        sobrenome = var.nextLine();
        System.out.print("Escreva o ano que você nasceu:");
        idade = var.nextInt();
        var.nextLine();
        System.out.print("Escreva seu sexo (m)masculino(f)femino: ");
        sexo = var.nextLine();
        System.out.print("Escreva seu cpf:");
        cpf = var.nextInt();
        System.out.print("Escreva seu rg:");
        rg = var.nextLine();
        System.out.print("Escreva seu endereço:");
        endereco = var.nextLine();
        System.out.print("Escreva seu salario:");
        salario = var.nextFloat();

        idade = 2024-idade;

        System.out.println(nome+ " " +sobrenome);
        System.out.println("Sua idade é "+idade+ " anos");
        System.out.println("Seu Rg"+rg);
        System.out.println("Seu Cpf: "+cpf);
        System.out.println("Seu endereço: "+endereco);
        System.out.println("Seu salario é: R$"+salario);
        switch (sexo) {
            case "m":
                System.out.println("Masculino");
                break;
            case "f":
                System.out.println("Feminino");
                break;
            default:
            System.out.println("Genero Invalido seu animal");
                break;
        }
        
    }
}