package functions;

import java.util.Scanner;

public class MyFunctions {
	
	public static void printMessage(String userMessage){
		System.out.print(userMessage);
	}
	
	public static void printMessage(String userMessage, int value){
		System.out.println(userMessage+" "+ value);
	}
	
	public static int calculateInterest(int pAmount, int ratePerYear, int timeYear){
		int interestAmount = (pAmount*ratePerYear*timeYear)/100;
		return (interestAmount);
	}
	
	public static int readInteger() {
		int num1=0;
		try {
			num1 = Integer.parseInt(new Scanner(System.in).nextLine());
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return num1;
	}

}
