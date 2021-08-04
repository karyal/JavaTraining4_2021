package unit_1;

import java.util.Scanner;

public class RelationalOperators {
	public static void main(String[] args) {
		// Relational Operators
		// == Equals to
		// != Not equals to
		// > Greater than
		// < Less than		
		// >= Greater than or equals to
		// <= Less than or equals to
		
		//1. Declare
		int num1, num2;
		boolean result;
		
		//2. Input
		//num1 = 9;
		//num2 = 9;
		
		System.out.print("Enter first no : ");
		num1 = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.print("Enter second no : ");
		num2 = Integer.parseInt(new Scanner(System.in).nextLine());
		
		//3. Process
		
		//result of (num1 is equals to num2) assign to result 
		//result = (num1 == num2);
		// result = (num1 != num2);
		// result = (num1 > num2);
		// result = (num1 < num2);
		
		//num1 is greater than or equals to num2
		//result = (num1 >= num2);
		
		//num1 is less than or equals to num2
		result = (num1 <= num2);
		
		//4. Output
		System.out.println(result);
		
		//String, and Object
		//System.out.println("ABC" == "abc");		
		//System.out.println("ABC".equals("ABC"));
		
		Object obj1 = 56;
		Object obj2 = 56;
		
		String str1 ="ABC";
		String str2 ="ABC";
		
		System.out.println(obj1.equals(obj2));
		System.out.println(str1.equals(str2));
	}
}
