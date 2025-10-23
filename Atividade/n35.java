import java.util.Scanner;

public class n35 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int idade;

        System.out.print("informe a sua idade: ");
        idade = var.nextInt();
       
        if (idade>5 && idade<7) {
            System.out.print("Sua categoria é infantil A");    
        }else if(idade>8 && idade<10){
            System.out.print("Sua categoria é infanil B");
        }else if(idade>11 && idade<13){
            System.out.print("Sua categoria é juvenil A");   
        }else if(idade>14 && idade<17){
            System.out.print("Sua categoria é juvenil B");   
        }else if(idade>18 && idade<25){
            System.out.print("Sua categoria é Senior");   
        }else{
            System.out.print("Idade fora da faixa etária");   
        }
}
}