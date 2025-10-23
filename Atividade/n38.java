import java.util.Scanner;



class n38 {

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        float n1, n2, n3, media;

        System.out.print("informe nota1: ");
        n1 = var.nextFloat();
        System.out.print("inforrme nota2: ");
        n2 = var.nextFloat();
        System.out.print("inforrme nota3: ");
        n3 = var.nextFloat();

        if (n1>=0 && n1<=2) {
            
        }else{
            System.out.println(" A nota 1 é invalida"); 
            n1 = 0;
        }if(n2>0 && n2<=3){

        }else{
            System.out.println(" A nota 2 é invalida"); 
            n2 = 0;
        }if (n3>0 && n3<=5) {
            
        }else {
            System.out.println(" A nota 3 é invalida"); 
            n3 = 0;
        }
        media = (n1+n2+n3);
            System.out.print("A sua nota é "+media); 
}
}