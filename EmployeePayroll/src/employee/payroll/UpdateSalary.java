/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employee.payroll;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lenovo
 */
public class UpdateSalary extends javax.swing.JFrame 
{
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    /**
     * Creates new form UpdateSalary
     */
    public UpdateSalary() 
    {
        initComponents();
        conn = db.java_db();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
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
        txt_salary_search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_salary_staffID = new javax.swing.JTextField();
        txt_salary_fname = new javax.swing.JTextField();
        txt_salary_lname = new javax.swing.JTextField();
        txt_salary_dateBirth = new javax.swing.JTextField();
        txt_salary_basicSalary = new javax.swing.JTextField();
        txt_salary_department = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        radio_salary_percentage = new javax.swing.JRadioButton();
        radio_salary_amount = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txt_salary_percentage = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_salary_amount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Search employee ID:");

        txt_salary_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salary_searchActionPerformed(evt);
            }
        });
        txt_salary_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_salary_searchKeyReleased(evt);
            }
        });

        jLabel2.setText("Employee ID:");

        jLabel3.setText("First Name:");

        jLabel4.setText("Last Name:");

        jLabel5.setText("Data of Birth:");

        jLabel6.setText("Basic Salary:");

        jLabel7.setText("Department:");

        txt_salary_staffID.setEditable(false);

        txt_salary_fname.setEditable(false);

        txt_salary_lname.setEditable(false);

        txt_salary_dateBirth.setEditable(false);

        txt_salary_basicSalary.setEditable(false);

        txt_salary_department.setEditable(false);

        jLabel8.setText("Actualizar salario:");

        radio_salary_percentage.setText("Percentagens (%)");
        radio_salary_percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_salary_percentageActionPerformed(evt);
            }
        });

        radio_salary_amount.setText("Montante");
        radio_salary_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_salary_amountActionPerformed(evt);
            }
        });

        jLabel9.setText("Percentagem:");

        txt_salary_percentage.setEditable(false);
        txt_salary_percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salary_percentageActionPerformed(evt);
            }
        });

        jLabel10.setText("Montante:");

        txt_salary_amount.setEditable(false);
        txt_salary_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salary_amountActionPerformed(evt);
            }
        });

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_salary_search, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_salary_fname, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_salary_staffID, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_salary_lname, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                            .addGap(67, 67, 67)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_salary_basicSalary, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_salary_dateBirth, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_salary_department, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_salary_percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(radio_salary_percentage))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(radio_salary_amount)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_salary_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_salary_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txt_salary_staffID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_salary_dateBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(txt_salary_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_salary_basicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(txt_salary_department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_salary_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(radio_salary_percentage)
                    .addComponent(radio_salary_amount))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_salary_percentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_salary_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_salary_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_salary_searchKeyReleased
        // TODO add your handling code here:
        try
        {
            String database = "SELECT * FROM staff_info WHERE ID = ?";
            pst = conn.prepareStatement(database);
            pst.setString(1,txt_salary_search.getText());
            rs = pst.executeQuery();
            
            
            if (rs.next()) 
                {
                    String add1 = rs.getString("ID");
                    txt_salary_staffID.setText(add1);
                    
                    String add2 = rs.getString("First_Name");
                    txt_salary_fname.setText(add2);

                    String add3 = rs.getString("Last_Name");
                    txt_salary_lname.setText(add3);
                    
                    String add4 = rs.getString("Date_of_birth");
                    txt_salary_dateBirth.setText(add4);
                    
                    String add8 = rs.getString("Department");
                    txt_salary_department.setText(add8);

                    String add10 = rs.getString("Salary");
                    txt_salary_basicSalary.setText(add10);
                }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro ao carregar os dados");
        }
        finally
        {
            try
            {
                rs.close();
                pst.close();
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_txt_salary_searchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //int confirmAdd = JOptionPane.showConfirmDialog(null, "Confirma o registo", "Add staff", JOptionPane.YES_NO_OPTION);

        try {
            int salary = Integer.parseInt(txt_salary_basicSalary.getText());
            if (radio_salary_percentage.isSelected()) 
            {        
                int get_percentage = Integer.parseInt(txt_salary_percentage.getText());
                int calculate_percentage = salary / 100 * get_percentage + salary;
                String percentage = String.valueOf(calculate_percentage);
                txt_salary_basicSalary.setText(percentage);
            }
            else if (radio_salary_amount.isSelected()) 
            {
                int get_amount = Integer.parseInt(txt_salary_amount.getText());
                int calculate_amount = salary + get_amount;
                String amount = String.valueOf(calculate_amount);
                txt_salary_basicSalary.setText(amount);
            }
        }
        catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(null, "Invalid input: " + e.getMessage());
        }

        try 
        {
            String user_id = txt_salary_staffID.getText();
            String staff_basicSalary = txt_salary_basicSalary.getText();

            pst = conn.prepareStatement("UPDATE staff_info SET Salary=? WHERE ID=?");
            pst.setString(1, staff_basicSalary);
            pst.setString(2, user_id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salario atualizado com sucesso!");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error updating salary: " + e.getMessage());
        }
        finally
        {
            try
            {
                rs.close();
                pst.close();
            }
            catch (Exception e)
            {
                
            }
        }
     
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void radio_salary_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_salary_amountActionPerformed
        // TODO add your handling code here:
        radio_salary_amount.setSelected(true);
        radio_salary_percentage.setSelected(false);
        txt_salary_percentage.setEnabled(false);
        txt_salary_amount.setEditable(true);
        txt_salary_amount.setEnabled(true);        
        txt_salary_percentage.setText("");
        
    }//GEN-LAST:event_radio_salary_amountActionPerformed

    private void radio_salary_percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_salary_percentageActionPerformed
        // TODO add your handling code here:
        radio_salary_percentage.setSelected(true);
        radio_salary_amount.setSelected(false);
        txt_salary_amount.setEnabled(false);
        txt_salary_percentage.setEditable(true);
        txt_salary_percentage.setEnabled(true);        
        txt_salary_amount.setText("");
    }//GEN-LAST:event_radio_salary_percentageActionPerformed

    private void txt_salary_percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salary_percentageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salary_percentageActionPerformed

    private void txt_salary_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salary_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salary_amountActionPerformed

    private void txt_salary_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salary_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salary_searchActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateSalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JRadioButton radio_salary_amount;
    private javax.swing.JRadioButton radio_salary_percentage;
    private javax.swing.JTextField txt_salary_amount;
    private javax.swing.JTextField txt_salary_basicSalary;
    private javax.swing.JTextField txt_salary_dateBirth;
    private javax.swing.JTextField txt_salary_department;
    private javax.swing.JTextField txt_salary_fname;
    private javax.swing.JTextField txt_salary_lname;
    private javax.swing.JTextField txt_salary_percentage;
    private javax.swing.JTextField txt_salary_search;
    private javax.swing.JTextField txt_salary_staffID;
    // End of variables declaration//GEN-END:variables
}
