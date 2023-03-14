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
        public static final String Url ="jdbc:mysql://localhost:3306/employeemanagementsystem";
   //   public static final String dbPassword ="PRITAMROY";
        public static final String dbUser="root";
        public static final String dbPassword ="pritam";
    public static Connection getConnection() throws SQLException {
     return DriverManager.getConnection(Url,dbUser,dbPassword);
    }
    
   

    
}



 