package unit_1;

public class ConditionalOperator {

	public static void main(String[] args) {
		//declare
		int num1, num2, num3;
		boolean result;
		
		//Assign
		num1 = 8;
		num2 = 3;
		
		//Process
		result = (num1 > num2);
		num3 = (result==true)?num1:num2;
		// (true):return num1
		// (false):return num2
		
		//output
		//System.out.println(result);
		System.out.println(num3);
	}

}
