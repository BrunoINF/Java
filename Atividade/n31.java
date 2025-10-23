import java.util.Scanner;

public class n31 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int A, B, C;

        System.out.print("informe o valor 1: ");
        A = var.nextInt();
        System.out.print("inforrme o valor 2: ");
        B = var.nextInt();
        System.out.print("inforrme o valor 3: ");
        C = var.nextInt();

        if(A>B && A>C){
            if (B>C) {
            System.out.print(C+ "," +B+ "," +A);    
            }else
            System.out.print(B+ "," +C+ "," +A);
        }if(B>A && B>C){
            if (A>C) {
            System.out.print(C+ "," +A+ "," +B);   
            }else
            System.out.print(A+ "," +C+ "," +B);
        }if(C>B && A<C){
            if (B>A) {
            System.out.print(A+ "," +B+ "," +C);    
            }else
            System.out.print(B+ "," +A+ "," +C);
        }
}
}
