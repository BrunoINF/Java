import java.util.Scanner;

class n3 {

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        float d, c, r;

        System.out.print("informe a distancia percorrida: ");
        d = var.nextFloat();
        System.out.print("inforrme o combustivel: ");
        c = var.nextFloat();

        r = d/c;
        System.out.print("O consumo médio é de: " + r + "L");
    }
}