package unit_1.enum_test;

import javax.swing.JFrame;//Library Class

public class MainWindow {
	JFrame frame;//Declare an Object
	
	public MainWindow() {
		frame = new JFrame();//Initialize an Object
		frame.setTitle("First Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 350);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainWindow();
	}
}
