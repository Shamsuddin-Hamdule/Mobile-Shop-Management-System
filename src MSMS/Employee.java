import java.awt.*;
//import java.sql.*;
import java.awt.event.*;

public class Employee extends Panel implements ActionListener {
    public static void main(String as[]) {
        Employee f = new Employee();
        f.setVisible(true);
        f.setSize(650, 400);
        // f.setTitle("Employee");

        // try{
        // Class.forName("com.mysql.jdbc.Driver");
        // Connection
        // con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Admin","root","root");
        // here sonoo is database name, root is username and password
        // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        // Connection con=DriverManager.getConnection("jdbc:odbc:dbdsn");
        // Statement st=con.createStatement();
        // String s="insert into Emp values(2, 'Saif' , 'cpn' )";
        // st.executeUpdate(s);
        // con.close();
        // }catch(Exception e){ System.out.println(e);}

    }

    TextField eName, Eid, Email_id, eAddress, edoj, edob;
    TextArea ET;

    public Employee()

    {
        setLayout(new GridLayout(0, 2));
        Label emp = new Label("Employee Table");
        Label A = new Label("Admin Only");
        Label EName = new Label("Employee Name");
        eName = new TextField(20);
        Label id = new Label("Employee ID");
        Eid = new TextField(20);
        Label Emailid = new Label("Employee Email ID");
        Email_id = new TextField(20);
        Label Address = new Label("Employee Address");
        eAddress = new TextField(20);
        Label EDOJ = new Label("Date of Joining");
        edoj = new TextField(20);
        Label EDOB = new Label("Date of Birth");
        edob = new TextField(20);
        Button add = new Button("Add");
        Button up = new Button("update");
        Button Rem = new Button("Remove");
        Button ser = new Button("Search");
        ET = new TextArea();
        // Panel p1 = new Panel();
        // p1.add(emp);
        // p1.add(A);
        Panel p2 = new Panel();
        p2.add(EName);
        p2.add(eName);
        Panel p3 = new Panel();
        p3.add(id);
        p3.add(Eid);
        Panel p4 = new Panel();
        p4.add(Emailid);
        p4.add(Email_id);
        Panel p5 = new Panel();
        p5.add(Address);
        p5.add(eAddress);
        Panel p6 = new Panel();
        p6.add(EDOB);
        p6.add(edob);
        Panel p7 = new Panel();
        p7.add(EDOJ);
        p7.add(edoj);
        Panel p8 = new Panel();
        p8.add(add);
        p8.add(up);
        p8.add(Rem);
        p8.add(ser);
        add(emp);
        add(A);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
        add(p6);
        add(p7);
        add(p8, BorderLayout.EAST);
        add(ET);
        add.addActionListener(this);
        up.addActionListener(this);
        Rem.addActionListener(this);
        /*
         * try {
         * // Class.forName("com.mysql.jdbc.Driver");
         * // Connection
         * //
         * con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root",
         * "root");
         * // Connection con=DriverManager.getConnection("localhost","root","");
         * // here sonoo is database name, root is username and password
         * Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         * Connection con = DriverManager.getConnection("jdbc:odbc:dbdsn");
         * Statement st = con.createStatement();
         * ResultSet rs = st.executeQuery("select * from emp");
         * while (rs.next())
         * System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " +
         * rs.getString(3));
         * // ET.setText(rs);
         * con.close();
         * } catch (Exception e) {
         * System.out.println(e);
         * }
         */

    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("Add"))
            System.out.println("Employee Added");
        /*
         * try {
         * // Class.forName("com.mysql.jdbc.Driver");
         * // Connection
         * //
         * con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root",
         * "root");
         * // Connection con=DriverManager.getConnection("localhost","root","");
         * // here sonoo is database name, root is username and password
         * Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         * Connection con = DriverManager.getConnection("jdbc:odbc:dbdsn");
         * Statement st = con.createStatement();
         * String s = "insert into Emp values(" + Eid.getText() + ",'" + eName.getText()
         * + "  ','" + Email_id.getText() + "', '" + edoj.getText() + "', '" +
         * eAddress.getText() + "')";
         * st.executeUpdate(s);
         * // ET.setText(rs);
         * con.close();
         * } catch (Exception e) {
         * System.out.println(e);
         * }
         */
        if (str.equals("update"))
            System.out.println("Successfully Updated");
        if (str.equals("Remove"))
            System.out.println("Successfully Removed");
    }
}
