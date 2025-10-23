import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//Bruno & Diogo 2-53
public class MainMenu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(470, 370);
        frame.setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();

        JMenu menu = new JMenu("Opções");
        menuBar.add(menu);

        JMenuItem Cadastro1 = new JMenuItem("Cadastro 1");
        JMenuItem Cadastro2 = new JMenuItem("Cadastro 2");
        JMenuItem Cadastro3 = new JMenuItem("Cadastro 3");
        JMenuItem Cadastro4 = new JMenuItem("Cadastro 4");
        JMenuItem Cadastro5 = new JMenuItem("Cadastro 5");
        JMenuItem oloMundoPopupItem = new JMenuItem("Olá Mundo Popup");
        JMenuItem Atividade1 = new JMenuItem("Atividade 1");
        JMenuItem Atividade2 = new JMenuItem("Atividade 2");
        JMenuItem Atividade3 = new JMenuItem("Atividade 3");
        JMenuItem Atividade4 = new JMenuItem("Atividade 4");
        JMenuItem Atividade5 = new JMenuItem("Atividade 5");

        menu.add(Cadastro1);
        menu.add(Cadastro2);
        menu.add(Cadastro3);
        menu.add(Cadastro4);
        menu.add(Cadastro5);
        menu.add(oloMundoPopupItem);
        menu.add(Atividade1);
        menu.add(Atividade2);
        menu.add(Atividade3);
        menu.add(Atividade4);
        menu.add(Atividade5);

        Cadastro1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Cadastro.main(null);
            }
        });

        Cadastro2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                CadastroD.main(null);
            }
        });

        Cadastro3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                CadastroT.main(null);
            }
        });

        Cadastro4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                CadastroQ.main(null);
            }
        });

        Cadastro5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                cadastroC.main(null);
            }
        });

        Atividade1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                att.main(null);
            }
        });

        Atividade2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                AtividadePanqueca.main(null);
            }
        });

        Atividade3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                ColetaDeDados.main(null);
            }
        });

        Atividade4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                ConcatenacaoValores.main(null);
            }
        });

        Atividade5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Calculadora.main(null);
            }
        });

        oloMundoPopupItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                popup.main(null);
            }
        });
        frame.setJMenuBar(menuBar);

        JPanel panel = new JPanel();
        JButton sairButton= new JButton("Sair");

        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
    
        panel.add(sairButton);

        frame.add(panel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }    
}
