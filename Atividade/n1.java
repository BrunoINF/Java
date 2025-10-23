import java.util.Scanner;



class n1 {

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        float n1, n2, r;

        System.out.print("informe numero1: ");
        n1 = var.nextFloat();
        System.out.print("inforrme numero2: ");
        n2 = var.nextFloat();

        r = n1+n2;
        System.out.print("O resultado é " + r);
    }
}