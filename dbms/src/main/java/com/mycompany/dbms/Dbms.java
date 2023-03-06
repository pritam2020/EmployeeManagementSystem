/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dbms;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author RIVERSIDE-19
 */
public class Dbms {

    public static void main(String[] args) {
      try{
            String hostname="localhost";
            String instanceName="MSSQLSERVER02";
            String username="sa";
            String database="master";
            String password="sapritam";

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String ConnectionUrl="jdbc:sqlserver://"+hostname+":1433"+";instances="+instanceName+";databaseName="+database;
            Connection conn=DriverManager.getConnection(ConnectionUrl,username,password);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
