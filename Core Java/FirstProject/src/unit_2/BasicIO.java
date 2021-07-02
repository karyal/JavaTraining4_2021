package unit_2;

import java.util.Scanner;

public class BasicIO {
	
	//Reading String from Keyboard
	public String readString() {
		return new Scanner(System.in).nextLine();
	}
	
	//Reading String from Keyboard and Convert to Integer 
	public int readInt() {
		return Integer.parseInt(readString());
	}
	
	public void printMessage(String label) {
		System.out.print(label);
	}
	
	public void printMessage(String label, int num) {
		System.out.println(label+" : "+num);
	}
	
	public void newLine() {
		System.out.println();
	}
	
	void printMenu() {
		System.out.println("----------------------------------"); 
		System.out.println("Main Menu"); 
		System.out.println("----------------------------------");
		System.out.println("1. ADD");
		System.out.println("2. SUB");
		System.out.println("3. PRD");
		System.out.println("4. DIV");
		System.out.println("0. EXIT");
		System.out.println("----------------------------------");
	}
}