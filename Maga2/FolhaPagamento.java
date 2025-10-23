import javax.swing.JOptionPane;
public class FolhaPagamento{
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite o seu nome:");

        double salarioBruto = Double.parseDouble(JOptionPane.showInputDialog
        ("Digite o salario bruto:"));

        double inss = calcularINSS(salarioBruto);

        double ImpostoDeRenda = calcularImpostoDeRenda(salarioBruto - inss);

        double salarioLiquido = salarioBruto - inss - ImpostoDeRenda;

        String mensagem = String.format(
            "Folha de Pagamento %s:\n" +
            "Salário Bruto: R$ %.2f\n" +
            "Desconto INSS: R$ %.2f\n" +
            "Desconto Imposto de Renda: R$ %.2f\n" +
            "Salário Líquido: R$ %.2f:",
            nome, salarioBruto, inss, ImpostoDeRenda, salarioLiquido);
            JOptionPane.showMessageDialog(null, mensagem, "Folha de Pagamento",
            JOptionPane.INFORMATION_MESSAGE);
    }
    private static double calcularINSS(double salarioBruto) {
         double inss = 0.0;
         if (salarioBruto <= 1212.00) {
            inss = salarioBruto * 0.075;
         } else if (salarioBruto <= 2427.35) {
            inss = (1212.00 * 0.075) + ((salarioBruto - 1212.00) * 0.09);    
         } else if (salarioBruto <= 3641.03) {
            inss = 1212.00 * 0.075 + 2427.35 * 0.09 + ((salarioBruto - 2427.35) * 0.12);
         } else if (salarioBruto <= 7087.22) {
            inss = 1212.00 * 0.075 + 2427.35 * 0.09 + 3641.03 * 0.12 + 
            ((salarioBruto - 3641.03) * 0.14);
         } else {
            inss = (1212.00 * 0.075) + ((2427.35 - 1212.00) * 0.09) + ((3641.03 - 2427.35) * 0.12) + 
            ((7087.22 - 3641.03) * 0.14);            
         }
         return inss;
        }     
        private static double calcularImpostoDeRenda(double salarioBase) {    
            double impostoDeRenda = 0.0;
            if (salarioBase <= 1903.98) {
                impostoDeRenda = 0.0;
            } else if (salarioBase <= 2826.65) {
                impostoDeRenda = (salarioBase - 1903.98) * 0.075;
            } else if (salarioBase <= 3751.05) {
               impostoDeRenda = ((2826.65 - 1903.98) *0.075 ) + ((salarioBase - 2826.65) * 0.15);
            } else if (salarioBase <= 4664.68) {
               impostoDeRenda = ((2826.65 - 1903.98) * 0.075) + ((3751.05 - 2826.65) * 0.15) + 
               ((salarioBase - 3751.05) * 0.225);
            } else {
               impostoDeRenda = ((2826.65 - 1903.98) * 0.075) + ((3751.05 - 2826.65) * 0.15) +
               ((4664.68 - 3751.05) * 0.225) + ((salarioBase - 4664.68) * 0.275);
            }
            return impostoDeRenda;
      }
   }
