package exceptions;


public class ExceptionsTest {
	//Error handling
	public static void main(String[] args) {
		int num1=0;
		double num2;
		
		//Type mismatch: cannot convert from double to int
		
		//Numeric to Numeric - Type Cast
		num1 = (int) 12.25; //double to int cast
		
		num2 = 12.25;		
		//Numeric to String & String to Numeric - Type Conversion		
		//String to double
		//Double.parseDouble(String)
		
		//double to String
		//Double.toString(double)
		
		//Errors		
		//1. Syntax Error - IDE (Integrated Development Environment)		
		//Int num3; //Int cannot be resolved to a type
		int num3;//No Error
		
		//2. Logical Error
		//No Syntax Error; Mistakes in Result
		System.out.println((89+8-2*7/2)); //90
		System.out.println((89-8+2/7*2)); //81 - Correct
		//Debug - Execute Line by Line of Codes
		
		//Stop-point create
		//Start program in debug mode
		//Step-into
		//Step-out
		
		//3. Runtime Error
			//Power Failure
			//Network Failure
			//System Failure
			//Hard-disk full
	}
}
