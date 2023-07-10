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
	MenuItem m1, m2, m3, m4, m5, m6, m7, m8, m9;

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
		setMenuBar(mb);
		Menu.addActionListener(this);

	}

	public void actionPerformed(ActionEvent ae) {
		String s = ae.getActionCommand();
		System.out.println(" menu item selected " + s);

		// Runtime rs = Runtime.getRuntime();
		// try {
		// rs.exec("Admin.class",null);
		// System.out.println("Admin.class opening.");
		// }catch(Exception e){ System.out.println(e);}

		Dialog jd = new Dialog(this);
		jd.setLocation(100, 450);
		jd.setSize(300, 300);
		Admin ta = new Admin();
		if (s.equals("Admin")) {
			jd.add(ta);
		}
		jd.setVisible(true);

	}

}