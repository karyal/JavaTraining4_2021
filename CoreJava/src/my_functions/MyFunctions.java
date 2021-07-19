package my_functions;

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
		return Integer.parseInt(new Scanner(System.in).nextLine());
	}

}
