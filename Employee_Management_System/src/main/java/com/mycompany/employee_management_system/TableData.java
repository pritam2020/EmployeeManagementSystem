/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee_management_system;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

/**
 *
 * @author RIVERSIDE-19
 */
public final class TableData {
   public static void data(JTable table){
        try{
            Statement st=databaseConnection.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs=st.executeQuery("select * from employee");
            rs.last();
            int rowCount=rs.getRow();
            rs.beforeFirst();
            table.set
            while(rs.next()){
                table.setValueAt(rs.getString("firstname"), rs.getRow()-1, 0);
                table.setValueAt(rs.getString("lastname"), rs.getRow()-1, 2-1);
                table.setValueAt(rs.getInt("age"), rs.getRow()-1, 3-1);
                table.setValueAt(rs.getString("user_name"), rs.getRow()-1, 4-1);
                table.setValueAt(rs.getString("email"), rs.getRow()-1, 5-1);
                table.setValueAt(rs.getString("password"), rs.getRow()-1, 6-1);
                table.setValueAt(rs.getString("contact"), rs.getRow()-1, 7-1);
                 }

            }catch(SQLException Ex){
            System.out.println("error at line 33 in TableData.java"+Ex);
        }
        catch(Exception ex){
         System.out.println("error at line 36 in TableData.java"+ex);
    }
    
}
}