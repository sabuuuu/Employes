package Vue;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joe
 */
public class PermanentHome extends javax.swing.JFrame {
        private void populateArticleList() {
    try {
        // Load the MySQL driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Connect to the database
        String url = "jdbc:mysql://localhost:3308/dzvues";
        String user = "root";
        String pass = "";
        java.sql.Connection con = DriverManager.getConnection(url, user, pass);

        // Create a statement
        java.sql.Statement st = con.createStatement();

        // Execute the query to fetch articles
        String query = "SELECT titre, domaine, theme, contenu FROM article";
        ResultSet rs = st.executeQuery(query);

        // Clear the existing data in the table
        DefaultTableModel model = (DefaultTableModel) articleTable.getModel();
        model.setRowCount(0);

        // Populate the table with data from the ResultSet
        while (rs.next()) {
            Object[] row = {
                rs.getString("titre"),
                rs.getString("domaine"),
                rs.getString("theme"),
                rs.getString("contenu")
            };
            model.addRow(row);
        }

        // Close the resources
        rs.close();
        st.close();
        con.close();
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }
}
 private void populateInterviewList() {
    try {
        // Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

        // Connect to the database
        String url = "jdbc:mysql://localhost:3308/dzvues";
        String user = "root";
        String pass = "";
        java.sql.Connection con = DriverManager.getConnection(url, user, pass);

        // Create a statement
        java.sql.Statement st = con.createStatement();

        // Execute the query to fetch articles
        String query = "SELECT titre, domaine, contenu, numeroRevue FROM interview";
        ResultSet rs = st.executeQuery(query);

        // Clear the existing data in the table
        DefaultTableModel model = (DefaultTableModel) interviewTable.getModel();
        model.setRowCount(0);

        // Populate the table with data from the ResultSet
        while (rs.next()) {
            Object[] row = {
                rs.getString("titre"),
                rs.getString("domaine"),
                rs.getString("contenu"),
                rs.getString("numeroRevue")
            };
            model.addRow(row);
        }

        // Close the resources
        rs.close();
        st.close();
        con.close();
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }
}
    /**
     * Creates new form PermanentHome
     */
    public PermanentHome() {
        initComponents();
        populateArticleList();
        populateInterviewList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        articleTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        interviewTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        addArticle = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        addInterview = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(20, 49, 10));
        setForeground(java.awt.Color.gray);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Permanent home");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("List des interview");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("List des article");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        articleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Titre", "Domaine", "Theme", "Contenu", "Numero de revue"
            }
        ));
        jScrollPane1.setViewportView(articleTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 774, 207));

        interviewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Titre", "Domaine", "Theme", "Contenu", "Numero de revue"
            }
        ));
        jScrollPane2.setViewportView(interviewTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 774, 222));

        jPanel1.setBackground(new java.awt.Color(14, 57, 2));

        addArticle.setText("Ajouter un article");
        addArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addArticleActionPerformed(evt);
            }
        });

        refresh.setText("refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        addInterview.setText("Ajouter une interview");
        addInterview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInterviewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(463, Short.MAX_VALUE)
                .addComponent(addInterview)
                .addGap(38, 38, 38)
                .addComponent(addArticle)
                .addGap(18, 18, 18)
                .addComponent(refresh)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addArticle)
                    .addComponent(refresh)
                    .addComponent(addInterview))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
          populateArticleList();
          populateInterviewList();
    }//GEN-LAST:event_refreshActionPerformed

    private void addArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addArticleActionPerformed
        // TODO add your handling code here:
       AjoutArticle ajoutArticle = new AjoutArticle();
       ajoutArticle.setVisible(true);
       ajoutArticle.setLocationRelativeTo(null);
    }//GEN-LAST:event_addArticleActionPerformed

    private void addInterviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInterviewActionPerformed
        // TODO add your handling code here:
        AjoutInterview ajoutInterview = new AjoutInterview();
        ajoutInterview.setVisible(true);
        ajoutInterview.setLocationRelativeTo(null);
    }//GEN-LAST:event_addInterviewActionPerformed
          
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JournalistHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JournalistHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JournalistHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JournalistHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PermanentHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addArticle;
    private javax.swing.JButton addInterview;
    private javax.swing.JTable articleTable;
    private javax.swing.JTable interviewTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refresh;
    // End of variables declaration//GEN-END:variables
}
