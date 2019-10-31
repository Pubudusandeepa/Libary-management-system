/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_management_system;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Pubudu(Wachcha)
 */
public class javaconnect {
    final static String JDBC_DRIVER="com.mysql.jdbc.Driver";
    final static String DB_URL="jdbc:mysql://localhost:3306/student";
    final static String USER="root";
    final static String PASS="";
    
    public static java.sql.Connection connection(){
        try{
          Class.forName(JDBC_DRIVER);
          
          java.sql.Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
          return conn;
          
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        return null;
        }
        
    }
}
