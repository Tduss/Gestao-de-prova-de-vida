/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employee.payroll;

import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author lenovo
 */
public class MainMenu extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        conn = db.java_db();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        // Will display the username on the MainManu page of the user who currently logged in the system
        label_username.setText(String.valueOf(EmployeeID.staff_name).toString()); 
        
        List_All();
    }
    
    private void ProvaDeVida()
    {
        try {
            
            //String db = "SELECT ID, First_Name, Date_of_birth, Gender, Designation, Date_Hired, Job_Title, Salary, Status FROM staff_info WHERE STR_TO_DATE(Date_of_birth, '%d/%m/%Y') BETWEEN DATE_FORMAT(NOW(), '%Y-%m-21') AND DATE_FORMAT(NOW() + INTERVAL 1 MONTH, '%Y-%m-20')";
            String db = "SELECT ID, First_Name, Date_of_birth, Gender, Designation, Date_Hired, Job_Title, Salary, Status FROM staff_info WHERE STR_TO_DATE(Date_of_birth, '%d/%m/%Y') BETWEEN DATE_FORMAT(NOW(), '%Y-%m-21') AND DATE_FORMAT(NOW() + INTERVAL 1 MONTH, '%Y-%m-20')";
            pst = conn.prepareStatement(db);
            rs = pst.executeQuery();
            table_MainMenu.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
    // Handle any errors here
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
    
    private void List_All(){
        try{
            String database = "SELECT ID, First_Name, Date_of_birth, Gender, Designation, Date_Hired, Job_Title, Salary, Status FROM staff_info";
            pst = conn.prepareStatement(database);
            rs = pst.executeQuery();
            table_MainMenu.setModel(DbUtils.resultSetToTableModel(rs));
            
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
    
    
    private void Delete_Staff(){
        try{
            String database = "SELECT ID, First_Name, Date_of_birth, Gender, Designation, Date_Hired, Job_Title, Salary, Status FROM staff_info";
            pst = conn.prepareStatement(database);
            rs = pst.executeQuery();
            table_MainMenu.setModel(DbUtils.resultSetToTableModel(rs));
            
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
    
    
    
    private void List_Users(){
        try{
            String database = "SELECT id, username, password, staff_ID, department FROM users";
            pst = conn.prepareStatement(database);
            rs = pst.executeQuery();
            table_MainMenu.setModel(DbUtils.resultSetToTableModel(rs));
            
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

        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        label_username = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_MainMenu = new javax.swing.JTable();
        delete_staff_MainMenu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_main_Docs = new javax.swing.JButton();
        add_staff_MainMenu = new javax.swing.JButton();
        btn_audit_MainMenu = new javax.swing.JButton();
        list_staff_MainMenu = new javax.swing.JButton();
        edit_staff_MainMenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        ID = new javax.swing.JLabel();
        txt_search_MainMenu = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        log_trail_MainMenu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Logged In As: ");

        jPanel2.setLayout(null);

        table_MainMenu.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table_MainMenu);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 130, 740, 350);

        delete_staff_MainMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/imgs/delete_16x16.gif"))); // NOI18N
        delete_staff_MainMenu.setText("Delete Staff");
        delete_staff_MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_staff_MainMenuActionPerformed(evt);
            }
        });
        jPanel2.add(delete_staff_MainMenu);
        delete_staff_MainMenu.setBounds(600, 60, 110, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/imgs/sair.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(720, 10, 26, 26);

        btn_main_Docs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/imgs/documents-16.png"))); // NOI18N
        btn_main_Docs.setText("Documents");
        btn_main_Docs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_main_DocsActionPerformed(evt);
            }
        });
        jPanel2.add(btn_main_Docs);
        btn_main_Docs.setBounds(360, 60, 120, 40);

        add_staff_MainMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/imgs/management-16.png"))); // NOI18N
        add_staff_MainMenu.setText("MANAGE");
        add_staff_MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_staff_MainMenuActionPerformed(evt);
            }
        });
        jPanel2.add(add_staff_MainMenu);
        add_staff_MainMenu.setBounds(360, 10, 120, 40);

        btn_audit_MainMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/imgs/footprint-16 (2).png"))); // NOI18N
        btn_audit_MainMenu.setText("Logs");
        btn_audit_MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_audit_MainMenuActionPerformed(evt);
            }
        });
        jPanel2.add(btn_audit_MainMenu);
        btn_audit_MainMenu.setBounds(490, 60, 100, 40);

        list_staff_MainMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/imgs/list-16.png"))); // NOI18N
        list_staff_MainMenu.setText("List staff");
        list_staff_MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_staff_MainMenuActionPerformed(evt);
            }
        });
        jPanel2.add(list_staff_MainMenu);
        list_staff_MainMenu.setBounds(490, 10, 100, 40);

        edit_staff_MainMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/imgs/list-16.png"))); // NOI18N
        edit_staff_MainMenu.setText("List Users");
        edit_staff_MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_staff_MainMenuActionPerformed(evt);
            }
        });
        jPanel2.add(edit_staff_MainMenu);
        edit_staff_MainMenu.setBounds(600, 10, 110, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/imgs/front.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 760, 620);

        jButton2.setText("jButton2");
        jPanel2.add(jButton2);
        jButton2.setBounds(280, 70, 75, 22);

        ID.setText("Delete staff (ID):");

        txt_search_MainMenu.setToolTipText("Pesquisar com ID");

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/imgs/attach.png"))); // NOI18N
        jMenu1.setText("Funcionario");

        jMenuItem5.setText("Prova de vida");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/imgs/Save-icon.png"))); // NOI18N
        jMenu2.setText("Relatorio");

        jMenuItem4.setText("Relatorio Geral");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem1.setText("Subsidios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem3.setText("Descontos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/imgs/audit-log-16.png"))); // NOI18N
        jMenu3.setText("Logs audit");

        log_trail_MainMenu.setText("Logs trail");
        log_trail_MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_trail_MainMenuActionPerformed(evt);
            }
        });
        jMenu3.add(log_trail_MainMenu);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Sobre");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_username, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)
                        .addComponent(txt_search_MainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(label_username))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_search_MainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login login_button = new Login();
        login_button.setVisible(true);
        this.dispose();
        
        try{
                    Date current_date = GregorianCalendar.getInstance().getTime();
                    DateFormat date_format = DateFormat.getDateInstance();
                    String date_string = date_format.format(current_date);
                    
                    Date date = new Date();
                    SimpleDateFormat simple_date_format = new SimpleDateFormat("HH:mm:ss");
                    String time_string = simple_date_format.format(date);
                    
                    String value0 = time_string;
                    String value1 = date_string;
                    
                    int value = EmployeeID.staff_id;
                    
                    String reg = "INSERT INTO auditoria (staff_id, date, status) VALUES ('"+value+"', '"+value0+" / "+value1+"', 'Logged out')";
                    pst = conn.prepareStatement(reg);
                    pst.execute();
                    
                    this.dispose();
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                rs.close();
                pst.close();
                
            }catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Relatorio_Geral_do_Funcionario.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        
        if(dialogResult == JFileChooser.APPROVE_OPTION)
        {
            String file_path = dialog.getSelectedFile().getPath();
            
            try{
                String sql = "SELECT * FROM staff_info";
                
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                
                Document my_doc = new Document();
                PdfWriter my_Writer = PdfWriter.getInstance(my_doc, new FileOutputStream(file_path));
                PdfPTable table = new PdfPTable(13);
                
                my_doc.open();
                
                float[] colum_widths = new float[] {3, 8, 7, 5, 5, 9, 8, 9, 6, 6, 6, 8, 8};
                table.setWidths(colum_widths);
                table.setWidthPercentage(100);
                
                my_doc.add(new Paragraph("Lista de Funcioarios", FontFactory.getFont(FontFactory.TIMES_BOLD, 20, Font.BOLD)));
                my_doc.add(new Paragraph(new Date().toString()));
                my_doc.add(new Paragraph("========================================================================="));
                table.addCell(new PdfPCell(new Paragraph("ID: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Nome: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Apelido: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Data de Nascimento: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Email: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Telefone: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Endereco: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Departamento: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Genero: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Salario: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Data de Contratacao: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Carreira: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Status: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                
                while(rs.next())
                {
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(1), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(2), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(3), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(4), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(5), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(6), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(7), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(8), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(9), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(10), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(11), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(12), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(13), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                }
                
                my_doc.add(table);
                my_doc.add(new Paragraph("========================================================================="));
                my_doc.close();
                JOptionPane.showMessageDialog(null, "Relatorio gerado com sucesso!");
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            finally{
                try{
                    rs.close();
                    pst.close();
                    
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Relatorio_Subsidio_do_Funcionario.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        
        if(dialogResult == JFileChooser.APPROVE_OPTION)
        {
            String file_path = dialog.getSelectedFile().getPath();
            
            try{
                String sql = "SELECT * FROM subsidio";
                
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                
                Document my_doc = new Document();
                PdfWriter my_Writer = PdfWriter.getInstance(my_doc, new FileOutputStream(file_path));
                PdfPTable table = new PdfPTable(11);
                
                my_doc.open();
                
                float[] colum_widths = new float[] {3, 7, 7, 5, 5, 9, 6, 5, 8, 8, 8};
                table.setWidths(colum_widths);
                table.setWidthPercentage(100); // Set table width to 100%
                
                my_doc.add(new Paragraph("Lista de subsidios de Funcioarios", FontFactory.getFont(FontFactory.TIMES_BOLD, 20, Font.BOLD)));
                my_doc.add(new Paragraph(new Date().toString()));
                my_doc.add(new Paragraph("========================================================================="));
                table.addCell(new PdfPCell(new Paragraph("ID: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Horas Extras: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Licencas: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Bonus: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Outros: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("ID do func.: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Salario: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Racio: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Subsidio Total: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Nome: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Apelido: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Elaborado por: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                
                while(rs.next())
                {
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(1), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(2), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(3), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(4), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(5), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(6), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(7), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(8), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(9), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(10), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                }
                
                my_doc.add(table);
                my_doc.add(new Paragraph("========================================================================="));
                my_doc.close();
                JOptionPane.showMessageDialog(null, "Relatorio gerado com sucesso!");
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            finally{
                try{
                    rs.close();
                    pst.close();
                    
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Relatorio_Descontos_do_Funcionario.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        
        if(dialogResult == JFileChooser.APPROVE_OPTION)
        {
            String file_path = dialog.getSelectedFile().getPath();
            
            try{
                String sql = "SELECT * FROM deducoes";
                
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                
                Document my_doc = new Document();
                PdfWriter my_Writer = PdfWriter.getInstance(my_doc, new FileOutputStream(file_path));
                PdfPTable table = new PdfPTable(8);
                
                my_doc.open();
                
                float[] colum_widths = new float[] {3, 7, 7, 5, 5, 9, 6, 5};
                table.setWidths(colum_widths);
                table.setWidthPercentage(100); // Set table width to 100%
                
                my_doc.add(new Paragraph("Lista de Descontos de Funcioarios", FontFactory.getFont(FontFactory.TIMES_BOLD, 20, Font.BOLD)));
                my_doc.add(new Paragraph(new Date().toString()));
                my_doc.add(new Paragraph("========================================================================="));
                table.addCell(new PdfPCell(new Paragraph("ID: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Nome: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Apelido: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Salario: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Valor descontado: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Motivos.: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("ID do func.: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Elaborado por: ", FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD))));
                
                while(rs.next())
                {
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(1), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(2), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(3), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(4), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(5), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(6), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(7), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(8), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8, Font.PLAIN))));
                }
                
                my_doc.add(table);
                my_doc.add(new Paragraph("========================================================================="));
                my_doc.close();
                JOptionPane.showMessageDialog(null, "Relatorio gerado com sucesso!");
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            finally{
                try{
                    rs.close();
                    pst.close();
                    
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void add_staff_MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_staff_MainMenuActionPerformed
        // TODO add your handling code here:
        AddEmployee add_employee = new AddEmployee();
        add_employee.setVisible(true);
    }//GEN-LAST:event_add_staff_MainMenuActionPerformed

    private void log_trail_MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_trail_MainMenuActionPerformed
        // TODO add your handling code here:
        Auditoria auditLogs = new Auditoria();
        auditLogs.setVisible(true);
    }//GEN-LAST:event_log_trail_MainMenuActionPerformed

    private void list_staff_MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_staff_MainMenuActionPerformed
        // TODO add your handling code here:
        List_All();
    }//GEN-LAST:event_list_staff_MainMenuActionPerformed

    private void btn_main_DocsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_main_DocsActionPerformed
        // TODO add your handling code here:
        Docs frame = null;
        try {
            frame = new Docs(); //j
        } catch (IOException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_main_DocsActionPerformed

    private void btn_audit_MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_audit_MainMenuActionPerformed
        // TODO add your handling code here:
        Auditoria auditLogs = new Auditoria();
        auditLogs.setVisible(true);
        
    }//GEN-LAST:event_btn_audit_MainMenuActionPerformed

    private void delete_staff_MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_staff_MainMenuActionPerformed
        // TODO add your handling code here:
        if (!txt_search_MainMenu.getText().isEmpty())
        {
        int confirmAdd = JOptionPane.showConfirmDialog(null, "Deseja apagar!", "Apagar o registo", JOptionPane.YES_NO_OPTION);
        
        if (confirmAdd == 0)
            {
            try
            {
                String val = txt_search_MainMenu.getText();

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
    }//GEN-LAST:event_delete_staff_MainMenuActionPerformed

    private void edit_staff_MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_staff_MainMenuActionPerformed
        // TODO add your handling code here:
         List_Users();
        
    }//GEN-LAST:event_edit_staff_MainMenuActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        ProvaDeVida();       
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JButton add_staff_MainMenu;
    private javax.swing.JButton btn_audit_MainMenu;
    private javax.swing.JButton btn_main_Docs;
    private javax.swing.JButton delete_staff_MainMenu;
    private javax.swing.JButton edit_staff_MainMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_username;
    private javax.swing.JButton list_staff_MainMenu;
    private javax.swing.JMenuItem log_trail_MainMenu;
    private javax.swing.JTable table_MainMenu;
    private javax.swing.JTextField txt_search_MainMenu;
    // End of variables declaration//GEN-END:variables
}
