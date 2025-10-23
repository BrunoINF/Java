import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
//Bruno & Diogo 2-53
public class CadastroQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastro de Pessoas");
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.println("Digite o seu sexo: ");
        String sexo = scanner.nextLine();

        salvarCadastro(nome,sobrenome,sexo);

        System.out.println("cadastro salvo com sucesso!");
    }
        public static void salvarCadastro(String nome, String sobrenome, String sexo){
            try{
                FileWriter fileWriter = new FileWriter("cadastroDecliente.txt",true);
                PrintWriter printWriter = new PrintWriter(fileWriter);

                printWriter.println("Nome: " +nome);
                printWriter.println("Sobrenome: " +sobrenome);
                printWriter.println("Sexo: " +sexo);
                printWriter.println();

                printWriter.close();
            } catch (IOException e){
                System.out.println("Erro ao salvar o cadastro: " +e.getMessage());
            }
        }
    }
