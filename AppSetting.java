import java.sql.*;
import javax.swing.*;

/**
 *
 * @author SUVO242 
 */
public class AppSetting {
    Connection con = null;
    public static Connection ConnectDT()
    {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/city_management","root","");
            return con;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Connection problem!");
        }
        return null;
    }
}
