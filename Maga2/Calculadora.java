import javax.swing.JOptionPane;
public class Calculadora {
    public static void main(String[] args) {
        try {

            String primeironumeroString = JOptionPane.showInputDialog
            ("Digite o primeiro numero (Inteiro ou futuante/real):");
            double primeironumero = Double.parseDouble(primeironumeroString);

            String segundoNumeroString = JOptionPane.showInputDialog
            ("Digite o segundo numero (Inteiro ou futuante/real):" );
            double segundoNumero = Double.parseDouble(segundoNumeroString);

            double soma = primeironumero + segundoNumero;
            double subtracao = primeironumero - segundoNumero;
            double multiplicacao = primeironumero * segundoNumero;
            double divisao = (segundoNumero !=0)
            ? primeironumero / segundoNumero : Double.NaN;

            String mensagem = String.format
            ("Resultados das operações entre %.2f e %.2f:\n ", primeironumero, segundoNumero);
            mensagem += String.format("Soma: %.2f\n", soma);
            mensagem += String.format("subtracao %.2f\n", subtracao);
            mensagem += String.format("Multiplicacao %.2f\n", multiplicacao);
            mensagem += String.format("Divisao %s\n",
            (segundoNumero != 0) ? String.format("%.2f", divisao) : "Indefinida (divisao por zero)");
        
            JOptionPane.showMessageDialog(null, mensagem, "Resultados das Operacoes", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um numero valido.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
    }
    }
}