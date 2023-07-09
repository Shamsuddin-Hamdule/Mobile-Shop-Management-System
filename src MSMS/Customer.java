import java.awt.*;
import java.awt.event.*;
//import java.sql.*;

public class Customer extends Frame implements ActionListener {
    public static void main(String as[]) {
        Customer f = new Customer();
        f.setVisible(true);
        f.setSize(600, 600);
        f.setTitle("Customer");

        /*
         * try{
         * Class.forName("com.mysql.jdbc.Driver");
         * Connection
         * con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Admin","root",
         * "root");
         * //here sonoo is database name, root is username and password
         * Statement stmt=con.createStatement();
         * ResultSet rs=stmt.executeQuery("select * from emp");
         * while(rs.next())
         * System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
         * con.close();
         * }catch(Exception e){System.out.println(e);};
         */

    }

    TextField cName, cid, cEmail_id, cdob, cAddress;
    TextArea CT;

    public Customer()

    {
        setLayout(new GridLayout(0, 1));
        Label cus = new Label("Customer Table");
        Label A = new Label("Admin Only");
        Label CName = new Label("Customer Name");
        cName = new TextField(20);
        Label Cid = new Label("Customer ID");
        cid = new TextField(20);
        Label CEmailid = new Label("Customer Email ID");
        cEmail_id = new TextField(20);
        Label CAddress = new Label("Customer Address");
        cAddress = new TextField(20);
        Label CDOB = new Label("Date of Birth");
        cdob = new TextField(20);
        Button add = new Button("Add Customer");
        Button up = new Button("update Customer");
        Button Rem = new Button("Remove Customer");
        CT = new TextArea();
        Panel p1 = new Panel();
        p1.add(cus);
        p1.add(A);
        Panel p2 = new Panel();
        p2.add(CName);
        p2.add(cName);
        Panel p3 = new Panel();
        p3.add(Cid);
        p3.add(cid);
        Panel p4 = new Panel();
        p4.add(CEmailid);
        p4.add(cEmail_id);
        Panel p5 = new Panel();
        p5.add(CAddress);
        p5.add(cAddress);
        Panel p6 = new Panel();
        p6.add(CDOB);
        p6.add(cdob);
        Panel p7 = new Panel();
        p7.add(add);
        p7.add(up);
        p7.add(Rem);

        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
        add(p6);
        add(p7);
        add(CT);
        add.addActionListener(this);
        up.addActionListener(this);
        Rem.addActionListener(this);
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("Add Customer"))
            System.out.println("Customer Added");
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
    }
}