/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Alan Rosa Villalba
 */
public class testeJDBC {
       
    public static void main(String[] args) {
        
        try {
            Class .forName("com.mysql.jdbc.Driver");
                    String url,user,password;
                    url="jdbc:mysql://localhost:3306/doces";
                    user="root";
                    password="";
                    Connection cnt;
                    cnt = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(testeJDBC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(testeJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("conectou");
    }

}
