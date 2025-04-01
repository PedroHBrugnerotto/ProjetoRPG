package conector;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conector {
    public static final String URL =
            "jdbc:mysql://localhost/rpg";
    public static final String USER = 
            "root";
    public static final String SENHA=
            "";
    
    public Connection getConnection(){
        Connection con = null;
        try{
            Class.forName(
                   "com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.
                    getConnection(URL, USER, SENHA);
            System.out.println("Conectado!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(
                        null, e);
            System.out.println(e);
        }
        return con;
    }
            
            
            
            
    
}
