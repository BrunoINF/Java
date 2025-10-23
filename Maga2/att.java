import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
//Bruno & Diogo 2-53
public class att {
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
            String telefone =JOptionPane.showInputDialog(null, "Escreva seu número de telefone: ",
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
            String ceu =JOptionPane.showInputDialog(null, "Escreva você quer ir pro ceu ou inferno: ",
            "Cadastro de usuario",  JOptionPane.PLAIN_MESSAGE);
           if(ceu == null || ceu.trim().isEmpty()){
               JOptionPane.showMessageDialog(null, "Bota a tua locolização mora aonde de baixo da ponte", "ERRO",
                JOptionPane.ERROR_MESSAGE);
               continue;
           }
           String cpf =JOptionPane.showInputDialog(null, "Escreva seu cpf: ",
           "Cadastro de usuario",  JOptionPane.PLAIN_MESSAGE);
          if(cpf == null || cpf.trim().isEmpty()){
              JOptionPane.showMessageDialog(null, "Bota a tua locolização mora aonde de baixo da ponte", "ERRO",
               JOptionPane.ERROR_MESSAGE);
              continue;
          }
          String rg =JOptionPane.showInputDialog(null, "Escreva seu rg: ",
          "Cadastro de usuario",  JOptionPane.PLAIN_MESSAGE);
         if(rg == null || rg.trim().isEmpty()){
             JOptionPane.showMessageDialog(null, "Bota a tua locolização mora aonde de baixo da ponte", "ERRO",
              JOptionPane.ERROR_MESSAGE);
             continue;
         }
         String anime =JOptionPane.showInputDialog(null, "Escreva qual seu anime preferido: ",
         "Cadastro de usuario",  JOptionPane.PLAIN_MESSAGE);
        if(anime == null || anime.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Bota a tua locolização mora aonde de baixo da ponte", "ERRO",
             JOptionPane.ERROR_MESSAGE);
            continue;
        }
        String jogo =JOptionPane.showInputDialog(null, "Escreva seu jogo preferido: ",
        "Cadastro de usuario",  JOptionPane.PLAIN_MESSAGE);
       if(jogo == null || jogo.trim().isEmpty()){
           JOptionPane.showMessageDialog(null, "Bota a tua locolização mora aonde de baixo da ponte", "ERRO",
            JOptionPane.ERROR_MESSAGE);
           continue;
       }
       String refeicoes =JOptionPane.showInputDialog(null, "Escreva qunatas refeições você faz pro dia: ",
       "Cadastro de usuario",  JOptionPane.PLAIN_MESSAGE);
      if(refeicoes == null || refeicoes.trim().isEmpty()){
          JOptionPane.showMessageDialog(null, "Bota a tua locolização mora aonde de baixo da ponte", "ERRO",
           JOptionPane.ERROR_MESSAGE);
          continue;
      }
      String amigo =JOptionPane.showInputDialog(null, "Escreva o nome do seu melhor amigo: ",
      "Cadastro de usuario",  JOptionPane.PLAIN_MESSAGE);
     if(amigo == null || amigo.trim().isEmpty()){
         JOptionPane.showMessageDialog(null, "Bota a tua locolização mora aonde de baixo da ponte", "ERRO",
          JOptionPane.ERROR_MESSAGE);
         continue;
     }
      String comida =JOptionPane.showInputDialog(null, "Escreva sua comida preferida: ",
      "Cadastro de usuario",  JOptionPane.PLAIN_MESSAGE);
     if(comida == null || ceu.trim().isEmpty()){
         JOptionPane.showMessageDialog(null, "Bota a tua locolização mora aonde de baixo da ponte", "ERRO",
          JOptionPane.ERROR_MESSAGE);
         continue;
     }
     String animal =JOptionPane.showInputDialog(null, "Escreva o seu animal preferido: ",
     "Cadastro de usuario",  JOptionPane.PLAIN_MESSAGE);
    if(animal == null || animal.trim().isEmpty()){
        JOptionPane.showMessageDialog(null, "Bota a tua locolização mora aonde de baixo da ponte", "ERRO",
         JOptionPane.ERROR_MESSAGE);
        continue;
    }    
    String time =JOptionPane.showInputDialog(null, "Escreva o seu time preferido (menos Inter e Corintias): ",
    "Cadastro de usuario",  JOptionPane.PLAIN_MESSAGE);
   if(time == null || time.trim().isEmpty()){
       JOptionPane.showMessageDialog(null, "Bota a tua locolização mora aonde de baixo da ponte", "ERRO",
        JOptionPane.ERROR_MESSAGE);
       continue;
   }
   String[] opcoes = {"Sim", "Não"};
   String nomorada =(String) JOptionPane.showInputDialog(null, "Selecione se você namora: ", "Cadastro de usuario", JOptionPane.PLAIN_MESSAGE, null, opcoes,opcoes[0]);
   if (nomorada == null){
       JOptionPane.showMessageDialog(null, "Seleciona seu animal!",
        "Erro!", JOptionPane.ERROR_MESSAGE);
   continue;
   }
   String estudo =(String) JOptionPane.showInputDialog(null, "Selecione se você estuda: ", "Cadastro de usuario", JOptionPane.PLAIN_MESSAGE, null, opcoes,opcoes[0]);
   if (estudo == null){
       JOptionPane.showMessageDialog(null, "Seleciona seu animal!",
        "Erro!", JOptionPane.ERROR_MESSAGE);
   continue;
   }
   String preparo =(String) JOptionPane.showInputDialog(null, "Selecione se você esta preparado: ", "Cadastro de usuario", JOptionPane.PLAIN_MESSAGE, null, opcoes,opcoes[0]);
   if (preparo == null){
       JOptionPane.showMessageDialog(null, "Seleciona seu animal!",
        "Erro!", JOptionPane.ERROR_MESSAGE);
   continue;
   }
            salvarCadastro(nome, sobrenome, idade, sexo, enderoco, senhacar, telefone, ceu, anime, cpf, rg, refeicoes, comida, jogo, amigo, animal, time, nomorada, estudo, preparo);
            int resposta = JOptionPane.showConfirmDialog(null, 
            "Deseja Cadastrar outra pessoa?",
             "Continuar?", JOptionPane.YES_NO_OPTION);
             if (resposta == JOptionPane.NO_OPTION){
                break;
             }
             
        }
      }
    
      private static void salvarCadastro(String nome, String sobrenome, String idade, String sexo, String enderoco, String senhacar, String telefone, String ceu, String anime, String cpf, String rg, String comida, String refeicoes, String jogo, String amigo, String animal, String time, String namorada, String estudo, String preparo){
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
        writer.write("O cpf: " +cpf);
        writer.newLine();
        writer.write("O rg: " +rg);
        writer.newLine();
        writer.write("A senha do cartão do banco é: " +senhacar);
        writer.newLine();
        writer.write("O anime preferido é: " +anime);
        writer.newLine();
        writer.write("Quer ir para: " +ceu);
        writer.newLine();
        writer.write("o jogo preferido: " +jogo);
        writer.newLine();
        writer.write("A comida preferida: " +comida);
        writer.newLine();
        writer.write("O numero de refeicoes: " +refeicoes);
        writer.newLine();
        writer.write("O melhor amigo: " +amigo);
        writer.newLine();
        writer.write("O animal preferio: " +animal);
        writer.newLine();
        writer.write("Se namora: " +namorada);
        writer.newLine();
        writer.write("Se estuda : " +estudo);
        writer.newLine();
        writer.write("Se esta preparado: " +preparo);
        writer.newLine();
        writer.write("Time preferiodo: " +time);
        writer.newLine();
        writer.write("==========================================================================================================================");
        JOptionPane.showMessageDialog(null, "Cadstro realizado com sucesso", 
        "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro não deu pra salvar", 
            "Erro", JOptionPane.ERROR_MESSAGE);
        }
      }
    
    }