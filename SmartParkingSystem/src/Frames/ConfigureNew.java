/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Frames;

import javax.swing.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.regex.*;
import java.net.*;
/**
 *
 * @author animesh
 */
public class ConfigureNew extends javax.swing.JFrame {

    /**
     * Creates new form ConfigureNew
     */
    public ConfigureNew() {
        initComponents();
        setResizable(false);
        getContentPane().setBackground(new java.awt.Color(100,100,84));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t3 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configure The Parking System");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Actions-application-exit-icon.png"))); // NOI18N
        jButton6.setToolTipText("Close");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 100, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Configure The Parking System");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 560, 50));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Reset-icon.png"))); // NOI18N
        jButton4.setToolTipText("Click here to reset data");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 100, 60));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Settings-icon.png"))); // NOI18N
        jButton5.setToolTipText("Click here to proceed");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 100, 60));

        l1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 252, 25));

        l2.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 238, 30));

        l3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 270, 40));

        t1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        t1.setToolTipText("Enter The Max Slots");
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 390, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(235, 237, 202));
        jLabel2.setText("Max Slots*:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 130, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(235, 237, 202));
        jLabel3.setText("Max Time*:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 130, 60));

        t2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        t2.setToolTipText("Enter The Max Time Per Vehicle (In MM:SS)");
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 390, 60));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(235, 237, 202));
        jLabel4.setText("   Slot ID*:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 110, 120));

        t3.setColumns(20);
        t3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        t3.setRows(5);
        jScrollPane1.setViewportView(t3);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 250, 390, 120));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 490, 30, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //t3.setText(t1.getText());      // TODO add your handling code here:

        String slot_ids;
        int max_slot;
        String max_time;
        boolean t=false;
        if(t1.getText()==null||t1.getText().trim().equals("")){
            l1.setText("Required textfield is empty ");
            t=true;
        }
        else
            l1.setText("");
        if(!t){
             String myString = t1.getText();
        try {
            Integer.parseInt(myString);
        } catch (NumberFormatException e) {
            //Not an integer
            t = true;
            l1.setText("Required field needs integer ");
        }
        }
        if(t2.getText()==null||t2.getText().trim().equals("")){
            l2.setText("Required textfield is empty ");
            t=true;
        }
        else
            l2.setText("");
        if(t3.getText()==null||t3.getText().trim().equals("")){
            l3.setText("Required textfield is empty ");
            t=true;
        }
        else
            l3.setText("");
        if(t==true)
            return;
        
        max_slot = Integer.parseInt(t1.getText());
//        max_time = Float.parseFloat(t2.getText());
        max_time = t2.getText();
        slot_ids = t3.getText();
        int cntr=0;
        
        for(int i=0;i<max_time.length();i++)
        {
            int cha=max_time.charAt(i)-'0';
            if(cha==11)
                cntr++;
            if(cntr>2)
            {
                l2.setText("Invalid input");
                return ;
            }
            if(cha<0 || cha>10)
            {
                l2.setText("Invalid input");
                return ;
            }
        }
        ArrayList<String> a = new ArrayList<>();
        String temp="";
        for(int i = 0;i < slot_ids.length();i++){
           char x = slot_ids.charAt(i);
            if(x == '\n' || x == ' '){
                a.add(temp);
                temp = "";
            }
            else{
                temp+=x;
            }
        }
        if(temp.length()>0)
            a.add(temp);
        Map<String, Integer> mp = new HashMap<>();
        for(String s:a)
        {
            if(mp.containsKey(s)){
                l3.setText("Slot ids must be distinct");
                return;
            }
            else{
                mp.put(s, 1); 
            }
        }
        if(a.size()>max_slot){
            JOptionPane.showMessageDialog(null,"Number of slot ids exceeds maximum number of slots ");
            return;
        }
        dispose();
        Display second = new Display(a, max_time);
        Display.ta1.setText(slot_ids);
        Display.ta2.setText("No occupied slots present!!");
        second.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        t1.setText("");
        t2.setText("");
        t3.setText("");
        l1.setText("");
        l2.setText("");
        l3.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

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
            java.util.logging.Logger.getLogger(ConfigureNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigureNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigureNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigureNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfigureNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    public static javax.swing.JTextField t1;
    public static javax.swing.JTextField t2;
    public static javax.swing.JTextArea t3;
    // End of variables declaration//GEN-END:variables
}
