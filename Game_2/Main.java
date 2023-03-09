package Game_2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame implements ActionListener {
    private JPanel panel;
    private JButton newGameButton, loadGameButton, quitButton;

    public Main() {
        // Créer le JPanel principal
        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Créer les boutons
        newGameButton = new JButton("Commencer une nouvelle partie");
        newGameButton.addActionListener(this);
        panel.add(newGameButton, BorderLayout.NORTH);

        loadGameButton = new JButton("Charger une partie sauvegardée");
        loadGameButton.addActionListener(this);
        panel.add(loadGameButton, BorderLayout.CENTER);

        quitButton = new JButton("Quitter le jeu");
        quitButton.addActionListener(this);
        panel.add(quitButton, BorderLayout.SOUTH);

        // Ajouter le JPanel au JFrame
        add(panel);

        // Configurer la fenêtre
        setTitle("Menu principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == newGameButton) {
            // Code pour commencer une nouvelle partie
            System.out.println("Commencer une nouvelle partie");
        } else if(e.getSource() == loadGameButton) {
            // Code pour charger une partie sauvegardée
            System.out.println("Charger une partie sauvegardée");
        } else if(e.getSource() == quitButton) {
            // Quitter le jeu
            System.out.println("Au revoir !");
            dispose();
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}

