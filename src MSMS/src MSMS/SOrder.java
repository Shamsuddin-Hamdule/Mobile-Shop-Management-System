import java.awt.*;
//import java.sql.*;
import java.awt.event.*;

public class SOrder extends Frame implements ActionListener
{
    public static void main(String as[]) {
        SOrder f = new SOrder();
        f.setVisible(true);
        f.setSize(600, 600);
        f.setTitle("Supplier Order");
        /*
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
        */
    }

    //public Customer C=new Customer();
    //public Supplier S=new Supplier();
    //public Mobile M=new Mobile();
    TextField soid,sodate,sid,mid,sName,mName,sdol,sp,oq;
    TextArea SOT;
    public SOrder()

    {
        setLayout(new GridLayout(0, 1));
        Label SORDER = new Label("SUPPLIER ORDER Table");
        Label A = new Label("Admin Only");
        Label SOid = new Label("SUPPLIER ORDER id");
        soid = new TextField(20);
        Label SOdate = new Label("SUPPLIER ORDER DATE");
        sodate = new TextField(20);
        Label Sid = new Label("Supplier ID");
        sid = new TextField(20);
        Label SName = new Label("Supplier Name");
        sName = new TextField(20);
        Label Mid = new Label("Mobile ID");
        mid = new TextField(20);
        Label MName = new Label("Mobile Name");
        mName = new TextField(20);
        Label SDOL = new Label("Date of Lunch");
        sdol = new TextField(20);
        Label OQ = new Label("Quantity");
        oq = new TextField(20);
        Button add = new Button("Add Mobile");
        Button up = new Button("update Mobile");
        Button Rem = new Button("Remove Mobile");
        SOT = new TextArea();
        Panel p1 = new Panel();
        p1.add(SORDER);
        p1.add(A);
        Panel p2 = new Panel();
        p2.add(SOid);
        p2.add(soid);
        Panel p3 = new Panel();
        p3.add(SOdate);
        p3.add(sodate);
        Panel p6 = new Panel();
        p6.add(Sid);
        p6.add(sid);
        Panel p7 = new Panel();
        p7.add(SName);
        p7.add(sName);
        Panel p8 = new Panel();
        p8.add(Mid);
        p8.add(mid);
        Panel p9 = new Panel();
        p9.add(MName);
        p9.add(mName);
        Panel p10 = new Panel();
        p10.add(SDOL);
        p10.add(sdol);
        Panel p11 = new Panel();
        p11.add(OQ);
        p11.add(oq);
        Panel p12 = new Panel();
        p12.add(add);
        p12.add(up);
        p12.add(Rem);

        add(p1);
        add(p2);
        add(p3);
        add(p6);
        add(p7);
        add(p8);
        add(p9);
        add(p10);
        add(p11);
        add(p12);
        add(SOT);
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
        if (str.equals("Add Mobile"))
        System.out.println("Mobile Added");
            /*try {
                // Class.forName("com.mysql.jdbc.Driver");
                // Connection
                // con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
                // Connection con=DriverManager.getConnection("localhost","root","");
                // here sonoo is database name, root is username and password
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection con = DriverManager.getConnection("jdbc:odbc:dbdsn");
                Statement st = con.createStatement();
                String s = "insert into Emp values(" + Eid.getText() + ",'" + eName.getText() + "  ','" + Email_id.getText() + "', '" + edoj.getText() + "', '" + eAddress.getText() + "')";
                st.executeUpdate(s);
                // ET.setText(rs);
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }*/
    }
}