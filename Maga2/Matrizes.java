
import javax.swing.JOptionPane;
public class Matrizes {
public static void main(String[] args) {
    String inputLinhas = JOptionPane.showInputDialog("Insira o numero de linhas da matriz");
    int linhas = Integer.parseInt(inputLinhas);
    String inputColunas = JOptionPane.showInputDialog("Insira o numero de colunas da matriz:");
    int colunas = Integer.parseInt(inputColunas);
    int [][] matriz = new int[linhas][colunas];
    for (int i = 0; i < linhas; i++) {
        for ( int j = 0; j < colunas; j++) {
            String inputValor = JOptionPane.showInputDialog("Insira o valor para a posição [" + i + "][" + j + "]:");
            matriz[i][j] = Integer.parseInt(inputValor);
        }
    }
    StringBuilder matrizStr = new StringBuilder("Matriz preenchida:\n");
    for (int i = 0; i < linhas; i++){
        for ( int j = 0; j < colunas; j++) {
            matrizStr.append(matriz[i][j]).append(" ");
        }
        matrizStr.append("\n");
    }
    JOptionPane.showMessageDialog(null, matrizStr.toString());
    }  
}
