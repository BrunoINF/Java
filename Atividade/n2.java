import java.util.Scanner;



class n2 {

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        float n1, n2, a, s, m, d;

        System.out.print("informe numero1: ");
        n1 = var.nextFloat();
        System.out.print("inforrme numero2: ");
        n2 = var.nextFloat();

        a = n1+n2;
        s = n1-n2;
        m = n1*n2;
        d = n1/n2;

        System.out.print("O resultado da adição é: " + a);
        System.out.print(" da subtração é: " + s);
        System.out.print(" da multiplicação é: " + m);
        System.out.print(" da divisão é: " + d);
    }
}