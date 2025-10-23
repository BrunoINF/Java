import java.util.Scanner;

public class n20 {
           public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        float ano, preco, resultado, resultado2;
        int i=1;

while (i<2) {

    System.out.print(" Quer continuar (1) para sim (2) para não? ");
    i = var.nextInt();
    System.out.print(" informe o preço do veiculo: ");
    preco = var.nextFloat();
    System.out.print(" informe o ano do veiculo: ");
    ano = var.nextFloat();

    if(ano<=2000){
        resultado = (float) (preco*0.12);
        resultado2 = (preco+resultado);
        System.out.print("O preço do seu carro com os impostos é: " +resultado2);
    }else {
        System.out.print(" Isso mesmo");
        resultado = (float) (preco*0.07);
        resultado2 = (preco+resultado);
        System.out.print("O preço do seu carro com os impostos é: " +resultado2);
    }

  
  
}    
}
}

