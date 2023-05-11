/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee_management_system;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

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
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0); 
         
            while(rs.next()){
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                int age = rs.getInt("age");
                String userName = rs.getString("user_name");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String contact = rs.getString("contact");
                String performance =String.valueOf(rs.getInt("performance"));
                String promotion =String.valueOf(rs.getInt("promotion"));
                String bonus =String.valueOf(rs.getInt("bonus"));

                model.addRow(new Object[]{firstName, lastName, age, userName, email, password, contact,performance,promotion,bonus});
                 }

            }catch(SQLException Ex){
            System.out.println("error at line 33 in TableData.java"+Ex);
        }
        catch(Exception ex){
         System.out.println("error at line 36 in TableData.java"+ex);
    }
    
}
}