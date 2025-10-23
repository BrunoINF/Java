import java.util.Scanner;

public class n22 {
           public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        float preco, venda, lucro, media;
        int i=1;
        int contador = 0;
        int contador2 = 0;
            
 
        while (i<3) {
    i++;
    System.out.println(" informe o preço de custo do produto: ");
    preco = var.nextFloat();
    System.out.print(" informe o venda: ");
    venda = var.nextFloat();
    if (venda<preco) {
        lucro=  venda-preco;
        System.out.println(" Você recebeu um lucro negativo de R$"+lucro);
        contador2++;
    }else{
        lucro=  venda-preco;
        System.out.println(" Você recebeu um lucro de R$"+lucro);
        contador++;

    }
} 
        media=(contador-contador2)/2;

        System.out.print(" A sua media de lucro é igual a R$" +media);  
}
}

