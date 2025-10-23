package ex4;

import java.util.Scanner;

public class Idade {
      public static void main ( String []args ){
        Scanner var = new Scanner(System.in);

    String nome;
    int dia, ano, mes, idade, falta, tem, falta1;
    int ano_atual;
    int mes_atual;
    int dia_atual;


    Scanner leia = new Scanner( System.in);
    System.out.print("Digite seu nome: ");
    nome=var.nextLine ();
    System.out.print("Digite o dia em que você nasceu: ");
    dia = var.nextInt();
    System.out.print("Digite o mes em que você nasceu: ");
    mes = var.nextInt();
    System.out.print("Digite o ano em que você nasceu: ");
    ano = var.nextInt();
    System.out.print("Digite o dia de hoje: ");
    dia_atual = var.nextInt();
    System.out.print("Digite o mes atual: ");
    mes_atual = var.nextInt();
    System.out.print("Digite o ano atual: ");
    ano_atual = var.nextInt();

falta1 = (dia-dia_atual);
falta = (mes-mes_atual);
tem = (12 - falta);

    if (mes<=mes_atual) {
        if (dia<=dia_atual) {
            idade = (ano_atual-ano);
        System.out.print("Voce nasceu em "+dia+"/"+mes+ "/" +ano+ " e tem " +idade+" anos de idade e "+falta+" meses, e faltam " +tem+" meses para seu aniversario");
        }else{
        idade = (ano_atual-ano-1);
        System.out.print("Voce nasceu em "+dia+"/"+mes+ "/" +ano+ " e tem " +idade+" anos de idade e "+tem+" meses, e faltam " +falta+" meses para seu aniversario");
        }
     }else if (mes>=mes_atual){
        idade = (ano_atual-ano-1);
        System.out.print("Voce nasceu em "+dia+"/"+mes+ "/" +ano+ " e tem " +idade+" anos de idade e "+tem+" meses, e faltam " +falta+ " meses para seu aniversario");

    }
}
}