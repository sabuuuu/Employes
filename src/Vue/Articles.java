package Vue;
import Models.*;
import Beans.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Articles extends javax.swing.JFrame {
    Connexion c = new Connexion();
    Statement st;
    PreparedStatement ps;
    DefaultTableModel dt= new DefaultTableModel();
    DefaultTableModel model;
    public ResultSet rs;
    public Articles() {
        initComponents();
        setTitle("DzVues-Articles");
        setLocationRelativeTo(null);
    }
    public void valider(int ligne){
        int choice = JOptionPane.showConfirmDialog(null, "Voulez-vous valider cette article?", "Validation", JOptionPane.YES_NO_OPTION);
        
        if (choice == JOptionPane.YES_OPTION) {
                    try {
                ps=c.getCo().prepareStatement("INSERT INTO article(code,titre,domaine,theme,contenu,numeroRevue)VALUES(?,?,?,?,?,?)");
                ps.setString(1,data_table.getValueAt(ligne,0)+"");
                ps.setString(2,data_table.getValueAt(ligne,1)+"");
                ps.setString(3,data_table.getValueAt(ligne,2)+"");
                ps.setString(4,data_table.getValueAt(ligne,3)+"");
                ps.setString(5,data_table.getValueAt(ligne,4)+"");
                ps.setString(6, data_table.getValueAt(ligne,5)+"");
                ps.execute(); // ou executeupdate()
                JOptionPane.showMessageDialog(this,"Article ajouter avec succées");
                try {
                st=c.getCo().createStatement();
                st.executeUpdate("DELETE FROM articlenonpub WHERE code='"+data_table.getValueAt(data_table.getSelectedRow(),0)+"'");
               
               
            } catch (SQLException ex) {
                Logger.getLogger(Articles.class.getName()).log(Level.SEVERE, null, ex);
            }
               
            } catch (SQLException ex) {
                Logger.getLogger(Articles.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
          
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        data_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(20, 49, 9));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vue/a1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 30, -1, -1));

        jButton1.setBackground(new java.awt.Color(227, 202, 171));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton1.setText("Déconnexion");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setPreferredSize(new java.awt.Dimension(83, 33));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(914, 40, 134, -1));

        jButton2.setBackground(new java.awt.Color(227, 202, 171));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton2.setText("Home");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setPreferredSize(new java.awt.Dimension(83, 33));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, 134, -1));

        jPanel2.setBackground(new java.awt.Color(227, 202, 171));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("Get data");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 109, -1, -1));

        jButton4.setText("Vider");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 194, -1, -1));

        data_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "code ", "titre", "domaine", "theme", "contenu", "numeroRevue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        data_table.setRowHeight(40);
        data_table.setSurrendersFocusOnKeystroke(true);
        data_table.getTableHeader().setReorderingAllowed(false);
        data_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                data_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(data_table);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 10, 810, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1065, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        auth LoginFrame = new auth();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        home LoginFrame = new home();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setLocationRelativeTo(this);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         dt.setColumnCount(0);
        dt.setRowCount(0);
        ConnexionArticleNonPublie cs = new ConnexionArticleNonPublie();
        try {
            ps = c.getCo().prepareStatement("SELECT * FROM articlenonpub");
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Articles.class.getName()).log(Level.SEVERE, null, ex);
        }

         dt.addColumn("Code");
        dt.addColumn("Titre");
        dt.addColumn("Théme");
         dt.addColumn("Domaine");
        dt.addColumn("Contenu");
        dt.addColumn("Numero de Revue");

        try {
            while (cs.rs.next()) {
                dt.addRow(new Object[]{cs.rs.getInt("code"),cs.rs.getString("titre") ,cs.rs.getString("theme"), cs.rs.getString("domaine"), cs.rs.getString("contenu"), cs.rs.getInt("numeroRevue")});

            }
            data_table.setModel(dt);
        } catch (SQLException ex) {
            Logger.getLogger(Articles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        data_table.setModel(new DefaultTableModel());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void data_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_tableMouseClicked
        valider(data_table.getSelectedRow());
    }//GEN-LAST:event_data_tableMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Articles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable data_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}
