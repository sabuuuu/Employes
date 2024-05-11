package Vue;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 * @author Sabrina Yf
 */
public class auth extends javax.swing.JFrame {
    public auth() {
        initComponents();   
        setLocationRelativeTo(null);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        email_input = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        connexion_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        password_input = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DzVues - Connexion");

        jPanel1.setBackground(new java.awt.Color(20, 49, 9));

        jPanel3.setBackground(new java.awt.Color(20, 49, 9));
        jPanel3.setToolTipText("");

        jLabel4.setBackground(new java.awt.Color(128, 96, 68));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Bienvenu dans votre ");
        jLabel4.setToolTipText("");

        jLabel5.setBackground(new java.awt.Color(128, 96, 68));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("plate-forme de gestion");
        jLabel5.setToolTipText("");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vue/akh2.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(227, 202, 171));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(209, 165, 70));
        jPanel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(69, 98, 78));
        jLabel1.setText("LOG IN");

        email_input.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        email_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_inputActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(69, 98, 78));
        jLabel2.setText("Password");

        connexion_btn.setBackground(new java.awt.Color(20, 49, 9));
        connexion_btn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        connexion_btn.setForeground(new java.awt.Color(255, 255, 255));
        connexion_btn.setText("Connexion");
        connexion_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        connexion_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connexion_btnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(69, 98, 78));
        jLabel3.setText("E-mail");

        password_input.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        password_input.setOpaque(true);
        password_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_inputActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(69, 98, 78));
        jLabel6.setText("J'ai pas de compte ? ");

        jButton1.setBackground(new java.awt.Color(227, 202, 171));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(20, 49, 9));
        jButton1.setText("je m'inscris");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(93, 93, 93))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(email_input, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password_input, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(connexion_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email_input, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_input, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(connexion_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jButton1))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        jPanel3.getAccessibleContext().setAccessibleName("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connexion_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connexion_btnActionPerformed
        String email = email_input.getText();
        String password = new String(password_input.getPassword());
        
        // Regex pattern for email validation
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        // Regex pattern for password validation (minimum 8characters et un chiffre)
        String passwordRegex = "^(?=.*[0-9]).{8,}$";

        // Check if the email matches the regex pattern
        if (!email.matches(emailRegex)) {
            JOptionPane.showMessageDialog(null, "Adresse e-mail invalide !");
            return; 
        }

        
        Authentication authentication = new Authentication();  
        String userType = authentication.authenticate(email, password); 
 
        if (userType != null && userType.equals("exists")) {
            JOptionPane.showMessageDialog(null, "Connexion réussie!");
            home HomePage = new home();
            HomePage.setVisible(true);
            HomePage.pack();
            HomePage.setLocationRelativeTo(null);
            this.dispose();
        } else if (userType != null && userType.equals("Correspondant")) {
            JOptionPane.showMessageDialog(null, "Connexion réussie!");
            JournalistHome Cors = new JournalistHome();
            Cors.setVisible(true);
            Cors.pack();
            Cors.setLocationRelativeTo(null);
            this.dispose();
        } else if (userType != null && userType.equals("Permanent")) {
            JOptionPane.showMessageDialog(null, "Connexion réussie!");
            PermanentHome Perm = new PermanentHome();
            Perm.setVisible(true);
            Perm.pack();
            Perm.setLocationRelativeTo(null);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "E-mail ou mot de passe incorrecte !");
        }
    }//GEN-LAST:event_connexion_btnActionPerformed

    private void email_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_inputActionPerformed
        
    }//GEN-LAST:event_email_inputActionPerformed

    private void password_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_inputActionPerformed

    }//GEN-LAST:event_password_inputActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Inscription sign = new Inscription();
        sign.setVisible(true);
        sign.pack();
        sign.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connexion_btn;
    private javax.swing.JTextField email_input;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField password_input;
    // End of variables declaration//GEN-END:variables

    public class Authentication {
        private static final String REDACTEUR_EN_CHEF_USERNAME = "chef@gmail.com";
        private static final String REDACTEUR_EN_CHEF_PASSWORD = "chef123";
        private static final String DB_URL = "jdbc:mysql://localhost:3308/dzvues";
        private static final String DB_PASSWORD = "";
        private static final String DB_USERNAME = "root";

        public String authenticate(String email, String password) {
             if (email.equals(REDACTEUR_EN_CHEF_USERNAME) && password.equals(REDACTEUR_EN_CHEF_PASSWORD)) {
                return "exists"; 
            } else {
                String journalistType = authenticateJournalistFromDatabase(email, password);
                if (journalistType != null) {
                    return journalistType;  
                } else {
                    return "nothing found";  
                }
            }
        }

        private String authenticateJournalistFromDatabase(String email, String password) {
            try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
                String query = "SELECT type FROM journaliste WHERE `e-mail` = ? AND mdp = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, email);
                preparedStatement.setString(2, password);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    String type = resultSet.getString("type");
                    return type; 
                } else {
                    return ""; 
                }
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }

    }
}
