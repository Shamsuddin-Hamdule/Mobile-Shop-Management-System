//import java.sql.*;
//import java.sql.Connection;
import java.awt.*;
import java.awt.event.*;

public class Admin extends Frame // implements ItemListener
{
    public static void main(String as[]) {
        Admin f = new Admin();
        f.setVisible(true);
        f.setSize(600, 600);
        f.setTitle("Admin");
/* 
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            // Connection
            // con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
            // Connection con=DriverManager.getConnection("localhost","root","");
            // here sonoo is database name, root is username and password
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:dbdsn");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Admin");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
  */
    }

    public Admin()

    {
        setLayout(new GridLayout(0,1));
        Label AO =new Label();
        add(AO);
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                System.exit(0);
            }
        });

    }
}