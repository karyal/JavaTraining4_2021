package unit_2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class GUITestV2 implements ActionListener{
	//https://docs.oracle.com/javase/tutorial/uiswing/
	//https://www.guru99.com/java-swing-gui.html
	
	JFrame frame;
	JLabel lbl_1, lbl_2, lbl_3;
	JTextField txt_1, txt_2;
	JButton btn_add;
	
	public GUITestV2() {
		frame=new JFrame();
		frame.setSize(250, 150);
		frame.setTitle("Simple Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		lbl_1 = new JLabel("First No : ");
		lbl_2 = new JLabel("Second No : ");
		lbl_3 = new JLabel("Result: ");
		
		txt_1 = new JTextField(10);
		txt_2 = new JTextField(10);
		
		btn_add = new JButton("ADD");
		btn_add.addActionListener(this);
		
		frame.add(lbl_1);		
		frame.add(txt_1);
		frame.add(lbl_2);		
		frame.add(txt_2);
		frame.add(btn_add);
		frame.add(lbl_3);
		
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new GUITestV2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn_add) {
			int n1, n2;
			Calculator calc;
			n1=Integer.parseInt(txt_1.getText());
			n2=Integer.parseInt(txt_2.getText());
			calc=new Calculator(n1, n2);
			calc.sum();
			lbl_3.setText(Integer.toString(calc.getNum3()));
		}
	}
}