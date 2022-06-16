

package hospital.management;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.proteanit.sql.DbUtils;

public class diagonise extends javax.swing.JFrame implements ActionListener,ItemListener{
   Statement st;
    Connection con;
    ResultSet rs,rs1,rs2;
    String r_type,r_charges;
     int currec,recent;
     boolean check=false;
    public diagonise() {
        initComponents();
        DisplayTable();
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jComboBox1.setVisible(false);
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addActionListener(this);
        jCheckBox1.addActionListener(this);
        jComboBox1.addItemListener(this);
        
       
    }
    private void DisplayTable()
    {
      try{
         
         Class.forName("com.mysql.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/login","root","");
             System.out.println("driver loaded");
             System.out.println("connection established"); 
            st=con.createStatement();
           
              System.out.println("result set fetched from database");
            //rs.next();
           
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog( null, e);
    }   
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 398, 1048, 119));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Patient ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 261, 98, -1));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 258, 147, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Search");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 258, 91, 28));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Symptoms");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 612, 129, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Diagnosis");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 707, 88, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Medicines");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 802, 88, 24));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 609, 222, -1));

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 704, 222, -1));

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 800, 222, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Ward Required");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1242, 609, 147, 28));

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1438, 609, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 920, -1, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Close");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1820, 930, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Types of Ward");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1242, 707, 130, -1));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "General", "Single", "Duo" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1452, 704, 131, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("No such patient exist");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 337, 342, 26));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/h1.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 1920, 750));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/h4.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 1920, 390));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/h4.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1918, 0, 320, 1140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        jLabel6.setVisible(true);
        jComboBox1.setVisible(true);
        check=true;
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(diagonise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(diagonise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(diagonise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(diagonise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new diagonise().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
public void itemStateChanged(ItemEvent e)
    {
        // if the state combobox is changed
        if (e.getSource() == jComboBox1) {
 
            r_type=(String)jComboBox1.getSelectedItem();
            if(r_type=="General")
                   {
                       r_charges="5000";
                   }
                   if(r_type=="Duo")
                   {
                       r_charges="7000";
                   }
                   if(r_type=="Single")
                   {
                       r_charges="10000";
                   }
                   System.out.println(r_charges);
        }
    }
    public void actionPerformed(ActionEvent ae)
   {
       try
       {
           if(ae.getSource()==jButton1)
           {
               String t1=jTextField1.getText();
                rs=st.executeQuery("select * from Patient where P_ID ="+t1);
                 jTable1.setModel(DbUtils.resultSetToTableModel(rs));
           }
           if(ae.getSource()==jButton2)
           {
               String id=jTextField1.getText(),symptom=jTextField2.getText(),diagnosis=jTextField3.getText(),medicine=jTextField4.getText();
               
               if(check==true)
               {
                String sql1="insert into room(P_ID,r_type,r_charges) "+"values("+"\'"+id +"\' ,"+"\'"+r_type+"\',"+"\' "+r_charges+"\')";
               st.executeUpdate(sql1);
               check=false;
               jLabel6.setVisible(false);
               jComboBox1.setVisible(false);
               }
           st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
              String sql="insert into treatment(P_ID,M_name,Symptoms,Diagnosis) "+"values("+"\'"+id +"\' ,"+"\'"+medicine+"\',"+"\' "+symptom+"\' ,"+"\' "+diagnosis+"\')";
            System.out.println(sql);
           // rs=st.executeQuery(sql);
            st.executeUpdate(sql);
         
            System.out.println("Data Inserted Successfully");
            JOptionPane.showMessageDialog(rootPane,"Data Inserted Successfully" ); 
             currec=rs.getRow();
            System.out.println("currec= "+currec);
            recent++;
           }
           if(ae.getSource()==jButton3)
           {
              System.out.println("doctor");
              new adminhome().setVisible(true);
              this.dispose();
           }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
           
        }
    }
}
