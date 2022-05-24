/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obchodik2;

/**
 *
 * @author NAHIM
 */
import java.sql.*;
import javax.swing.JOptionPane;


public class produktyconnect {
    
    Connection conn;
    
    public static Connection ConnectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/obchodik2", "root", "");
            return conn;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
