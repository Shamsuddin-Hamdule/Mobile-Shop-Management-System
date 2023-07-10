import java.awt.*;
import java.awt.event.*;
class Login1 extends Panel implements ActionListener
{
public static void main(String as[])
{
Login1 f=new Login1();
f.setSize(300,250);
f.setVisible(true);
}
TextField t1,t2;
public Login1()
{
GridLayout gl=new GridLayout(3,2);
setLayout(gl);
Label l1=new Label("User Name");
Label l2=new Label("Password");
t1=new TextField(25);
t2=new TextField(25);
Button b1=new Button("OK");
Button b2=new Button("CANCEL");
add(l1);add(t1);
add(l2);add(t2);
add(b1);add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String s=ae.getActionCommand();
System.out.println("bt pressed is "+s);
if(s.equals("OK"))
{
String s1=t1.getText();
String s2=t2.getText();
System.out.println("USER Name is "+s1+"\n Password is "+s2);
}
if(s.equals("CANCEl"))
{
t1.setText("");
t2.setText("");
}
}
}
