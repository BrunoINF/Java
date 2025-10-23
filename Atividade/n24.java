import java.util.Scanner;

public class n24 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        float numero, quantidade;
        int i=0;    

        System.out.print("Informe a quantidade de numeros: ");
        quantidade = var.nextFloat();
        var.nextLine();

        while (i<quantidade) {
            i++;
            System.out.println("Informe o numero: ");
            numero = var.nextFloat();
        if (numero<0) {
            System.out.println("Seu numero é menor que zero");
        }else if(numero>0){
        System.out.println("Seu numero é maior que zero");
        }else if(numero==0){
        System.out.print("Seu numero é igual a 0");
        }
        }
    }
}