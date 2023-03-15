/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee_management_system;

/**
 *
 * @author pritamroy
 */

import java.sql.*;
import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel{
    ResultSet obj;
    int rowcount;
    
    public  TableModel(ResultSet obj){
        this.obj=obj;
        try{
            obj.last();
            rowcount = obj.getRow();
            obj.beforeFirst();
        }catch(SQLException Ex){
            System.out.println(Ex);
        }
        
    
    }

    @Override
    public
    int getRowCount() {
       return rowcount;
       
    }

    @Override
    public
    int getColumnCount() {
        return 7;
    }

    @Override
    public
    Object getValueAt(int rowIndex, int columnIndex) {
        System.out.println("row: "+rowIndex +"\n column: "+columnIndex);
//        try{
//            obj.absolute(rowIndex);
//        switch(columnIndex){
//        
//            case 1:
//                obj.getString(columnIndex);
//                break;
//            case 2:
//                obj.getString(columnIndex);
//                break;
//            case 3:
//                obj.getInt(columnIndex);
//                break;
//            case 4:
//                obj.getString(columnIndex);
//                break;
//                
//            case 5:
//                obj.getString(columnIndex);
//                break;
//            case 6:
//                obj.getInt(columnIndex);
//                break;
//            case 7:
//                obj.getString(columnIndex);
//                break;
//                

                return "hello";
//                obj.absolute(rowIndex+1);
//                return obj.getObject(columnIndex+1);
 //       }
//        }catch(SQLException Ex){
//            System.out.println("error in line 77 in TableModel.java");
//            return null;
}
        
        
      
//    }
    
}
