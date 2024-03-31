package employes;

import static employes.Inscription.conn;
import static employes.Inscription.state;
import java.sql.DriverManager;

/**
 *
 * @author Sab
 */
public class Employes {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL","sab","admin123");
            state = conn.createStatement();
            System.out.println("Connected ! :) \n"+conn);
        }catch(Exception e){
            System.out.println("Error ! =>>>" + e);
        }
        auth LoginFrame = new auth();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
    }
    
}
