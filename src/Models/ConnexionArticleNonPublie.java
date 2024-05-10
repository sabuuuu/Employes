/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class ConnexionArticleNonPublie {
      Connexion c=new Connexion();
    PreparedStatement ps;
    public ResultSet rs;
    public ConnexionArticleNonPublie() {
        try {
            ps=c.getCo().prepareStatement("SELECT * FROM articlenonpub");
            rs=ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionArticleNonPublie.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
