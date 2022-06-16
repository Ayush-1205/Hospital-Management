

package hospital.management;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.io.*;

public class patient1 extends javax.swing.JFrame implements ActionListener,ItemListener{
     Statement st;
    Connection con;
    ResultSet rs;
   
    int currec,recent;
    String doctor;

    
    public patient1() {
        initComponents();
        jButton3.addActionListener(this);
        jButton2.addActionListener(this);
        jComboBox1.addItemListener(this);
         try{
             Class.forName("com.mysql.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/login","root","");
             System.out.println("driver loaded");
             System.out.println("connection established"); 
            st=con.createStatement();
            rs=st.executeQuery("select * from patient");
              System.out.println("result set fetched from database");
            rs.next();
            
           
         }
         catch(Exception e)
         {
             System.out.println(e.toString());
         }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("PATIENT'S ENTRY");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 29, 537, 61));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("NAME ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 168, 195, 42));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 253, 274, 41));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("AGE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 352, 274, 45));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("ADDRESS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 448, 274, 52));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("GENDER");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 566, 274, 53));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("CONCERNING DOCTOR");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 660, -1, 49));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 168, 290, 42));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 253, 290, 50));

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 352, 290, 45));

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 448, 290, 52));

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 566, 290, 53));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Update RECORD");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 910, -1, 35));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dr. Rajeev(Opthalmologist)", "Dr. Vijay(Ausiologist)", "Dr. karan(Dentist)" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 660, 280, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("DOB");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 750, 120, -1));

        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 750, 280, 40));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("BLOOD GROUP");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 820, -1, -1));

        jTextField7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 830, 280, 30));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Back");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1710, 900, 170, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/1282825.jpg"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 2050, 1050));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(patient1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(patient1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(patient1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patient1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new patient1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
 public void itemStateChanged(ItemEvent e)
    {
        // if the state combobox is changed
        if (e.getSource() == jComboBox1) {
 
            doctor=(String)jComboBox1.getSelectedItem();
        }
    }
    public void actionPerformed(ActionEvent ae)
   {
         if(ae.getSource()==jButton3)
            {
              new adminhome().setVisible(true);
              this.dispose();
            }
       try
       {
           if(ae.getSource()==jButton2)
           {
              System.out.println("doctor");
              String name=jTextField1.getText(),gender=jTextField5.getText(),dob=jTextField6.getText(),address=jTextField4.getText();
              String id=jTextField2.getText(),age=jTextField3.getText(),bg=jTextField7.getText();
              
              //System.out.println(name+gender+dob+address+id+age+doctor);
           st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
              String sql="Update Patient SET P_name="+"\'"+name+"\',"+"Address="+"\'"+address+"\',"+"DOB="+"\'"+dob+"\',"+"Gender="+"\'"+gender+"\',"+"Age="+"\'"+age+"\',"+"Bloodgroup="+"\'"+bg+"\',"+"D_name="+"\'"+doctor+"\'" +" Where P_ID="+"\'"+id+"\'";
            System.out.println(sql);
            
            rs.afterLast();
           // rs=st.executeQuery(sql);
            st.executeUpdate(sql);
         
            System.out.println("Data updated Successfully");
            JOptionPane.showMessageDialog(rootPane,"Data updated Successfully" );
            currec=rs.getRow();
            System.out.println("currec= "+currec);
            recent++;
         }
          
           }
          
        catch(Exception e)
        {
            System.out.println(e.toString());
             JOptionPane.showMessageDialog(rootPane,e.toString() );
        }
    }
}
