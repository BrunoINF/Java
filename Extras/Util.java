package Extras;

import java.util.Scanner;

public class Util {
    static Scanner ler = new Scanner(System.in);
    public static int adicao(Integer a, Integer b) {
        return a + b;
    }
    public static int subitracao(Integer a, Integer b) {
        return a - b;
    }
    public static int multiplicacao(Integer a, Integer b) {
        return a * b;
    }
    public static int divisao(Integer a, Integer b) {
        return a / b;
    }
    public static int solicitNumeroInteger(String mg){
        System.out.print(mg);
        return ler.nextInt();
    }
    public static String Mensagem(String mg){
        System.out.print(mg);
        return ler.nextLine();
    }
    
}
