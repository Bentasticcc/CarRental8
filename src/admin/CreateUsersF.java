/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;


import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/**
 *
 * @author User
 */
public class CreateUsersF extends javax.swing.JFrame {

    /**
     * Creates new form registF
     */
    public CreateUsersF() {
        initComponents();
    }
    
    public static String email,username;
            
    
    public boolean duplicateCheck(){
        
        dbConnector dbc = new dbConnector();
        
        try{
            String query = "SELECT * FROM tbl_user  WHERE u_username = '" + us.getText() + "' OR u_email = '" + mail.getText() + "'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                email = resultSet.getString("u_email");
                if(email.equals(mail.getText())){
                      JOptionPane.showMessageDialog(null, "Email is Already Used!");
                      mail.setText("");
                }
                username = resultSet.getString("u_username");
                if(username.equals(us.getText())){
                      JOptionPane.showMessageDialog(null, "Email is Already Used!");
                      us.setText("");
            }
            return true;
            }else{
                return false;
            }
          
        }catch (SQLException ex) {
            System.out.println(""+ex);
            return false;
        }
    }
    
    public boolean UpdateCheck(){
        
        dbConnector dbc = new dbConnector();
        
        try{
            System.out.println("");
            String query = "SELECT * FROM tbl_user WHERE(u_username = '"+us.getText()+"' OR u_email = '"+mail.getText()+"')AND u_id !='"+id.getText()+"'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                email = resultSet.getString("u_email");
                if(email.equals(mail.getText())){
                      JOptionPane.showMessageDialog(null, "Email is Already Used!");
                      mail.setText("");
                }
                username = resultSet.getString("u_username");
                if(username.equals(us.getText())){
                      JOptionPane.showMessageDialog(null, "Email is Already Used!");
                      us.setText("");
            }
            return true;
            }else{
                return false;
            }
          
        }catch (SQLException ex) {
            System.out.println(""+ex);
            return false;
        }
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        up = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        del = new javax.swing.JButton();
        cl = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        us = new javax.swing.JTextField();
        pw = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cc = new javax.swing.JButton();
        rf = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ut = new javax.swing.JComboBox<>();
        um = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE FORM");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 40, 164, 32);

        id.setEnabled(false);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id);
        id.setBounds(240, 90, 190, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USER ID:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 90, 80, 14);

        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add);
        add.setBounds(30, 90, 80, 23);

        up.setText("UPDATE");
        up.setEnabled(false);
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        jPanel1.add(up);
        up.setBounds(30, 130, 80, 23);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("FIRST NAME:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(140, 120, 90, 14);

        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel1.add(fn);
        fn.setBounds(240, 120, 190, 20);
        jPanel1.add(ln);
        ln.setBounds(240, 160, 190, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LAST NAME:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 160, 90, 14);

        del.setText("DELETE");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        jPanel1.add(del);
        del.setBounds(30, 170, 80, 23);

        cl.setText("CLEAR");
        cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clActionPerformed(evt);
            }
        });
        jPanel1.add(cl);
        cl.setBounds(30, 210, 80, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("EMAIL:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(140, 190, 70, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("USERNAME:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 220, 90, 14);
        jPanel1.add(mail);
        mail.setBounds(240, 190, 190, 20);
        jPanel1.add(us);
        us.setBounds(240, 220, 190, 20);
        jPanel1.add(pw);
        pw.setBounds(240, 260, 190, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PASSWORD:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 260, 90, 14);

        cc.setText("CANCEL");
        cc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccActionPerformed(evt);
            }
        });
        jPanel1.add(cc);
        cc.setBounds(30, 250, 80, 23);

        rf.setText("REFRESH");
        rf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfActionPerformed(evt);
            }
        });
        jPanel1.add(rf);
        rf.setBounds(30, 290, 80, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("USER TYPE:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(140, 290, 90, 14);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("USER STATUS:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(130, 320, 110, 20);

        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        jPanel1.add(ut);
        ut.setBounds(240, 290, 190, 20);

        um.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        jPanel1.add(um);
        um.setBounds(240, 320, 190, 20);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
        
        
        
        if(fn.getText().isEmpty()|| ln.getText().isEmpty() || mail.getText().isEmpty()
                || us.getText().isEmpty()|| pw.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if(pw.getText().length() < 8){
            JOptionPane.showMessageDialog(null, "Characters password is 8 above!");
            pw.setText("");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist!");
            
        }else{
            
             dbConnector dbc = new dbConnector();
       
      if (dbc.insertData("INSERT INTO tbl_user (u_fname, u_lname, u_email, u_username, u_password, u_type, u_status) VALUES('"
     + fn.getText() + "','"+ln.getText()+"','"+ mail.getText() + "','" 
     + us.getText() + "','" + pw.getText() + "','" + ut.getSelectedItem() + "','"+um.getSelectedItem()+"')")){
          
        
          JOptionPane.showMessageDialog(null, "Inserted Successfully!");
          userLoginF ads = new userLoginF();
         ads.setVisible(true);
         this.dispose();
          
      }else{
          JOptionPane.showMessageDialog(null, "Connection Error!");
      }
            
        }        
        
    }//GEN-LAST:event_addActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void rfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rfActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
      
         if(fn.getText().isEmpty()|| ln.getText().isEmpty() || mail.getText().isEmpty()
                || us.getText().isEmpty()|| pw.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if(pw.getText().length() < 8){
            JOptionPane.showMessageDialog(null, "Characters password is 8 above!");
            pw.setText("");
        }else if(UpdateCheck()){
            System.out.println("Duplicate Exist!");
            
        }else{
        dbConnector dbc = new dbConnector();
       dbc.updateData("UPDATE tbl_user SET u_fname = '"+fn.getText()+",u_lname'"+
       ln.getText()+",u_email'"+mail.getText()+",u_username'"+
       us.getText()+",u_password'"+pw.getText()+",u_type'"+ut.getSelectedItem()+",u_status'"
       +um.getSelectedItem()+"WHERE u_id = '"+id.getText()+"'");
       
       JOptionPane.showMessageDialog(null, "UPDATED SUCCESSFULLY!");
       userLoginF ads = new userLoginF();
         ads.setVisible(true);
         this.dispose();
       
        }
    }//GEN-LAST:event_upActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delActionPerformed

    private void clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clActionPerformed

    private void ccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccActionPerformed
       userLoginF usf = new userLoginF();
       usf.setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_ccActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

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
            java.util.logging.Logger.getLogger(CreateUsersF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUsersF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUsersF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUsersF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateUsersF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add;
    private javax.swing.JButton cc;
    private javax.swing.JButton cl;
    private javax.swing.JButton del;
    public javax.swing.JTextField fn;
    public javax.swing.JTextField id;
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
    public javax.swing.JTextField ln;
    public javax.swing.JTextField mail;
    public javax.swing.JTextField pw;
    private javax.swing.JButton rf;
    public javax.swing.JComboBox<String> um;
    public javax.swing.JButton up;
    public javax.swing.JTextField us;
    public javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
