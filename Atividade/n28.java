import java.util.Scanner;

public class n28 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        float salario, salariomin, total, aumento;
        String nome;




            System.out.println("Informe o nome: ");
            nome = var.nextLine();
            System.out.println("Informe o salario: ");
            salario = var.nextFloat();
            System.out.println("Informe o salario minimo: ");
            salariomin = var.nextFloat();

           if (salario<3*salariomin) {
            aumento= (float) (salario*0.5);
            total= aumento+salario;
            System.out.println(nome+ " Seu salario ficara: R$"+total);
           }else  if(salario<10*salariomin && salario>3*salariomin){
            aumento= (float) (salario*0.20);
            total= aumento+salario;
            System.out.println(nome+ " Seu salario ficara: R$"+total);
           }else  if(salario>10*salariomin && salario<20*salariomin){
            aumento= (float) (salario*0.15);
            total= aumento+salario;
            System.out.println(nome+ " Seu salario ficara: R$"+total);
           }else{
            aumento= (float) (salario*0.10);
            total= aumento+salario;
            System.out.println(nome+ " Seu salario ficara: R$"+total);
           }   
    }
}