import  javax.swing.JOptionPane;
//Bruno & Diogo 2-53
public class AtividadePanqueca{
    public static void main(String[] args) {
        int i=1;
        JOptionPane.showMessageDialog(null, "Codigo para fazer panquecas");
        JOptionPane.showMessageDialog(null, "Pegue 1 ovo");
        JOptionPane.showMessageDialog(null, "Pegue 120ml de leite");
        JOptionPane.showMessageDialog(null, "Pegue 1 xicara de farinha de trigo");
        JOptionPane.showMessageDialog(null, "Pegue 2 colheres de sopa de açucar");
        JOptionPane.showMessageDialog(null, "Pegue meia dolher de chá de fermento");
        JOptionPane.showMessageDialog(null, "Pegue 1 xicara de oleo de soja");
        JOptionPane.showMessageDialog(null, "Pegue 1 vasilha");
        JOptionPane.showMessageDialog(null, "Misture tudo na vasilha");
        JOptionPane.showMessageDialog(null, "Pegue a frigideira");
        JOptionPane.showMessageDialog(null, "Ligue o fogão");
        JOptionPane.showMessageDialog(null, "Coloque a frigideira sobre o fogo");
        JOptionPane.showMessageDialog(null, "Pegue uma concha");
        while(i<3){
        i++;
        JOptionPane.showMessageDialog(null, "Coloque 1 concha e meia da mistura");
        JOptionPane.showMessageDialog(null, "Espere dar o ponto");
        JOptionPane.showMessageDialog(null, "Vire");
        JOptionPane.showMessageDialog(null, "Tire a panqueca");}
        JOptionPane.showMessageDialog(null, "Desligue o fogo");
        String[] opcoes = {"Sim", "Não"};
        String melhorar =(String) JOptionPane.showInputDialog(null, "Selecione se você quer melhorar a sua panqueca: ", "Panqueca", JOptionPane.PLAIN_MESSAGE, null, opcoes,opcoes[0]);
        if (melhorar == "Sim"){
            JOptionPane.showMessageDialog(null, "Pegue 100g de chocolate");
            JOptionPane.showMessageDialog(null, "Derreta o chocalte");
            JOptionPane.showMessageDialog(null, "Pegue uma seringa");
            JOptionPane.showMessageDialog(null, "Coloque o chocolate na seringa");
            JOptionPane.showMessageDialog(null, "Coloque na panqueca");
            JOptionPane.showMessageDialog(null, "Coma a Panqueca");
    }else{JOptionPane.showMessageDialog(null, "Coma a Panqueca");}
}
}