import javax.swing.JOptionPane;
//Bruno & Diogo 2-53
public class ConcatenacaoValores{
    public static void main(String[] args){
        String primerovalor = JOptionPane.showInputDialog("Digite o primeiro valor:");

        String segundoValor = JOptionPane.showInputDialog("Digite o segundo valor:");

        String resultado = primerovalor+segundoValor;

        JOptionPane.showMessageDialog(null, "Resultado da concatenacao: " + resultado, "Resultado ", JOptionPane.INFORMATION_MESSAGE);
    
}}