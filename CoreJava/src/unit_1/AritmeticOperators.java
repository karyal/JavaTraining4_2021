package unit_1;

import java.util.Scanner;

public class AritmeticOperators {
	public static void main(String[] args) {
		// (+, -, *, /, %, pow, sqrt, ++ (increment), --(decrement))
		/*
		//Read two numbers from user and display sum of them.
		
		//1. Declare Variables
		String str_tmp1, str_tmp2;
		int num1, num2, result;
		double result2, result3;
		
		//2. Input (Prompt for user and accept input)		
		System.out.print("Enter first no : ");//Prompt for user
		str_tmp1 = new Scanner(System.in).nextLine(); //read string from keyboard
				
		System.out.print("Enter second no : ");
		str_tmp2 = new Scanner(System.in).nextLine();				
		//3. Process
		num1 = Integer.parseInt(str_tmp1);//Type Conversion from String to int
		num2 = Integer.parseInt(str_tmp2);//Type Conversion from String to int		
		
		result = num1+num2; //Calculate sum
		result2 = Math.pow(10, 2); //Calculate power
		result3 = Math.sqrt(16); //Calculate SQRT
		
		//4. Output
		System.out.println("SUM : "+result); //print result
		System.out.println("POW : "+result2);
		System.out.println("SQRT : "+result3);		
		*/
		
		//++ (increment), --(decrement)
		int num1 = 1;
		System.out.println(num1);//1
		
		//Post Increment
		num1++; //increase the value by 1 (whole number only) i.e. 2 
		System.out.println(num1);//2
		
		//Pre Increment
		++num1; //increase the value by 1 (whole number only) i.e. 3
		System.out.println(num1);//3
		
		//Post-Increased by 1; Print then Increase i.e. 3
		System.out.println(num1++); 
		
		//Pre-Increased by 1; Increase and then Print i.e.5
		System.out.println(++num1); 
		
		//Increased by 5
		int num2 = 0;
		System.out.println(num2); //0
		num2+=5;
		System.out.println(num2); //5				
	}
}