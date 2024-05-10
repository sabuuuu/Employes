package Vue;
import javax.swing.*;
import java.awt.*;

public class Article extends JFrame {
    private int code;
    private String titre;
    private String domaine;
    private String theme;
    private String contenue;

    public Article(int code, String titre, String domaine, String theme, String contenue) {
        this.code = code;
        this.titre = titre;
        this.domaine = domaine;
        this.theme = theme;
        this.contenue = contenue;
    }

    private JLabel titreLabel, domaineLabel, themeLabel, contenuLabel;
    private JTextField titreField, domaineField, themeField;
    private JTextArea contenuArea;
    private JButton ajouterButton;

    public Article() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Ajouter un Article");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);

        titreLabel = new JLabel("Titre:");
        c.gridx = 0;
        c.gridy = 0;
        panel.add(titreLabel, c);

        titreField = new JTextField(20);
        c.gridx = 1;
        c.gridy = 0;
        panel.add(titreField, c);

        domaineLabel = new JLabel("Domaine:");
        c.gridx = 0;
        c.gridy = 1;
        panel.add(domaineLabel, c);

        domaineField = new JTextField(20);
        c.gridx = 1;
        c.gridy = 1;
        panel.add(domaineField, c);

        themeLabel = new JLabel("Thème:");
        c.gridx = 0;
        c.gridy = 2;
        panel.add(themeLabel, c);

        themeField = new JTextField(20);
        c.gridx = 1;
        c.gridy = 2;
        panel.add(themeField, c);

        contenuLabel = new JLabel("Contenu:");
        c.gridx = 0;
        c.gridy = 3;
        panel.add(contenuLabel, c);

        contenuArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(contenuArea);
        c.gridx = 1;
        c.gridy = 3;
        panel.add(scrollPane, c);

        ajouterButton = new JButton("Ajouter Article");
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        panel.add(ajouterButton, c);

        add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Article().setVisible(true));
    }
}