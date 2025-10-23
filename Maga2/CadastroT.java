import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
//Bruno & Diogo 2-53

public class CadastroT {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);


        System.out.print("Escreva seu nome: ");
        String nome = var.nextLine();
        System.out.print("Escreva seu sobrenome:");
        String sobrenome = var.nextLine();
        System.out.print("Escreva seu sexo (m)masculino(f)femino: ");
        String sexo = var.nextLine();
        System.out.print("Escreva seu cpf:");
        int cpf = var.nextInt();
        System.out.print("Escreva seu rg:");
        String rg = var.nextLine();
        System.out.print("Escreva seu endereço:");
        String endereco = var.nextLine();
        System.out.print("Escreva seu salario:");
        Float salario = var.nextFloat();
        System.out.print("Escreva sua data de nascimento no formato AAAA-MM-DD:");
        String dataNascimentoStr = var.nextLine();
    
    LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);
    
    LocalDate dataAtual = LocalDate.now();

    Period periodo = Period.between(dataNascimento, dataAtual);

    int idade = periodo.getYears();

        System.out.println(nome+ " " +sobrenome);
        System.out.println(idade+ "anos");
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
            case "M":
                System.out.println("Masculino");
                break;
            case "F":
                System.out.println("Feminino");
                break;
            default:
            System.out.println("Genero Invalido seu animal");
                break;
        }
        
    }
}