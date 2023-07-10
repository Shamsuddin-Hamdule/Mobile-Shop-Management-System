import java.sql.*;

public class db // implements ItemListener
{
    public static void main(String as[]) {
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            // Connection
            // con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
            // Connection con=DriverManager.getConnection("localhost","root","");
            // here sonoo is database name, root is username and password
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:dbdsn");
            Statement st = con.createStatement();
            //String s="Create table Order (OrderId int, ODate char(10) )";
            String s = "Create table supplier_bill(ID int, ODate varchar(20), S_ID varchar(20), S_Name varchar(20), MOB_ID int, Mob_Name varchar(20),Date_of_Lunch varchar(20), Quantity int, Bill_Amt int)";
            st.executeUpdate(s);
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}