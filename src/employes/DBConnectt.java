package employes;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/** 
 * @author Sabrina <3
 */
public class DBConnectt {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","sab","admin123");
            System.out.println(conn);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnectt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnectt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
