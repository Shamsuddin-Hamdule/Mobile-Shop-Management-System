import java.awt.*;
//import java.sql.*;
import java.awt.event.*;

public class Mobile extends Frame  implements ActionListener
{

    public static void main(String as[]) {
        Mobile f = new Mobile();
        f.setVisible(true);
        f.setSize(600, 600);
        f.setTitle("Mobile");
    /*    try {
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

    TextField mName,mOS,mid,sid,sName,sdol,sp;
    TextArea MT;
    public Mobile()

    {
        setLayout(new GridLayout(0, 1));
        Label Mob = new Label("Mobile Table");
        Label A = new Label("Admin Only");
        Label MName = new Label("Mobile Name");
        mName = new TextField(20);
        Label MOS = new Label("Mobile Operating system");
        mOS = new TextField(20);
        Label Mid = new Label("Mobile ID");
        mid = new TextField(20);
        Label Sid = new Label("Supplier ID");
        sid = new TextField(20);
        Label SName = new Label("Supplier Name");
        sName = new TextField(20);
        Label SDOL = new Label("Date of Lunch");
        sdol = new TextField(20);
        Label SP = new Label("Price");
        sp = new TextField(20);
        Button add = new Button("Add Mobile");
        Button up = new Button("update Mobile");
        Button Rem = new Button("Remove Mobile");
        MT = new TextArea();
        Panel p1 = new Panel();
        p1.add(Mob);
        p1.add(A);
        Panel p2 = new Panel();
        p2.add(MName);
        p2.add(mName);
        Panel p3 = new Panel();
        p3.add(MOS);
        p3.add(mOS);
        Panel p4 = new Panel();
        p4.add(Mid);
        p4.add(mid);
        Panel p5 = new Panel();
        p5.add(Sid);
        p5.add(sid);
        Panel p6 = new Panel();
        p6.add(SName);
        p6.add(sName);
        Panel p7 = new Panel();
        p7.add(SDOL);
        p7.add(sdol);
        Panel p8 = new Panel();
        p8.add(SP);
        p8.add(sp);
        Panel p9 = new Panel();
        p9.add(add);
        p9.add(up);
        p9.add(Rem);

        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
        add(p6);
        add(p7);
        add(p8);
        add(MT);
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