/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author HP
 */
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
public class ConnectionProvider {
    
     public static Connection getcon(){
         Connection con1 = null;
        try
        {
            String url1 = "jdbc:mysql://localhost:3306/databaseproject";
            String user = "root";
            String password = "";
            con1 = DriverManager.getConnection(url1,user,password);
            return con1;
        }
        catch(SQLException e){
               return null;
        }
    }
    
}
