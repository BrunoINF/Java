import java.util.Scanner;

public class n30 {
        public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        String nome;
        int idade, sexo;
        float salario, total;

        System.out.print("Informe o seu nome: ");
        nome = var.nextLine();
        System.out.print("Informe a sua idade: ");
        idade = var.nextInt();
        System.out.print("Informe o sexo (1)Homen (2)Mulher: ");
        sexo = var.nextInt();
        System.out.print("Informe o seu salario fixo: ");
        salario = var.nextFloat();

        if(sexo==1 && idade>=30){
        total = salario+100; 
        System.out.println("Seu salario liquido ficou R$" +total);
    }else if(sexo==1 && idade<30){
        total = salario+50; 
        System.out.println("Seu salario liquido ficou R$" +total);
    }else if(sexo==2 && idade>=30){
        total = salario+200; 
        System.out.println("Seu salario liquido ficou R$" +total);
    }else if(sexo==2 && idade<30){
        total = salario+80; 
        System.out.println("Seu salario liquido ficou R$" +total);
    }        
}
}