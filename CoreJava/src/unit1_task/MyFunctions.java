package unit1_task;

import java.util.Scanner;

public class MyFunctions {
	
	static void printMenu() {
		System.out.println("----------------------------------"); 
		System.out.println("Main Menu"); 
		System.out.println("----------------------------------");
		System.out.println("1. ADD");
		System.out.println("2. SUB");
		System.out.println("3. PRD");
		System.out.println("0. EXIT");
		System.out.println("----------------------------------");
	}
	
	static byte readChoice() {
		byte tmpChoice;		
		System.out.print("Enter your choice : _ ");
		tmpChoice = Byte.parseByte(new Scanner(System.in).nextLine());
		System.out.println("----------------------------------");
		return tmpChoice;
	}	
	
	static int readNumber(String strMessage) {
		int tmpChoice;		
		System.out.print(strMessage);
		tmpChoice = Integer.parseInt(new Scanner(System.in).nextLine());
		return tmpChoice; 
	}
	
	static int calcSum(int num1, int num2) {
		return (num1+num2);
	}
	static int calcSub(int num1, int num2) {
		return (num1-num2);
	}
	static int calcPrd(int num1, int num2) {
		return (num1*num2);
	}
	static void exit() {
		System.out.println("Bye !");
		System.exit(0);
	}
	static void printResult(String strLabel, int result) {
		System.out.println(strLabel+" "+result);
	}
}
