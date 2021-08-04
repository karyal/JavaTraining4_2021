package unit_1_task;

public class MyCalculator {

	public static void main(String[] args) {		
		//Declare
		byte choice=-1;				
		int num1, num2, num3;
		
		MyFunctions.printMenu();//Print Main Menu
		choice = MyFunctions.readChoice();//Accept Menu Option
		
		if(choice == 1) {
			//Sum
			num1 = MyFunctions.readNumber("Enter first no : ");
			num2 = MyFunctions.readNumber("Enter first no : ");
			num3 = MyFunctions.calcSum(num1, num2);
			MyFunctions.printResult("SUM", num3);
		}
		else if(choice == 2) {
			//Diff
			num1 = MyFunctions.readNumber("Enter first no : ");
			num2 = MyFunctions.readNumber("Enter first no : ");
			num3 = MyFunctions.calcSub(num1, num2);
			MyFunctions.printResult("DIFF", num3);
		}
		else if(choice == 3) {
			//Prd
			num1 = MyFunctions.readNumber("Enter first no : ");
			num2 = MyFunctions.readNumber("Enter first no : ");
			num3 = MyFunctions.calcPrd(num1, num2);
			MyFunctions.printResult("PRD", num3);
		}
		else if(choice == 0) {
			//Exit
			MyFunctions.exit();			
		}
	}
}
