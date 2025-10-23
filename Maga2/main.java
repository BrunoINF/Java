import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
//Bruno Possamai Moro / Diogo Bianchin Bett 253
public class main {
     private static final String FILE_PATH = "usuarios.txt";

    public static void main(String[] args) {
        while (true) { 
            String[] options = {"Adicionar Usuario", "Atualizar usuario", "Listar Usuarios", "Sair"};
        int escolha = JOptionPane.showOptionDialog(null,"Escolha sua opção",
        "Menu",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options,    
        options[0]);

        switch (escolha) {
           case 0:
              adicionarUsuario();        
              break;
           case 1:
             atualizarUsuario();
              break;
           case 2:
             listarUsuarios();
             break;
           case 3:  
               System.exit(0);
               break;
            default:
                JOptionPane.showMessageDialog(null, "Opção invalda!");
            }
        }
    }
    private static void adicionarUsuario() {
        String nome = JOptionPane. showInputDialog("Nome");
        String idadeStr = JOptionPane.showInputDialog("Idade:");
        int idade = Integer.parseInt(idadeStr);
        String cpf = JOptionPane.showInputDialog("CPF:");

        Usuario usuario = new Usuario(nome, idade, cpf);
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(usuario.toString());
            writer.newLine();
            JOptionPane.showMessageDialog(null, "Usuario adicionado com sucesso!");
        }catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao adicionar usuario.");
        }
    }

    private static void atualizarUsuario() {
        String cpf = JOptionPane.showInputDialog("CPF do usuario a ser atualizado");

        List<Usuario> usuarios = lerUsuarios();
        boolean encontrado = false;

        for (Usuario usuario : usuarios) {
            if (usuario.getcpf().equals(cpf)) {
                String nome = JOptionPane. showInputDialog("Nome");
                String idadeStr = JOptionPane.showInputDialog("Idade:");
                int idade = Integer.parseInt(idadeStr);


                usuarios.remove(usuario);
                usuarios.add(new Usuario(nome, idade, cpf));
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
                for (Usuario usuario : usuarios) {
                    writer.write(usuario.toString());
                    writer.newLine();
                }
                JOptionPane.showMessageDialog(null, "Usuario atualizado com sucesso.");
            }catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao atualizar usuario.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario não encontrado ");
        }
    }

    private static void listarUsuarios() {
        List<Usuario> usuarios = lerUsuarios();
        if (usuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum usuário encontrado.");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (Usuario usuario: usuarios) {
            sb.append("Nome:").append(usuario.getNome());
            sb.append(", Idade:").append(usuario.getIdade());
            sb.append(", CPF:").append(usuario.getcpf()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Lista de Usuarios", 
        JOptionPane.INFORMATION_MESSAGE);
    }

    private  static List<Usuario> lerUsuarios() {
        List<Usuario>    usuarios = new ArrayList<>(); 

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH)))  {
            String linha;
            while ((linha = reader.readLine()) != null) {
                usuarios.add(Usuario.fromString(linha));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return usuarios;
    }
}