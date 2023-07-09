import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class Order extends Frame // implements ItemListener
{
    public static void main(String as[]) {
        Order f = new Order();
        f.setVisible(true);
        f.setSize(600, 600);
        f.setTitle("Order");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Admin", "root", "root");
            // here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from emp");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
 
    }

    public Order()

    {
        
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                System.exit(0);
            }
        });
    }
}