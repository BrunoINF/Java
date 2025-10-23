import java.util.Scanner;

public class n19 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       int contador1, contador2, i, numeros;
        int numero=0;
        contador1=0;
        contador2=0;
        int genero;
        
        i=0;
        while (i<=55) {
            System.out.print("Escreva (1) para masculino (2) para femin:");
            genero = scanner.nextInt();
            i++;
            switch (genero) {
                case 1:
                    contador1++;
                    break;
                 case 2:
                    contador2++;
                    break;
            
                default:
                System.out.println("Erro");
                    break;
            }
           
           
    } System.out.println(contador1+" São homens");
      System.out.println(contador2+" São mulheres");
            }  
        }