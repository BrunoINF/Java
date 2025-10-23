import java.util.Scanner;

public class n32 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int A, B, r;
        String C;

        System.out.print("Escreva o valor para A: ");
        A = var.nextInt();
        System.out.print("Escreva o valor para B: ");
        B = var.nextInt();
        var.nextLine();
        System.out.print("Escreva operação '+' para adição '-' para subitração '*' para multiplicação e '/' para divisão: ");
        C = var.nextLine();

            switch(C){
                case "+":
                r = A+B;
                System.out.print("O resultado da sua adição é: " +r);
                break;

                case "-":
                r = A-B;
                System.out.print("O resultado da sua subtração é: " +r);
                break;

                case "*":
                r = A*B;
                System.out.print("O resultado da sua multiplicação é: " +r);
                break;

                case "/":
                if(B==0 || A==0){
                    System.out.print("Erro Impossivel dividir por zero");
                    break;
                }else{
                r = A/B;
                System.out.print("O resultado da sua divisão é: " +r);
                break;
                }
                default:
                System.out.println("Sua operação não é valida");
                break;

        }
       
        }
    }
