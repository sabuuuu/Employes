package Vue;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * @author Sabrina Yf
 */
public class Inscription extends javax.swing.JFrame {

    public Inscription() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nom_txt = new javax.swing.JTextField();
        prenom_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tel_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        connexion_btn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        adresse_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DzVues - Inscription");

        jPanel1.setBackground(new java.awt.Color(20, 49, 9));
        jPanel1.setForeground(new java.awt.Color(20, 49, 9));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(227, 202, 171));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setToolTipText("");
        jPanel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(368, 447));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(69, 98, 78));
        jLabel1.setText("Inscription");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 22, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(69, 98, 78));
        jLabel2.setText("Nom");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 85, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(69, 98, 78));
        jLabel3.setText("Prénom");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 85, -1, -1));

        nom_txt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        nom_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_txtActionPerformed(evt);
            }
        });
        jPanel2.add(nom_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 110, 132, 33));

        prenom_txt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        prenom_txt.setPreferredSize(new java.awt.Dimension(71, 33));
        jPanel2.add(prenom_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 110, 134, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(69, 98, 78));
        jLabel5.setText("Numéro Tél");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 161, -1, -1));

        tel_txt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tel_txt.setPreferredSize(new java.awt.Dimension(71, 33));
        jPanel2.add(tel_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 181, 276, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(69, 98, 78));
        jLabel7.setText("Adresse");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 232, -1, -1));

        jTextField6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 333, 279, 33));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(69, 98, 78));
        jLabel4.setText("Mot de passe");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 378, -1, -1));

        jButton1.setBackground(new java.awt.Color(20, 49, 9));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Inscription");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 519, 206, 32));

        jPasswordField1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 403, 279, 33));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(69, 98, 78));
        jLabel8.setText("Déjà un membre ?");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 563, -1, -1));

        connexion_btn.setBackground(new java.awt.Color(227, 202, 171));
        connexion_btn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        connexion_btn.setForeground(new java.awt.Color(20, 49, 9));
        connexion_btn.setText("Connexion");
        connexion_btn.setBorder(null);
        connexion_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connexion_btnActionPerformed(evt);
            }
        });
        jPanel2.add(connexion_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 563, 99, -1));

        jComboBox1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Correspondant", "Permanent" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(136, 33));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 467, 279, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(69, 98, 78));
        jLabel13.setText("Email");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 308, -1, -1));

        adresse_txt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(adresse_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 263, 279, 33));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(69, 98, 78));
        jLabel6.setText("Type");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 442, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 36, -1, 598));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Inscrivez-vous et accédez à");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 337, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("des fonctionnalités avancées");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 380, 372, 44));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("pour gérer votre activité.");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 430, 455, 56));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vue/akh2.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 125, 341, 159));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("Signin");

        getAccessibleContext().setAccessibleName("Signin");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nom = nom_txt.getText();
        String prenom = prenom_txt.getText();
        String tel = tel_txt.getText();
        String email = jTextField6.getText();
        String mdp = new String(jPasswordField1.getPassword());
        Object obj = jComboBox1.getSelectedItem();
        String type = (String) obj;
        SignUp signUp = new SignUp();
        String adresse = adresse_txt.getText();

        // Regex patterns for validation
        String nomPrenomRegex = "^[^\\d].*"; // Does not start with a number
        String telRegex = "^\\d{10}$"; // Exactly 10 numbers
        String passwordRegex = "^(?=.*[0-9]).{8,}$"; // At least 8 characters and 1 number

        // Check each field against its respective regex pattern
        if (!nom.matches(nomPrenomRegex)) {
            JOptionPane.showMessageDialog(null, "Le nom ne doit pas commencer par un chiffre !");
            return; // Stop further execution if nom is invalid
        }

        if (!prenom.matches(nomPrenomRegex)) {
            JOptionPane.showMessageDialog(null, "Le prénom ne doit pas commencer par un chiffre !");
            return; // Stop further execution if prenom is invalid
        }

        if (!tel.matches(telRegex)) {
            JOptionPane.showMessageDialog(null, "Le numéro de téléphone doit contenir exactement 10 chiffres !");
            return; // Stop further execution if tel is invalid
        }

        if (!mdp.matches(passwordRegex)) {
            JOptionPane.showMessageDialog(null, "Le mot de passe doit contenir au moins 8 caractères et 1 chiffre !");
            return; // Stop further execution if mdp is invalid
        }

        boolean success = signUp.signUp(nom, prenom, tel, adresse, email, mdp, type);
        if (success && type.equals("Permanent")) {
            JOptionPane.showMessageDialog(null, "Inscrption réussie!");
            PermanentHome Perm = new PermanentHome();
            Perm.setVisible(true);
            Perm.pack();
            Perm.setLocationRelativeTo(null);
            this.dispose();
            System.out.println("Journalist signed up successfully!");
        } else if (success && type.equals("Correspondant")) {
            JOptionPane.showMessageDialog(null, "Inscription réussie!");
            JournalistHome Cors = new JournalistHome();
            Cors.setVisible(true);
            Cors.pack();
            Cors.setLocationRelativeTo(null);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Inscription echoué :( ");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nom_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_txtActionPerformed

    private void connexion_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connexion_btnActionPerformed
        auth LoginFrame = new auth();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_connexion_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresse_txt;
    private javax.swing.JButton connexion_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField nom_txt;
    private javax.swing.JTextField prenom_txt;
    private javax.swing.JTextField tel_txt;
    // End of variables declaration//GEN-END:variables

    public class SignUp {

        private static final String DB_URL = "jdbc:mysql://localhost:3308/dzvues";
        private static final String DB_PASSWORD = "";
        private static final String DB_USERNAME = "root";

        public boolean signUp(String nom, String prenom, String tel, String adresse, String email, String password, String type) {
            try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
                String query = "INSERT INTO journaliste (nom,prénom,tél,adresse,`e-mail`,mdp,type) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, nom);
                preparedStatement.setString(2, prenom);
                preparedStatement.setString(3, tel);
                preparedStatement.setString(4, adresse);
                preparedStatement.setString(5, email);
                preparedStatement.setString(6, password);
                preparedStatement.setString(7, type);

                // Execute the INSERT query
                int rowsAffected = preparedStatement.executeUpdate();

                // Check if the journalist was inserted successfully
                return rowsAffected > 0;
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        }
    }
}
