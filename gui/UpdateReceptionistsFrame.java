/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.gui;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import sanjeevaniapp.dao.EmpDao;
import sanjeevaniapp.dao.ReceptionistDao;
import sanjeevaniapp.dao.UserDao;
import sanjeevaniapp.dbutil.DBConnection;
import sanjeevaniapp.pojo.ReceptionistPojo;
import sanjeevaniapp.pojo.UserPojo;
import sanjeevaniapp.utility.PasswordEncryption;

/**
 *
 * @author pc
 */
public class UpdateReceptionistsFrame extends javax.swing.JFrame {

     private String Pwd1,Pwd2,LoginId,curname;   
    public UpdateReceptionistsFrame() {
        initComponents();
        loadRecId();
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtPwd1 = new javax.swing.JPasswordField();
        txtPwd2 = new javax.swing.JPasswordField();
        jcGender = new javax.swing.JComboBox<>();
        jcReceptionistId = new javax.swing.JComboBox<>();
        txtReceptionistName = new javax.swing.JTextField();
        txtLoginId = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setText("Sanjeevani Application");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 560, 60));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 570, 80));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 550, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -70, 1040, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Update Receptionists Frame");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 300, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Receptionist's Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Receptionists Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Login ID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Password");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Retype Password");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Receptionist ID");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Gender");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        txtPwd1.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jPanel2.add(txtPwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 430, -1));

        txtPwd2.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jPanel2.add(txtPwd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 430, -1));

        jcGender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHERS" }));
        jPanel2.add(jcGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 430, -1));

        jcReceptionistId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcReceptionistId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcReceptionistIdActionPerformed(evt);
            }
        });
        jPanel2.add(jcReceptionistId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 430, -1));

        txtReceptionistName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtReceptionistName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReceptionistNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtReceptionistName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 430, -1));

        txtLoginId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(txtLoginId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 430, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 710, 320));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 153, 102));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 610, 210, 30));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 153, 102));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 650, 100, -1));

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 153, 102));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 650, 100, -1));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/images (2).jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 190, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ManageReceptionistsFrame  ManageRec=new  ManageReceptionistsFrame();
        ManageRec.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       if(validateInputs()==false){
         JOptionPane.showMessageDialog(null, "Please input all the fields");
         return;
     }
     String passwordValid=matchPassword();
     if(passwordValid!=null){
         JOptionPane.showMessageDialog(null, passwordValid);
         return;
     }
      
      try{
          
          ReceptionistPojo Rec=new ReceptionistPojo();
          Rec.setReceptionistId(jcReceptionistId.getSelectedItem().toString());
          Rec.setGender(jcGender.getSelectedItem().toString());
          Rec.setReceptionistName(txtReceptionistName.getText().trim().toString());
          boolean result1=ReceptionistDao.updateReceptionist(Rec);
          UserPojo user=new UserPojo();
          user.setLoginId(LoginId);
          String encPassword=new String(PasswordEncryption.getEncryptedPassword(Pwd1));
          user.setPassword(encPassword);
          user.setUserName(txtReceptionistName.getText().toString());
          user.setUserType("RECEPTIONIST");
          boolean result2=UserDao.updateUser(user, curname);
           if(result1==true && result2==true){
             JOptionPane.showMessageDialog(null, "Receptionist successfully Update!");
             clearAll();
            return;
           }
          JOptionPane.showMessageDialog(null,"Record not updated!","Failure!",JOptionPane.ERROR_MESSAGE);
          }
          catch(SQLException ex){
          JOptionPane.showMessageDialog(null,"Error In DB Update rec "+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
          ex.printStackTrace();
          }
          
      
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jcReceptionistIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcReceptionistIdActionPerformed
         try{
            String RecId=jcReceptionistId.getSelectedItem().toString();
            ReceptionistPojo rec=ReceptionistDao.getReceptionistDetailsbyId(RecId);
            txtReceptionistName.setText(rec.getReceptionistName());
            jcGender.setSelectedItem(rec.getGender());
            curname =ReceptionistDao.getReceptionistNamebyId(RecId);
            String loginId=UserDao.getUserLoginIdbyName(curname);
            txtLoginId.setText(loginId);
        } 
        catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error In DB Update Lode Text "+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jcReceptionistIdActionPerformed

    private void txtReceptionistNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReceptionistNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReceptionistNameActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LoginFrame Login=new LoginFrame();
        Login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateReceptionistsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateReceptionistsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> jcGender;
    private javax.swing.JComboBox<String> jcReceptionistId;
    private javax.swing.JTextField txtLoginId;
    private javax.swing.JPasswordField txtPwd1;
    private javax.swing.JPasswordField txtPwd2;
    private javax.swing.JTextField txtReceptionistName;
    // End of variables declaration//GEN-END:variables

    private void loadRecId() {
 try{
            List<String>ReceptionistIdList=ReceptionistDao.getAllReceptionistId();
            for(String id:ReceptionistIdList){
                jcReceptionistId.addItem(id);
            }
        }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error In DB UpdateRec loadRec"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }  
    }
     
      private boolean validateInputs(){
      LoginId=this.txtLoginId.getText().trim();
      char[] p1=this.txtPwd1.getPassword();
      char[] p2=this.txtPwd2.getPassword();
      if(LoginId.isEmpty()||p1.length==0||p2.length==0)
          return false;
      Pwd1=new String(p1);
      Pwd2=new String(p2);
      return true;
      
  }
     private String matchPassword(){
     Pwd1=Pwd1.trim();
     Pwd2=Pwd2.trim();
     if(Pwd1.length()<3 || Pwd2.length()<3)
         return "Passwords must be of atleast 3 characters in length";
     if(Pwd1.equals(Pwd2)==false)
         return "Passwords do not match";
     return null;
    }
   private void clearAll(){
      txtLoginId.setText("");
      txtReceptionistName.setText("");
      txtPwd1.setText("");
      txtPwd2.setText("");  
  }     
}