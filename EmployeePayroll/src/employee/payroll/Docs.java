/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employee.payroll;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author lenovo
 */
public class Docs extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    /**
     * Creates new form Docs
     */
    public Docs() throws IOException {
        initComponents();
        
        conn = db.java_db();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        Update_table();
        Insert_docs();
    }
    
    private void Insert_docs() throws FileNotFoundException, IOException{
        String status = "active";
        String date = "28/18/2023";
        String employee_name = "Arnaldo";
        String BI_path = "C:\\Users\\lenovo\\Desktop\\TSemestral\\docs\\BI.pdf";
        String NUIT_path = "C:\\Users\\lenovo\\Desktop\\TSemestral\\docs\\NUIT.pdf";
        String Certificado_path = "C:\\Users\\lenovo\\Desktop\\TSemestral\\docs\\Certificado_CS50x.pdf";
        String Despacho_path = "C:\\Users\\lenovo\\Desktop\\TSemestral\\docs\\Despacho_UEM.pdf";
        int confirmAdd = JOptionPane.showConfirmDialog(null, "Confirma a operacao", "Add staff", JOptionPane.YES_NO_OPTION);
        
        if (confirmAdd == 0)
        {
            try
            {
                pst = conn.prepareStatement("INSERT INTO docs (staff_id, Employee_Name, BI, NUIT, Certificado, Ultimo_despacho, Date, status) VALUES (?,?,?,?,?,?,?,?)");
                
//                File BI_file = new File(BI_path);
//                FileInputStream BI_InputStrem = new FileInputStream(BI_file);
//
//                File NUIT_file = new File(NUIT_path);
//                FileInputStream NUIT_InputStrem = new FileInputStream(NUIT_file);
//
//                File Certificado_file = new File(Certificado_path);
//                FileInputStream Certificado_InputStrem = new FileInputStream(Certificado_file);
//
//                File Despacho_file = new File(Despacho_path);
//                FileInputStream Despacho_InputStrem = new FileInputStream(Despacho_file);

                pst.setString(1, "1");
                pst.setString(2, employee_name);
                pst.setString(3, BI_path);
                pst.setString(4, NUIT_path);
                pst.setString(5, Certificado_path);
                pst.setString(6, Despacho_path);            
                pst.setString(7, date);
                pst.setString(8, status);
                
                pst.execute();            
            
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    
    private void Update_table(){
        try{
            String database = "SELECT * FROM docs";
            pst = conn.prepareStatement(database);
            rs = pst.executeQuery();
            table_docs.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                rs.close();
                pst.close();
                
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
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

        jLabel1 = new javax.swing.JLabel();
        txt_search_docs = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_docs = new javax.swing.JTable();
        btn_add_docs = new javax.swing.JButton();
        btn_listAll_docs = new javax.swing.JButton();
        btn_update_docs = new javax.swing.JButton();
        btn_dele_docs = new javax.swing.JButton();
        btb_back_docs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pesquisar:");

        txt_search_docs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_search_docsKeyReleased(evt);
            }
        });

        table_docs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Staff_id", "Name", "BI", "NUIT", "Certificado", "Despacho", "Date", "Status"
            }
        ));
        jScrollPane1.setViewportView(table_docs);

        btn_add_docs.setText("ADD");

        btn_listAll_docs.setText("List All");

        btn_update_docs.setText("Update");

        btn_dele_docs.setText("Delete");

        btb_back_docs.setText("Back");
        btb_back_docs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_back_docsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_add_docs)
                        .addGap(18, 18, 18)
                        .addComponent(btn_listAll_docs)
                        .addGap(18, 18, 18)
                        .addComponent(btn_update_docs)
                        .addGap(18, 18, 18)
                        .addComponent(btn_dele_docs)
                        .addGap(18, 18, 18)
                        .addComponent(btb_back_docs)))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add_docs, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_listAll_docs, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update_docs)
                    .addComponent(btn_dele_docs, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btb_back_docs))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_search_docs, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_search_docs, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_search_docsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search_docsKeyReleased
        // TODO add your handling code here:
        try
        {
            String database = "SELECT * FROM docs WHERE id = ?";
            pst = conn.prepareStatement(database);
            pst.setString(1,txt_search_docs.getText());
            rs = pst.executeQuery();
            table_docs.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro ao carregar os dados");
        }
        finally{
            try{
                rs.close();
                pst.close();
                
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_txt_search_docsKeyReleased

    private void btb_back_docsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btb_back_docsActionPerformed
        // TODO add your handling code here:
        MainMenu back_to_main = new MainMenu();
        back_to_main.setVisible(true);
    }//GEN-LAST:event_btb_back_docsActionPerformed

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
            java.util.logging.Logger.getLogger(Docs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Docs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Docs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Docs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Docs().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Docs.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btb_back_docs;
    private javax.swing.JButton btn_add_docs;
    private javax.swing.JButton btn_dele_docs;
    private javax.swing.JButton btn_listAll_docs;
    private javax.swing.JButton btn_update_docs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_docs;
    private javax.swing.JTextField txt_search_docs;
    // End of variables declaration//GEN-END:variables
}
