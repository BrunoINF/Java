import java.util.Scanner;

public class n26 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int numero;

            System.out.println("Informe o um numero que esteja entre 1 e 5: ");
            numero = var.nextInt();


       switch (numero) {
        case 1:
        System.out.println("Um");
            break;
        case 2:
        System.out.println("Dois");
            break;
        case 3:
        System.out.println("Três");
            break;
        case 4:
        System.out.println("Quatro"); 
            break;
        case 5:
        System.out.println("Cinco"); 
            break;
        default:
        System.out.println("Numero invalido ");
            break;
       }
    }
}