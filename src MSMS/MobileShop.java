import java.awt.*;
import java.awt.event.*;

public class MobileShop extends Frame implements ActionListener {

	public void paint(Graphics g) {
		Image img = Toolkit.getDefaultToolkit().getImage("mobileshop.jfif");
		g.drawImage(img, 170, 200, this);
	}

	public static void main(String as[]) {
		MobileShop f = new MobileShop();
		f.setLocation(350, 130);
		f.setVisible(true);
		f.setSize(600, 600);
		f.setTitle("Mobile Shop");
	}

	MenuBar mb;
	Menu Menu;
	MenuItem m1, m2, m3, m4, m5, m6, m7, m8, m9,m10;

	public MobileShop() {
		BorderLayout bl = new BorderLayout();
		setLayout(bl);
		mb = new MenuBar();

		Menu = new Menu("Menu");
		m1 = new MenuItem("Admin");
		m2 = new MenuItem("Employee");
		m3 = new MenuItem("Customer");
		m4 = new MenuItem("Mobile");
		m5 = new MenuItem("Supplier");
		m6 = new MenuItem("Customer Order");
		m7 = new MenuItem("Customer Bill");
		m8 = new MenuItem("Supplier Order");
		m9 = new MenuItem("Supplier Bill");
		m10 = new MenuItem("Login");

		mb.add(Menu);
		Menu.add(m1);
		Menu.add(m2);
		Menu.add(m3);
		Menu.add(m4);
		Menu.add(m5);
		Menu.add(m6);
		Menu.add(m7);
		Menu.add(m8);
		Menu.add(m9);
		Menu.add(m10);
		setMenuBar(mb);
		Menu.addActionListener(this);

	}

	public void actionPerformed(ActionEvent ae) {
		String s = ae.getActionCommand();
		System.out.println(" menu item selected " + s);

		Dialog jd = new Dialog(this);
		jd.setLocation(400, 250);
		jd.setSize(500, 400);
		jd.setVisible(true);

		Admin A= new Admin();
		if (s.equals("Employee")) {
			jd.add(A);
		}
		Employee Emp = new Employee();
		if (s.equals("Employee")) {
			jd.add(Emp);
		}
		Customer C= new Customer();
		if (s.equals("Customer")) {
			jd.add(C);
		}
		Mobile m= new Mobile();
		if (s.equals("Mobile")) {
			jd.add(m);
		}
		Supplier S= new Supplier();
		if (s.equals("Supplier")) {
			jd.add(S);
		}
		Order CO= new Order();
		if (s.equals("Customer Order")) {
			jd.add(CO);
		}
		Bill CB= new Bill();
		if (s.equals("Customer Bill")) {
			jd.add(CB);
		}
		SOrder SO= new SOrder();
		if (s.equals("Supplier Order")) {
			jd.add(SO);
		}
		SBill SB= new SBill();
		if (s.equals("Supplier Bill")) {
			jd.add(SB);
		}
		Login1 L= new Login1();
		if (s.equals("Login")) {
			jd.add(L);
		}

	}

}