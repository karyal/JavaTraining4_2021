package unit_1;

import java.util.Scanner;

public class AritmeticOperators {
	public static void main(String[] args) {
		//Read two numbers from user and display sum of them.
		//1. Declare Variables
		String str_tmp;
		int num1, num2, result;
		
		//2. Input (Prompt for user and accept input)		
		System.out.print("Enter first no : ");
		str_tmp = new Scanner(System.in).nextLine();
		num1 = Integer.parseInt(str_tmp);//Type Conversion from String to int
		
		System.out.print("Enter second no : ");
		str_tmp = new Scanner(System.in).nextLine();
		num2 = Integer.parseInt(str_tmp);//Type Conversion from String to int
		
		//3. Process
		result = num1+num2;
		
		//4. Output
		System.out.println("SUM : "+result);		
	}
}