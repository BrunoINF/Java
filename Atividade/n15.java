import java.util.Scanner;

public class n15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int contador, i, numeros;
        int numero=0;
        contador=0;
        i=0;
        
        while (i<=79) {
            System.out.print("Digite 80 números:");
            numeros = scanner.nextInt();
            i++;
            if (numeros >=10 && numeros <=150){
                contador++;
              
            }
           
           
        } System.out.print(contador);
    
        
                
            }  
        }
        
      

