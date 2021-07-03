package unit_1;

public class AssignmentOperators {

	public static void main(String[] args) {
		//Assignment Operator [ = ]
		//Assign -> Transfer (Store) right value to left variable

		//a. Simple Assignment Operator [ = ] 
		// result = num1 + num2; // sum of num1 and num2 assigned to result
		// num1 = 8; //8 assign to num1		
		/*
		int num1, num2, result; //Decalre
		num1 = 5; //Assign
		num2 = 6; //Assign
		result = num1 * num2; // Calc Product and Assign
		*/
		
		//b. Multiple Assignment Operator [ = = = ]
		/*
		int num1, num2, num3; //Declare
		//Multiple Assignment Operator | 
		// 5 Assign to num3; value of num3 assign to num2 and 
		// num2 assign to num1
		
		num1 = num2 = num3 = 5; 
		// num1 = 5;
		// num2 = 5; 
		// num3 = 5;
		*/
		
		//c. Short-hand Assignment Operator [ +=, -=, *=, /=, %= ]
		int num1 = 6;
		num1 +=4; //num1 = num1 + 4 //right to left
		System.out.println(num1);
		
		

	}

}
