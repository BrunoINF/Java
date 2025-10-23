import javax.swing.JOptionPane;
//Bruno & Diogo 2-53
public class ColetaDeDados {
public static void main(String[] args) {

    String texto = JOptionPane.showInputDialog("Digite um valor para \n uma variavel do tipo\n String'texto: '");

    int inteiro = Integer.parseInt(JOptionPane.showInputDialog
    ("Digite um valor para \n uma variavel do tipo inteiro\n 'ex: numero indivisivel/sem virgula'"));

    double PontoFlutuante = Double.parseDouble(JOptionPane.showInputDialog
    ("Digite um valor para \n uma variavel do tipo float/real \n ex:'numero divisivel' "));

    int respostaBoolean = JOptionPane.showConfirmDialog(null,
    "\"Escolha uma opção para uma variavel do tipo boleano \n "
    ,"Escolha", JOptionPane.YES_NO_OPTION );
    boolean booleano = (respostaBoolean == JOptionPane.YES_OPTION);

    String mensagem = String.format
    ("vae. String: %s\nvar. inteiro: %d\nvar. Float/real: %.2f\nvar. boleana: %b",
     texto, inteiro, PontoFlutuante, booleano);
     JOptionPane.showMessageDialog(null, mensagem, "Dados Inseridos", JOptionPane.INFORMATION_MESSAGE);
    }
}