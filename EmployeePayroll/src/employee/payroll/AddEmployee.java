/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employee.payroll;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.sql.SQLException;
/**
 *
 * @author lenovo
 */
public class AddEmployee extends javax.swing.JFrame {
        
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    /**
     * Creates new form AddEmployee
     */
    public AddEmployee() {
        initComponents();
        
        conn = db.java_db();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_id = new javax.swing.JTextField();
        txt_fname = new javax.swing.JTextField();
        txt_lname = new javax.swing.JTextField();
        txt_birthDate = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_birthPlace = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_department = new javax.swing.JTextField();
        txt_designation = new javax.swing.JTextField();
        txt_salary = new javax.swing.JTextField();
        txt_status = new javax.swing.JTextField();
        txt_jobTitle = new javax.swing.JTextField();
        txt_hiredDate = new javax.swing.JTextField();
        txt_houseNumber = new javax.swing.JTextField();
        txt_BInumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        radio_masculino = new javax.swing.JRadioButton();
        radio_feminino = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        profile_img = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btn_add_MainMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        txt_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fnameActionPerformed(evt);
            }
        });
        txt_fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fnameKeyTyped(evt);
            }
        });

        txt_lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_lnameKeyTyped(evt);
            }
        });

        txt_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_phoneKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_phoneKeyTyped(evt);
            }
        });

        txt_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressActionPerformed(evt);
            }
        });

        txt_birthPlace.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_birthPlaceKeyTyped(evt);
            }
        });

        txt_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_emailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_emailKeyTyped(evt);
            }
        });

        txt_department.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_departmentKeyTyped(evt);
            }
        });

        txt_designation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_designationKeyTyped(evt);
            }
        });

        txt_status.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_statusKeyTyped(evt);
            }
        });

        txt_BInumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BInumberKeyReleased(evt);
            }
        });

        jLabel1.setText("Employee ID:");

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("Date of Birth:");

        jLabel5.setText("Local of Birth:");

        jLabel6.setText("Email:");

        jLabel7.setText("Phone:");

        jLabel8.setText("Address:");

        jLabel9.setText("House Number:");

        jLabel10.setText("Number of BI:");

        jLabel11.setText("Department:");

        jLabel12.setText("Designation:");

        jLabel14.setText("Date Hired:");

        jLabel15.setText("Basic Salary:");

        jLabel16.setText("Status:");

        jLabel17.setText("Job Title:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/imgs/Calculate.png"))); // NOI18N
        jButton1.setText("Staff");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel18.setText("Gender:");

        radio_masculino.setText("M");
        radio_masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_masculinoActionPerformed(evt);
            }
        });

        radio_feminino.setText("F");
        radio_feminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_femininoActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/imgs/erase-128.png"))); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(profile_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profile_img, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profile_img, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
        );

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/imgs/Calculate.png"))); // NOI18N
        jButton3.setText("Add Foto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        jLabel19.setText("Search staff:");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/imgs/delete_16x16.gif"))); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/imgs/update icon.png"))); // NOI18N
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btn_add_MainMenu.setText("Main Menu");
        btn_add_MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_MainMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(radio_masculino, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radio_feminino, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txt_birthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_birthPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_houseNumber)
                    .addComponent(txt_BInumber)
                    .addComponent(txt_status)
                    .addComponent(txt_department)
                    .addComponent(txt_designation)
                    .addComponent(txt_jobTitle)
                    .addComponent(txt_hiredDate)
                    .addComponent(txt_salary))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_add_MainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addGap(61, 61, 61)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel18)
                                .addComponent(jLabel3)))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel19))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_lname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(radio_masculino)
                                    .addComponent(radio_feminino))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_birthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_birthPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_houseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_BInumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_designation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_jobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel17)))
                                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_hiredDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_add_MainMenu)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel16)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(2, 2, 2)))))
                .addContainerGap(206, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Confirmation Dialog
        if (!txt_fname.getText().isEmpty() && !txt_lname.getText().isEmpty() && 
                !txt_birthDate.getText().isEmpty() && !txt_birthPlace.getText().isEmpty() && !txt_email.getText().isEmpty() && 
                !txt_phone.getText().isEmpty() && !txt_address.getText().isEmpty() && !txt_department.getText().isEmpty())
        {
        int confirmAdd = JOptionPane.showConfirmDialog(null, "Confirma o registo", "Add staff", JOptionPane.YES_NO_OPTION);
        
        if (confirmAdd == 0)
        {
            try
            {
                pst = conn.prepareStatement("INSERT INTO staff_info (First_Name, Last_Name, Date_of_birth, Email, Telephone, Address, Department, Image, Gender, Salary, BI_Number, House_Number, Designation, Date_Hired, Job_Title, Status)" + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pst.setString(1, txt_fname.getText());
                pst.setString(2, txt_lname.getText());
                pst.setString(3, txt_birthDate.getText());
                //pst.setDate(3, new java.sql.Date(txt_birthDate.getDate().getTime()));
                pst.setString(4, txt_email.getText());
                pst.setString(5, txt_phone.getText());
                pst.setString(6, txt_address.getText());
                pst.setString(7, txt_department.getText());

                pst.setBytes(8, staff_img);
                pst.setString(9, gender);
                pst.setString(10, txt_salary.getText());
                pst.setString(11, txt_BInumber.getText());
                pst.setString(12, txt_houseNumber.getText());
                pst.setString(13, txt_designation.getText());
                pst.setString(14, txt_hiredDate.getText());
                //pst.setDate(14, new java.sql.Date(txt_hiredDate.getDate().getTime()));
                pst.setString(15, txt_jobTitle.getText());
                pst.setString(16, txt_status.getText());

                pst.execute();
                JOptionPane.showMessageDialog(null, "Saved");
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
            try
            {
                //Criar automaticamente um nome de usuário
                String add_sql = "SELECT * FROM staff_info WHERE ID NOT IN (SELECT id FROM users)";
                
                pst = conn.prepareStatement(add_sql);
                
                rs = pst.executeQuery();
                
                while (rs.next())
                {
                    String add_ID = rs.getString("ID");
                    String add_username = rs.getString("First_Name"); //The first name will be the username
                    String add_password = rs.getString("Date_of_birth"); // Date of birth will be the passoword
                    String password = add_password.replace("/", ""); // remove the back slash from the date format
                    String add_department = rs.getString("Department"); // Which department belong this staff

                    String insert_sql = "INSERT INTO users (username, password, department, staff_ID) VALUES (?,?,?,?)";
                    pst = conn.prepareStatement(insert_sql);
                    
                     pst.setString(1, add_username);
                     pst.setString(2, password);
                     pst.setString(3, add_department);
                     pst.setString(4, add_ID);
                    
                    pst.execute();
                    
                    JOptionPane.showMessageDialog(null, "User account created successfully: Username: "+add_username+ "Passoword: "+password);
                }                    
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
            finally
            {
                try
                {
                    if (rs != null) 
                    {
                        rs.close();
                    }
                    pst.close();
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);       
                }
            }
        }
        }else{
    // Exibir uma mensagem de erro se algum dos campos de texto estiver vazio
    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressActionPerformed

    private void radio_masculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_masculinoActionPerformed
          // TODO add your handling code here:
          gender = "M";
          radio_masculino.setSelected(true);
          radio_feminino.setSelected(false); // When male is selected disable female
    }//GEN-LAST:event_radio_masculinoActionPerformed

    private void radio_femininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_femininoActionPerformed
        // TODO add your handling code here:
        gender = "F";
          radio_feminino.setSelected(true);
          radio_masculino.setSelected(false); // When female is selected disable male
    }//GEN-LAST:event_radio_femininoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int confirmAdd = JOptionPane.showConfirmDialog(null, "Deseja limpar os campos!", "Limpar", JOptionPane.YES_NO_OPTION);
        
        if (confirmAdd == 0)
        {
            txt_search.setText("");
            txt_id.setText("");
            txt_fname.setText("");
            txt_lname.setText("");
            txt_birthDate.setText("");
            txt_birthPlace.setText("");
            txt_email.setText("");
            txt_phone.setText("");
            txt_address.setText("");
            txt_department.setText("");
            profile_img.setIcon(null);
            txt_salary.setText("");
            txt_BInumber.setText("");
            txt_houseNumber.setText("");
            txt_designation.setText("");
            txt_hiredDate.setText("");
            txt_jobTitle.setText("");
            txt_status.setText("");
//            String add17 = rs.getString("Gender");
//            if (add17.equals("M"))
//                radio_masculino.setSelected(false);
//            else
//                radio_feminino.setSelected(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        JFileChooser choose_image = new JFileChooser();
        choose_image.showOpenDialog(null);
        File file = choose_image.getSelectedFile();
        
        filename = file.getAbsolutePath();
        //Fit the image in our image label
        ImageIcon ImageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(profile_img.getWidth(),
                profile_img.getHeight(), Image.SCALE_DEFAULT));
        profile_img.setIcon(ImageIcon);
       


//        JFileChooser choose_image = new JFileChooser();
//        int result = choose_image.showOpenDialog(null);
//        if (result == JFileChooser.APPROVE_OPTION) 
//        {
//            File file = choose_image.getSelectedFile();
//            String filename = file.getAbsolutePath();
//            try 
//            {
//                //Fit the image in our image label
//                ImageIcon ImageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(profile_img.getWidth(),profile_img.getHeight(), Image.SCALE_DEFAULT));
//                profile_img.setIcon(ImageIcon);
//            } catch (Exception e) 
//            {
//                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
//            }
//        } else if (result == JFileChooser.CANCEL_OPTION) 
//        {
//            JOptionPane.showMessageDialog(null, "No file selected.");
//        } else if (result == JFileChooser.ERROR_OPTION) 
//        {
//            JOptionPane.showMessageDialog(null, "An error occurred while selecting the file.");
//        }
        
        
        try
        {
            File img = new File(filename);
            FileInputStream in = new FileInputStream(img);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            
            for (int number; (number = in.read(buf)) != -1;)
            {
                bos.write(buf, 0, number);
            }
            staff_img = bos.toByteArray();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    
    
    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
        try
        {

            pst = conn.prepareStatement("SELECT * FROM Staff_info WHERE ID=? ");
            pst.setString(1,txt_search.getText());
            rs = pst.executeQuery();
            
                //String add1 = rs.getString("ID");
                //txt_id.setText(add1);
                
            
                if (rs.next()) 
                {
                    String add1 = rs.getString("ID");
                    txt_id.setText(add1);
                    
                    String add2 = rs.getString("First_Name");
                    txt_fname.setText(add2);

                    String add3 = rs.getString("Last_Name");
                    txt_lname.setText(add3);
                    
                    String add4 = rs.getString("Date_of_birth");
                    txt_birthDate.setText(add4);

                    String add5 = rs.getString("Email");
                    txt_email.setText(add5);

                    String add6 = rs.getString("Telephone");
                    txt_phone.setText(add6);

                    String add7 = rs.getString("Address");
                    txt_address.setText(add7);

                    String add8 = rs.getString("Department");
                    txt_department.setText(add8);

                    String add9 = rs.getString("Image");
                    profile_img.setText(add9);

                    String add10 = rs.getString("Salary");
                    txt_salary.setText(add10);

                    String add11 = rs.getString("BI_Number");
                    txt_BInumber.setText(add11);

                    String add12 = rs.getString("House_Number");
                    txt_houseNumber.setText(add12);

                    String add13 = rs.getString("Designation");
                    txt_designation.setText(add13);

                    String add14 = rs.getString("Date_Hired");
                    txt_hiredDate.setText(add14);

                    String add15 = rs.getString("Job_Title");
                    txt_jobTitle.setText(add15);

                    String add16 =rs.getString("Status");
                    txt_status.setText(add16);
                    
                    // Select Gender from the db and display it on search fields in the java program
                    String add17 = rs.getString("Gender");
                    if (add17.equals("M"))
                        radio_masculino.setSelected(true);
                    else
                        radio_feminino.setSelected(true);

//                    byte[] image = rs.getBytes("Image");
//                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(profile_img.getWidth(), profile_img.getHeight(), Image.SCALE_SMOOTH));
//                    profile_img.setIcon(imageIcon);

                    try 
                    {
                        byte[] image = rs.getBytes("Image");
                        ImageIcon icon = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(profile_img.getWidth(), profile_img.getHeight(), Image.SCALE_SMOOTH));
                        profile_img.setIcon(icon);
                    } catch (SQLException e) 
                    {
                        e.printStackTrace();
                    }

                }

        }catch(Exception e)
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
            catch(Exception e)
            {

            }
         }
    }//GEN-LAST:event_txt_searchKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (!txt_search.getText().isEmpty() && !txt_id.getText().isEmpty())
        {
        int confirmAdd = JOptionPane.showConfirmDialog(null, "Deseja apagar!", "Apagar o registo", JOptionPane.YES_NO_OPTION);
        
        if (confirmAdd == 0)
            {
            try
            {
                String val = txt_id.getText();

                pst = conn.prepareStatement("UPDATE staff_info SET Status='inactive' WHERE ID=?");
                pst.setString(1, val);

                
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Apagado com sucesso!");
//            }
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
            finally
            {
                try
                {

                }
                catch (Exception e)
                {

                }
            }
        }
    } else{
    // Display an error message if any of the text fields are empty
    JOptionPane.showMessageDialog(null, "Por favor, especifique o trabalhador a actualizar!", "Erro", JOptionPane.ERROR_MESSAGE);
}
            
        /*{
            try
            {        
                pst = conn.prepareStatement("DELETE FROM staff_info WHERE ID=?");
                pst.setString(1, txt_id.getText());
                pst.execute();

                JOptionPane.showMessageDialog(null, "Apagado com sucesso!");
            }
            catch(Exception e)
            {
               // JOptionPane.showMessageDialog(null, e);
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao apagar o registo.", "Erro", JOptionPane.ERROR_MESSAGE);
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
                
        }
    }else {
        
    // Display an error message if any of the text fields are empty
    JOptionPane.showMessageDialog(null, "Por favor, especifique o ID do trabalhador no campo da pesquisa!", "Erro", JOptionPane.ERROR_MESSAGE);
} */
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here
        if (!txt_id.getText().isEmpty() && !txt_fname.getText().isEmpty() && !txt_lname.getText().isEmpty() && 
                !txt_birthDate.getText().isEmpty() || !txt_birthPlace.getText().isEmpty() && !txt_email.getText().isEmpty() && 
                !txt_phone.getText().isEmpty() && !txt_address.getText().isEmpty() && !txt_department.getText().isEmpty())
        {
        int confirmAdd = JOptionPane.showConfirmDialog(null, "Confirma a actualizao?", "Actualiza", JOptionPane.YES_NO_OPTION);
        
        if (confirmAdd == 0)
        {
            try
            {
                String val = txt_id.getText();
                String val1 = txt_fname.getText();
                String val2 = txt_lname.getText();
                String val3 = txt_birthDate.getText();
                String val4 = txt_birthPlace.getText();
                String val5 = txt_email.getText();
                String val6 = txt_phone.getText();
                String val7 = txt_address.getText();
                String val8 = txt_department.getText();
                String val9 = profile_img.getText();
                String val10 = txt_salary.getText();
                String val11 = txt_BInumber.getText();
                String val12 = txt_houseNumber.getText();
                String val13 = txt_designation.getText();
                String val14 = txt_hiredDate.getText();
                String val15 = txt_jobTitle.getText();
                String val16 = txt_status.getText(); 
                
                pst = conn.prepareStatement("UPDATE staff_info SET ID=?, First_Name=?, Last_Name=?, Date_of_birth=?, Email=?, Telephone=?, Address=?, Department=?, Image=?, Salary=?, BI_Number=?, House_Number=?, Designation=?, Date_Hired=?, Job_Title=?, Status=? WHERE ID=?");
                pst.setString(1, val);
                pst.setString(2, val1);
                pst.setString(3, val2);
                pst.setString(4, val3);
                pst.setString(5, val5);
                pst.setString(6, val6);
                pst.setString(7, val7);
                pst.setString(8, val8);
                pst.setString(9, val9);
                pst.setString(10, val10);
                pst.setString(11, val11);
                pst.setString(12, val12);
                pst.setString(13, val13);
                pst.setString(14, val14);
                pst.setString(15, val15);
                pst.setString(16, val16);
                pst.setString(17, gender);

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Actualizado com sucesso!");
//            }
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            /*
            try
            {
                //Update the profile image
                File img = new File(filename);
                FileInputStream in = new FileInputStream(img);
                //ByteArrayOutputStream bos = new ByteArrayOutputStream();
                byte[] buf = new byte[(int) img.length()];
                in.read(buf);
                
                
                String database = "UPDATE staff_info SET Image=? WHERE ID=?";
                pst.setString(1, val);
                pst = conn.prepareStatement(database);
                pst.setBytes(1, buf);              
                pst.executeUpdate();
                pst.close();
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            */
            finally
            {
                try
                {

                }
                catch (Exception e)
                {

                }
            }
        }
    } else{
    // Display an error message if any of the text fields are empty
    JOptionPane.showMessageDialog(null, "Por favor, especifique o trabalhador a actualizar!", "Erro", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void btn_add_MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_MainMenuActionPerformed
        // TODO add your handling code here:
        MainMenu frame = new MainMenu();  //j
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_add_MainMenuActionPerformed

    private void txt_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fnameActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fnameActionPerformed

    private void txt_fnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fnameKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!String.valueOf(c).matches("[a-zA-Z]+")) {
        evt.consume();
    }
    }//GEN-LAST:event_txt_fnameKeyTyped

    private void txt_lnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lnameKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!String.valueOf(c).matches("[a-zA-Z]+")) {
        evt.consume();
    }
    }//GEN-LAST:event_txt_lnameKeyTyped

    private void txt_birthPlaceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_birthPlaceKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!String.valueOf(c).matches("[a-zA-Z]+")) {
        evt.consume();
    }
    }//GEN-LAST:event_txt_birthPlaceKeyTyped

    private void txt_departmentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_departmentKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!String.valueOf(c).matches("[a-zA-Z]+")) {
        evt.consume();
    }
    }//GEN-LAST:event_txt_departmentKeyTyped

    private void txt_designationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_designationKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!String.valueOf(c).matches("[a-zA-Z]+")) {
        evt.consume();
    }
    }//GEN-LAST:event_txt_designationKeyTyped

    private void txt_statusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_statusKeyTyped
        // TODO add your handling code here:      
    
    }//GEN-LAST:event_txt_statusKeyTyped

    private void txt_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyTyped
        // TODO add your handling code here:
//        char c = evt.getKeyChar();
//        if (!String.valueOf(c).matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
//        evt.consume();
//    }
    }//GEN-LAST:event_txt_emailKeyTyped

    private void txt_emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyReleased
        // TODO add your handling code here:
  
    }//GEN-LAST:event_txt_emailKeyReleased

    private void txt_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneKeyTyped
        // TODO add your handling code here:
//        char c = evt.getKeyChar();
//        if (!String.valueOf(c).matches("(82|83|84|85|86|87)\\d{7}")) {
//        evt.consume();
//    }
    }//GEN-LAST:event_txt_phoneKeyTyped

    private void txt_phoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneKeyPressed
//        // TODO add your handling code here:
//        char c = evt.getKeyChar();
//        if (!String.valueOf(c).matches("(82|83|84|85|86|87)\\d{7}")) {
//        evt.consume();
//    }
    }//GEN-LAST:event_txt_phoneKeyPressed

    private void txt_BInumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BInumberKeyReleased
        // TODO add your handling code here:
//       String text = txt_BInumber.getText();
//        if (text.matches("^[0-9]{12}[A-Z]$")) {
//        // TODO: Add your handling code here
//    } 
    }//GEN-LAST:event_txt_BInumberKeyReleased

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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_MainMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel profile_img;
    private javax.swing.JRadioButton radio_feminino;
    private javax.swing.JRadioButton radio_masculino;
    private javax.swing.JTextField txt_BInumber;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_birthDate;
    private javax.swing.JTextField txt_birthPlace;
    private javax.swing.JTextField txt_department;
    private javax.swing.JTextField txt_designation;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_hiredDate;
    private javax.swing.JTextField txt_houseNumber;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_jobTitle;
    private javax.swing.JTextField txt_lname;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_status;
    // End of variables declaration//GEN-END:variables
    
    private String gender;
    private ImageIcon format = null;
    String filename = null;
    byte[] staff_img = null;
}
