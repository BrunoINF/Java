import java.util.Scanner;
//Bruno & Diogo 2-53
public class Cadastro {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        String nome, sobrenome, sexo;
        int idade;

        System.out.print("Escreva seu nome: ");
        nome = var.nextLine();
        System.out.print("Escreva seu sobrenome:");
        sobrenome = var.nextLine();
        System.out.print("Escreva sua idade:");
        idade = var.nextInt();
        var.nextLine();
        System.out.print("Escreva seu sexo (m)masculino(f)femino: ");
        sexo = var.nextLine();

        System.out.println(nome+ " " +sobrenome);
        System.out.println(idade+ " anos");
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