import java.util.Scanner;

public class n34 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int nivel, horas, salario, salariomes;

        System.out.print("informe o seu level de professor: ");
        nivel = var.nextInt();
        System.out.print("informe quantas horas você da aula: ");
        horas = var.nextInt();

        switch (nivel) {
            case 1:
            salario = 12*horas;
            salariomes = salario*4;
            System.out.print("Seu Salario é de R$" +salario+ " por dia e por mes da R$" +salariomes);
                break;
            case 2:
            salario = 17*horas;
            salariomes = salario*4;
            System.out.print("Seu Salario é de R$" +salario+ " por dia e por mes da R$" +salariomes);
                break;
            case 3:
            salario = 25*horas;
            salariomes = salario*4;
            System.out.print("Seu Salario é de R$" +salario + " por dia e por mes da R$" +salariomes);
                break;
        
            default:
                break;
        }
}
}