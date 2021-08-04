package unit_2;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		//1. Declare
		int pAmount, ratePerYear, timeYear, interestAmount;

		//2. Input
		System.out.print("Enter Principal Amount : ");
		pAmount = Integer.parseInt(new Scanner(System.in).nextLine());

		System.out.print("Enter Interest Rate/Year : ");
		ratePerYear = Integer.parseInt(new Scanner(System.in).nextLine());

		System.out.print("Enter Time Duration in Year : ");
		timeYear = Integer.parseInt(new Scanner(System.in).nextLine());

		//3. Process
		interestAmount = (pAmount*ratePerYear*timeYear)/100;

		//4. Output
		System.out.println("Interest Amount : "+interestAmount);

	}
}
