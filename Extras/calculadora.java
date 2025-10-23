package Extras;

public class calculadora {
    public static void main(String[] args) {

        int[] numeros = new int[3];
        int calculo;

        numeros[0] = Util.solicitNumeroInteger("Escreva o primeiro numero: ");
        numeros[1] = Util.solicitNumeroInteger("Escreva o segundo numero: ");
        calculo = Util.solicitNumeroInteger("Escreva a operação matematica (1) para + (2) para - (3) para * (4) para /");
        
            switch(calculo){
                
                case 1:
                numeros[2] = Util.adicao(numeros[0],numeros[1]);
                System.out.print("O resultado da sua adição é: " +numeros[2]);
                break;

                case 2:
                numeros[2] = Util.subitracao(numeros[0],numeros[1]);
                System.out.print("O resultado da sua subtração é: " +numeros[2]);
                break;

                case 3:
                numeros[2] = Util.multiplicacao(numeros[0],numeros[1]);
                System.out.print("O resultado da sua multiplicação é: " +numeros[2]);
                break;

                case 4:
                numeros[2] = Util.divisao(numeros[0],numeros[1]);
                System.out.print("O resultado da sua divisão é: " +numeros[2]);
                break;

                default:
                System.out.print("Sua operação não é valida");
                break;
}}}