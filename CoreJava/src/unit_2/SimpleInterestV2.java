package unit_2;
import java.util.Scanner;

import functions.MyFunctions;

public class SimpleInterestV2 {

	public static void main(String[] args) {
		//1. Declare
		int pAmount, ratePerYear, timeYear, interestAmount;

		//2. Input
		MyFunctions.printMessage("Enter Principal Amount : ");
		pAmount = MyFunctions.readInteger();

		MyFunctions.printMessage("Enter Interest Rate/Year : ");
		ratePerYear = MyFunctions.readInteger();

		MyFunctions.printMessage("Enter Time Duration in Year : ");
		timeYear = MyFunctions.readInteger();

		//3. Process
		interestAmount = MyFunctions.calculateInterest(pAmount, ratePerYear, timeYear);

		//4. Output
		MyFunctions.printMessage("Interest Amount : ", interestAmount);
	}
}