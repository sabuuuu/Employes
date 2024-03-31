package employes;
/**
 *
 * @author Sab
 */
public class Employes {

    public static void main(String[] args) {
        DBConnectt connexion = new DBConnectt();
        System.out.println(connexion);
        auth LoginFrame = new auth();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
    }
    
}
