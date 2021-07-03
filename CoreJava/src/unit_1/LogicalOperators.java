package unit_1;

public class LogicalOperators {

	public static void main(String[] args) {
		// && AND, || OR , ! NOT
		//Truth table of AND
		//Truth table of OR
		
		//1. Declare
		int num1, num2, num3;
		boolean result1, result2, result3;
		
		//2. Input
		num1 = 8;
		num2 = 8;
		num3 = 8;
				
		//3. Process
		result1 = (num1 == num2) && (num1 == num3); // AND
		result2 = (num1 == num2) || (num1 == num3); // OR		
		result3 = ! result1; //Reverse the result //NOT
		
		//4. Output
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}