/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falconchatclient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author strea
 */
public class Client extends javax.swing.JFrame {
    static String msgout = "";
    static Socket s; 
    static DataInputStream din; 
    static DataOutputStream dout;
    static String Message = "";
    static File file = new File("clientmessagelog.txt");
    static FileWriter writer = null;
    /**
     * Creates new form Client
     */
    public Client() {
        initComponents();
        logoutbtn.setOpaque(false);
        logoutbtn.setContentAreaFilled(false);
        logoutbtn.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfInput = new javax.swing.JTextField();
        Send = new javax.swing.JButton();
        partnerlabel = new javax.swing.JLabel();
        mylabel = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JButton();
        textpane = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Client");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfInput.setBackground(new java.awt.Color(135, 123, 123));
        tfInput.setFont(new java.awt.Font("Keep Calm Med", 0, 12)); // NOI18N
        tfInput.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(tfInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 750, 30));

        Send.setBackground(new java.awt.Color(135, 123, 123));
        Send.setFont(new java.awt.Font("Keep Calm Med", 0, 12)); // NOI18N
        Send.setForeground(new java.awt.Color(255, 255, 255));
        Send.setText("SEND");
        Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendActionPerformed(evt);
            }
        });
        getContentPane().add(Send, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 610, -1, 30));

        partnerlabel.setFont(new java.awt.Font("Keep Calm Med", 0, 14)); // NOI18N
        partnerlabel.setForeground(new java.awt.Color(255, 255, 255));
        partnerlabel.setText("default");
        getContentPane().add(partnerlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 15, 150, 30));

        mylabel.setFont(new java.awt.Font("Keep Calm Med", 0, 14)); // NOI18N
        mylabel.setForeground(new java.awt.Color(255, 255, 255));
        mylabel.setText("default");
        getContentPane().add(mylabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 575, 100, 20));
        getContentPane().add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 240, 50));

        textarea.setEditable(false);
        textarea.setColumns(20);
        textarea.setRows(5);
        textpane.setViewportView(textarea);

        getContentPane().add(textpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 910, 540));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ClientMain.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendActionPerformed
        // TODO add your handling code here:
        
        msgout = fcc.username1 + ": " + tfInput.getText().trim(); 
        try { 
            textarea.setText(textarea.getText().trim() + "\n" + msgout);
            dout.writeUTF(msgout);
            try 
           {
                Message = textarea.getText();
                String path = "C:\\Users\\strea\\Documents\\NetbeansProjects\\FalconChatClient\\messageclient2.txt";
                Path File_Path = Paths.get(path);
                Files.writeString(File_Path, Message);
            } 
           catch(Exception e) 
           {
                JOptionPane.showMessageDialog(null, e, "InfoBox: ERROR", JOptionPane.INFORMATION_MESSAGE);
           }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "InfoBox: ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_SendActionPerformed

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
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
         
        try
        {
           s = new Socket(fcc.ip, fcc.port);
           din = new DataInputStream(s.getInputStream());
           dout = new DataOutputStream(s.getOutputStream());
           String msgin = "";
           while(!msgin.equals("!exit"))
           {
               msgin = din.readUTF();
               textarea.setText(textarea.getText().trim()+"\n"+msgin);
           }
           
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e, "InfoBox: ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Send;
    private javax.swing.JLabel background;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JLabel mylabel;
    private javax.swing.JLabel partnerlabel;
    private static javax.swing.JTextArea textarea;
    private javax.swing.JScrollPane textpane;
    private javax.swing.JTextField tfInput;
    // End of variables declaration//GEN-END:variables
}
