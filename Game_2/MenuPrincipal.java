package Game_2;

import javax.swing.*;

public class MenuPrincipal {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel();

        JButton nouveauJeuButton = new JButton("Nouveau jeu");
        nouveauJeuButton.addActionListener(e -> {
            Game game = new Game();
            frame.dispose();
        });
        panel.add(nouveauJeuButton);

        JButton quitterButton = new JButton("Quitter");
        quitterButton.addActionListener(e -> {
            System.exit(0);
        });
        panel.add(quitterButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}

