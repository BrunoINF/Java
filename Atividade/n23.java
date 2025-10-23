import java.util.Scanner;

public class n23 {
           public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        float numero;

    System.out.print(" informe o numero: ");
    numero = var.nextFloat();

    if (numero==40) {
        System.out.print("Seu numero é 40");

    }else if(numero>80){
        System.out.print("Seu numero é maior que 80");
    }else if (numero<25){
        System.out.print("Seu numero é menor que 25");
    }else{
        System.out.print("Seu numero é um numero");
    }
} 
       
}

