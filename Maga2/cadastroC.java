import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
//Bruno & Diogo 2-53
public class cadastroC {
   private static final String File_PATH = "cadastro1.txt";
      public static void main(String[] args) {
        while (true) { 
            String nome = JOptionPane.showInputDialog(null, "Escreva seu nome: ", "Cadastro de usuario", JOptionPane.PLAIN_MESSAGE);
            if(nome == null || nome.trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Bota um nome pessoa", "ERRO", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            String sobrenome =JOptionPane.showInputDialog(null, "Escreva seu sobrenome: ", "Cadastro de usuario",  JOptionPane.PLAIN_MESSAGE);
            if(sobrenome == null || sobrenome.trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Bota um sobrenome sem familia",
                 "ERRO", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            String idade =JOptionPane.showInputDialog(null, "Escreva sua idade: ",
             "Cadastro de usuario",  JOptionPane.PLAIN_MESSAGE);
            if(idade == null || idade.trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Bota uma idade", "ERRO",
                 JOptionPane.ERROR_MESSAGE);
                continue;
            }
            String enderoco =JOptionPane.showInputDialog(null, "Escreva seu endereço: ",
            "Cadastro de usuario",  JOptionPane.PLAIN_MESSAGE);
           if(enderoco == null || enderoco.trim().isEmpty()){
               JOptionPane.showMessageDialog(null, "Bota a tua locolização mora aonde de baixo da ponte", "ERRO",
                JOptionPane.ERROR_MESSAGE);
               continue;
           }
            String[] opcoesSexo = {"Masulino", "Feminino"};
            String sexo =(String) JOptionPane.showInputDialog(null, "Selecione Sexo: ", "Cadastro de usuario", JOptionPane.PLAIN_MESSAGE, null, opcoesSexo,opcoesSexo[0]);
            if (sexo == null){
                JOptionPane.showMessageDialog(null, "Seleciona um sexo animal!",
                 "Erro!", JOptionPane.ERROR_MESSAGE);
            continue;
            }
            String telefone =JOptionPane.showInputDialog(null, "Escreva seu número: ",
            "Cadastro de usuario",  JOptionPane.PLAIN_MESSAGE);
           if(telefone == null || telefone.trim().isEmpty()){
               JOptionPane.showMessageDialog(null, "Bota teu número ae quer que eu etre em contato como", "ERRO",
                JOptionPane.ERROR_MESSAGE);
               continue;
           }
            String senhacar =JOptionPane.showInputDialog(null, "Escreva a senha do seu cartão do banco: ", "Cadastro de usuario",  JOptionPane.PLAIN_MESSAGE);
            if(senhacar == null || sobrenome.trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Bota a SENHA DO CARTÃO",
                 "ERRO", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            salvarCadastro(nome, sobrenome, idade, sexo, enderoco, senhacar, telefone);
            int resposta = JOptionPane.showConfirmDialog(null, 
            "Deseja Cadastrar outra pessoa?",
             "Continuar?", JOptionPane.YES_NO_OPTION);
             if (resposta == JOptionPane.NO_OPTION){
                break;
             }
        }
      }
    
      private static void salvarCadastro(String nome, String sobrenome, String idade, String sexo, String enderoco, String senhacar, String telefone){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(File_PATH, true))){
        writer.write("Nome completo é: "+nome + " " +sobrenome);
        writer.newLine();
        writer.write("A idade é: " +idade+ " anos");
        writer.newLine();
        writer.write("O sexo é: " + sexo);
        writer.newLine();
        writer.write("O telefone: " +telefone);
        writer.newLine();
        writer.write("E mora em: " +enderoco);
        writer.newLine();
        writer.write("A senha do cartão do banco é: " +senhacar);
        writer.newLine();
        writer.write("============================================================================================================================");
        JOptionPane.showMessageDialog(null, "Cadstro realizado com sucesso", 
        "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro não deu pra salvar", 
            "Erro", JOptionPane.ERROR_MESSAGE);
        }
      }
    
    }