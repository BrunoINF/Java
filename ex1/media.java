package ex1;

import java.util.Scanner;

class media {

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
        System.out.print("inforrme nota4: ");
        n4 = var.nextFloat();
        media = (n1+n2+n3+n4)/4;
        if(media>=6){
                System.out.print("O(a) aluno(a)" + nome + " foi aprovado(a) com a média: " + media );
            }else if(media>=3 && media <6){
                System.out.print("O(a) aluno(a)" + nome + " esta de recuperação(a) com a média: " + media );
            }else if(media<2.9){
              System.out.print(" O(a) aluno(a)" + nome + " foi reprovado(a) (prepara o lombo pra levar varda) com a média: " + media );
            }
        }
}