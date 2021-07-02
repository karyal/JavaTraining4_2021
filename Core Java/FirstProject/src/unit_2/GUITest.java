package unit_2;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class GUITest {

	JFrame frame;
	JLabel lbl_1, lbl_2, lbl_3;
	JTextField txt_1, txt_2;
	JButton btn_add;
	
	public GUITest() {
		frame=new JFrame();
		frame.setSize(250, 350);
		frame.setTitle("Simple Calculator");
		frame.setLayout(new FlowLayout());
		
		lbl_1 = new JLabel("First No : ");
		lbl_2 = new JLabel("Second No : ");
		lbl_3 = new JLabel("Result: ");
		
		txt_1 = new JTextField(10);
		txt_2 = new JTextField(10);
		btn_add = new JButton("ADD");
		
		frame.add(lbl_1);		
		frame.add(txt_1);
		frame.add(lbl_2);		
		frame.add(txt_2);
		frame.add(btn_add);
		frame.add(lbl_3);
		
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new GUITest();
	}
}