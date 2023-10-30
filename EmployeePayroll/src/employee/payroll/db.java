/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package employee.payroll;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
*/
public class db 
{
    Connection conn = null;
    public static Connection java_db()
    {
        try
        {
            //Class.forName("org.sqlite.JDBC");
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\lenovo\\Desktop\\TSemestral\\EmployeePayroll\\payrolldatabase.sqlite");
            String url = "jdbc:mysql://localhost:3306/payrolldatabase";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url, username, password);
            return conn;
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}

 