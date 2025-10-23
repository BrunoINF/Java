import javax.swing.JOptionPane;

public class LacoDeRepeticao {
    public static void main(String[] args) {
        int continuar = JOptionPane.YES_OPTION;
        while (continuar == JOptionPane.YES_OPTION) {

            String input = JOptionPane.showInputDialog("Digite um numero:");
            
            int numero = Integer.parseInt(input);

            int diferenca = 100 - numero;
            
            String mensaem = "Falta " + diferenca + " para chegar a 100.";

            JOptionPane.showMessageDialog(null, mensaem);

            continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Continuar",
                    JOptionPane.YES_NO_OPTION);
        }
    }
}
