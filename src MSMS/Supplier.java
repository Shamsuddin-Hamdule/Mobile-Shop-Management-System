import java.awt.*;
//import java.sql.*;
import java.awt.event.*;

public class Supplier extends Panel implements ActionListener {
    public static void main(String as[]) {
        Supplier f = new Supplier();
        f.setVisible(true);
        f.setSize(600, 600);
        // f.setTitle("Supplier");
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
         * }catch(Exception e){ System.out.println(e);}
         */
    }

    TextField sName, sid, sEmail_id, sAddress, sdob;
    TextArea ST;

    public Supplier()

    {
        setLayout(new GridLayout(0, 1));
        Label sup = new Label("Supplier Table");
        Label A = new Label("Admin Only");
        Label SName = new Label("Supplier Name");
        sName = new TextField(20);
        Label Sid = new Label("Supplier ID");
        sid = new TextField(20);
        Label SEmailid = new Label("Supplier Email ID");
        sEmail_id = new TextField(20);
        Label SAddress = new Label("Supplier Address");
        sAddress = new TextField(20);
        Label SDOB = new Label("Date of Birth");
        sdob = new TextField(20);
        Button add = new Button("Add");
        Button up = new Button("update");
        Button Rem = new Button("Remove");
        ST = new TextArea();
        Panel p1 = new Panel();
        p1.add(sup);
        p1.add(A);
        Panel p2 = new Panel();
        p2.add(SName);
        p2.add(sName);
        Panel p3 = new Panel();
        p3.add(Sid);
        p3.add(sid);
        Panel p4 = new Panel();
        p4.add(SEmailid);
        p4.add(sEmail_id);
        Panel p5 = new Panel();
        p5.add(SAddress);
        p5.add(sAddress);
        Panel p6 = new Panel();
        p6.add(SDOB);
        p6.add(sdob);
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
        add(ST);
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
        if (str.equals("Add"))
            System.out.println("Added");
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