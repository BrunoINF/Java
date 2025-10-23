import javax.swing.JOptionPane;

public class Vetor {

public static void main(String[] args) {
        
   String[] valores = new String[4];
   
   for (int i =0; i < valores.length; i++) {
    valores[i] = JOptionPane.showInputDialog("Digite o valor " + (i + 111) + ":");
   }

   StringBuilder mensagem = new StringBuilder("Valores digitados:\n");
   for (int i = 0; i < valores.length; i++) {
    mensagem.append("Valor ").append(i + 1).append(":").append(valores[i]).append("\n");
   }

   JOptionPane.showMessageDialog(null, mensagem.toString(), "Valores Digitados",
   JOptionPane.INFORMATION_MESSAGE);
    }
}
