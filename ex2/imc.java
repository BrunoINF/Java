package ex2;

import java.util.Scanner;

public class imc {
public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    float peso, altura, imc;
    String nome;

    System.out.print("Digite seu nome: ");
    nome=var.nextLine ();
    System.out.print("informe peso: ");
    peso = var.nextFloat();
    System.out.print("inforrme altura: ");
    altura = var.nextFloat();
    imc = peso/(altura*altura);
    if(imc>=40){
            System.out.print( nome + " precisa de dieta urgente: " + imc );
        }else if(imc<=18.5){
            System.out.print( nome + " precisa de comer mais: " + imc );
        }else if (imc<=29.9 && imc>=25){
            System.out.print( nome + " precisa de comer comer um pouco menos: " + imc );
        }else if (imc<=24.9 && imc>18.5)
          System.out.print( nome + " Você esta na media continuar assim: " + imc );
        }
    }