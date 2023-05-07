/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee_management_system;

import java.sql.*;

/**
 *
 * @author RIVERSIDE-19
 */
public class databaseConnection {
     private static final String Url ="jdbc:mysql://localhost:3306/emloyeemanagementsystem";
     private static final String dbPassword ="PRITAMROY";
     private static final String dbUser="root";
     //public static final String dbPassword ="pritam";
        
     
     
     public static Connection getConnection() throws SQLException {
            try{
                return DriverManager.getConnection(Url,dbUser,dbPassword);
            }catch(SQLException ex){
                throw ex;
            }
        
    }
    
   

    
}



 