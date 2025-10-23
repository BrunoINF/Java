import java.util.Scanner;

public class n37 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        float idade, altura, pesoideal;
        String sexo;

        System.out.print("informe sua idade: ");
        idade = var.nextFloat();
        System.out.print("inforrme a sua altura: ");
        altura = var.nextFloat();
        var.nextLine();
        System.out.print("inforrme o seu sexo 'm' masculino 'f' feminino: ");
        sexo = var.nextLine();

       switch (sexo) {
        case "m":
        if (altura>1.70) {
            if (idade<=20) {
                pesoideal = (int)((altura*72.7)-58);
                System.out.print("O peso ideal para você é " +pesoideal);
            }else{
                    if (idade>21 && idade<39) {
                        pesoideal = (int)((altura*72.7)-53);
                        System.out.print("O peso ideal para você é " +pesoideal);
                    }else if(idade>=40){
                        pesoideal = (int)((altura*72.7)-45);
                        System.out.print("O peso ideal para você é " +pesoideal);
        }}}else if(altura<=1.70){
            if (idade<=40) {
                pesoideal = (int)((altura*72.7)-50);
                System.out.print("O peso ideal para você é " +pesoideal);
            }else if(idade>40){
                        pesoideal = (int)((altura*72.7)-58);
                        System.out.print("O peso ideal para você é " +pesoideal);
        }}    
            break;
        case "f":
            if(altura>1.50){
            pesoideal = (int)((altura*62.1)-44.7);
            System.out.print("O peso ideal para você é " +pesoideal);
            }else if(altura<=1.5){
                if (idade>=35) {
                   pesoideal = (int)((altura*62.1)*-45);
                   System.out.print("O peso ideal para você é " +pesoideal); 
                }
            }
            break;
        default:
        System.out.print("Invalido");
            break;
       }
       }  
    }