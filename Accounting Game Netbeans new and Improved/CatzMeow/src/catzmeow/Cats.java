/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catzmeow;

import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Formatter;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author lpfliger
 */
public class Cats extends javax.swing.JFrame {
    

    
    
    static String getCompany(JTextField CompanyName) {
        String CompanyName2;
        CompanyName2 = CompanyName.getText();
        return CompanyName2;
    }
    
    static String getTeachersEmailEnter(JTextField txtTeachersEmailEnter){
        String txtTeachersEmailEnter2;
        txtTeachersEmailEnter2 = txtTeachersEmailEnter.getText();
        return txtTeachersEmailEnter2;
    }
    
    static String gettxtNameEnter(JTextField txtNameEnter){
        String txtNameEnter2;
        txtNameEnter2 = txtNameEnter.getText();
        return txtNameEnter2;
    }
    
    /**
     * Creates new form Cats
     */
    public Cats() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCatzMeow = new javax.swing.JLabel();
        txtNameEnter = new javax.swing.JTextField();
        txtTeachersEmailEnter = new javax.swing.JTextField();
        lblNameEnter = new javax.swing.JLabel();
        lblTeachersEmailEnter = new javax.swing.JLabel();
        lblCompanysNameEnter = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        CompanyName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCatzMeow.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblCatzMeow.setText("Welcome to Catz Meow!");

        lblNameEnter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNameEnter.setText("Name:");

        lblTeachersEmailEnter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTeachersEmailEnter.setText("Teacher's Email:");

        lblCompanysNameEnter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCompanysNameEnter.setText("Company Name:");

        btnSubmit.setText("Submit");
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
        });
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        CompanyName.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel1.setText("Version 1.0 (11/21/14)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(lblCatzMeow, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(btnSubmit)
                .addGap(87, 87, 87)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCompanysNameEnter)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblNameEnter)
                        .addComponent(lblTeachersEmailEnter)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNameEnter)
                    .addComponent(txtTeachersEmailEnter)
                    .addComponent(CompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCatzMeow, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNameEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txtTeachersEmailEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(CompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNameEnter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTeachersEmailEnter)
                        .addGap(13, 13, 13)
                        .addComponent(lblCompanysNameEnter)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSubmit)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        btnSubmit.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        if ( CompanyName.getText().trim().length() == 0 || txtNameEnter.getText().trim().length() == 0 || txtTeachersEmailEnter.getText().trim().length() == 0 ){
        JOptionPane.showMessageDialog(null,"Please Fill in All Text Fields","Required Text Field",JOptionPane.WARNING_MESSAGE);
        }
        else{
        
        GameBoard frame = new GameBoard();
        frame.setResizable(false);
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        frame.setVisible(true);
        GameBoard.lblCompanyName.setText(this.CompanyName.getText());
        this.dispose();
}
    }//GEN-LAST:event_btnSubmitActionPerformed

    
    
 
    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitMouseClicked

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
            java.util.logging.Logger.getLogger(Cats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
 
            
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameBoard().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField CompanyName;
    public static javax.swing.JButton btnSubmit;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel lblCatzMeow;
    public javax.swing.JLabel lblCompanysNameEnter;
    public javax.swing.JLabel lblNameEnter;
    public javax.swing.JLabel lblTeachersEmailEnter;
    public static javax.swing.JTextField txtNameEnter;
    public static javax.swing.JTextField txtTeachersEmailEnter;
    // End of variables declaration//GEN-END:variables

}
