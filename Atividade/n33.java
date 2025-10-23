import java.util.Scanner;

public class n33 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int A, B, C;

        System.out.print("informe o valor 1: ");
        A = var.nextInt();
        System.out.print("inforrme o valor 2: ");
        B = var.nextInt();
        System.out.print("inforrme o valor 3: ");
        C = var.nextInt();

        if(A==B && B==C){
            System.out.print("Seu triangulo é um Equilátero mas também é um Isósceles");
        }else if(A==B || A==C || B==C){
            System.out.print("Seu triangulo é um Isósceles");
        }else {
            System.out.print("Seu triangulo é um Escaleno");
}
}
}