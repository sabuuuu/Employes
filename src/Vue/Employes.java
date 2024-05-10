package Vue;
import java.sql.*;

/**
 *
 * @author Sab
 */
public class Employes {
    public static Connection conn;
    public static Statement state;
            
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
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
