/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital.management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.io.*;
import javax.swing.filechooser.*;
 
public class login extends JFrame {
    JTextField t1,t2;
    Statement st;
    Connection con;
    ResultSet rs;
    boolean flag;
    int currec,recent;
    //String name,pass;
    public login()
   {
      setLayout(new GridLayout(1,1,0,0));
     
     setSize(800,800);
     setTitle("HOSPITAL MANAGEMENT");
    
                t1=new JTextField();
                
                t2=new JTextField();
                add(t1);
                add(t2);
                
     this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
      try{
             Class.forName("com.mysql.jdbc.Driver");
             // Class.forName("com.mysql.jdbc.Driver");

             con = DriverManager.getConnection("jdbc:mysql://localhost/login","root","mahak@250300");
             System.out.println("driver loaded");
            // con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root","");
             System.out.println("connection established"); 
            st=con.createStatement();
            rs=st.executeQuery("select * from log");
              System.out.println("result set fetched from database");
            rs.next();
            //displayrecord1();
           
         }
   
         catch(Exception e)
         {
             System.out.println("employee error......"+e.toString());
         }
   }
     public void displayrecord1()
         {
             try
             {
                
                 String name=rs.getString("username"), password=rs.getString("password");
                 t1.setText(name);
                 t2.setText(password);
              
             }
             catch(Exception e)
             {
                   System.out.println("error...."+e.toString());
             }
         }
    public static void main(String args[])
   {
       login d=new login();
       d.show();
   }
    
}
