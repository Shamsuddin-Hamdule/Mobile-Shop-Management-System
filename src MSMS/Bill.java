import java.awt.*;
//import java.sql.*;
import java.awt.event.*;

public class Bill extends Panel implements ActionListener
{
    public static void main(String as[]) {
        Bill f = new Bill();
        f.setVisible(true);
        f.setSize(600, 600);
        //f.setTitle("Bill");
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

    TextField oid,odate,cid,mid,cName,mName,sdol,sp,oq,bamt;
    TextArea OT;
    public Bill()

    {
        setLayout(new GridLayout(0, 1));
        Label ORDER = new Label("Bill Table");
        Label A = new Label("Admin Only");
        Label Oid = new Label("ORDER id");
        oid = new TextField(20);
        Label Odate = new Label("ORDER DATE");
        odate = new TextField(20);
        Label Cid = new Label("Customer ID");
        cid = new TextField(20);
        Label CName = new Label("Customer Name");
        cName = new TextField(20);
        Label Mid = new Label("Mobile ID");
        mid = new TextField(20);
        Label MName = new Label("Mobile Name");
        mName = new TextField(20);
        Label SDOL = new Label("Date of Lunch");
        sdol = new TextField(20);
        Label OQ = new Label("Quantity");
        oq = new TextField(20);
        Label BAMT = new Label("Bill Amount");
        bamt = new TextField(20);
        Button add = new Button("Add");
        Button up = new Button("update");
        Button Rem = new Button("Remove");
        OT = new TextArea();
        Panel p1 = new Panel();
        p1.add(ORDER);
        p1.add(A);
        Panel p2 = new Panel();
        p2.add(Oid);
        p2.add(oid);
        Panel p3 = new Panel();
        p3.add(Odate);
        p3.add(odate);
        Panel p4 = new Panel();
        p4.add(Cid);
        p4.add(cid);
        Panel p5 = new Panel();
        p5.add(CName);
        p5.add(cName);
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
        p12.add(BAMT);
        p12.add(bamt);
        Panel p13 = new Panel();
        p13.add(add);
        p13.add(up);
        p13.add(Rem);

        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
        add(p8);
        add(p9);
        add(p10);
        add(p11);
        add(p12);
        add(p13);
        add(OT);
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
        System.out.println("Successfully Added");
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
    if (str.equals("update"))
        System.out.println("Successfully Updated");
    if (str.equals("Remove"))
        System.out.println("Successfully Removed");}
}