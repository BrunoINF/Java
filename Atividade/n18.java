import java.util.Scanner;

public class n18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int contador1, contador2, i, numeros;
        int numero=0;
        contador1=0;
        contador2=0;
        i=0;
        
        while (i<=79) {
            System.out.print("Digite 80 números:");
            numeros = scanner.nextInt();
            i++;
            if (numeros >18){
                contador1++;
              
            }else
                contador2++;
           
           
    } System.out.print(contador1+" São maior de idade");
      System.out.print(contador2+" São menor de idade");
    
        
                
            }  
        }