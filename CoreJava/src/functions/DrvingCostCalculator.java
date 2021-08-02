package functions;
import java.util.Scanner;

public class DrvingCostCalculator {
	
	public static void main(String []args) {
		// 1. declare variable
        double milesDrivenPerday, perGallonCost, perDayPakingFee;
        double tollPerDay, totalCostInMiles, totalExpenses;
        
		// 2 input
        System.out.print("Enter perday miles : ");//prompt for user
        milesDrivenPerday = Double.parseDouble(new Scanner(System.in).nextLine());//reading value
        
        System.out.print("Enter per gallon cost : ");
        perGallonCost = Double.parseDouble(new Scanner(System.in).nextLine());
        
        System.out.print("Enter your parking fee : ");
        perDayPakingFee = Double.parseDouble(new Scanner(System.in).nextLine());
        
        System.out.print("Enter your toll fee per day : ");
        tollPerDay = Double.parseDouble(new Scanner(System.in).nextLine());

        //3. process  //%.2f, totalExpenses
        //totalCostInMiles = milesDrivenPerday / perGallonCost;
        
        totalCostInMiles = calculateTotalCostInMiles(milesDrivenPerday, perGallonCost);
        totalExpenses = calculateTotalExpenses(totalCostInMiles, perDayPakingFee, tollPerDay);
        
        //4. Output
        System.out.println("Total cost for in perday miles : " + totalCostInMiles);
        System.out.printf("Your total expenses per day of your car :  " +  totalExpenses);
	}
	
	public static double calculateTotalCostInMiles(double var1, double var2) {
		//receive value(s)
		//process values
		double var3 = var1/var2;
		//return result
		return var3;
	}
	
	public static double calculateTotalExpenses(double var1, double var2, double var3) {
		double var4 = var1+var2+var3;
		return var4;
	}
}
