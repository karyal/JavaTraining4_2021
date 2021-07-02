package unit_2;

public class CUITest {

	public static void main(String[] args) {
		//1. Declare
		int tmp1, tmp2;
		BasicIO bio;
		Calculator calc;
		
		//2. Input		
		bio=new BasicIO();
		bio.printMessage("Enter first no");
		tmp1= bio.readInt();
		
		bio.printMessage("Enter second no");
		tmp2= bio.readInt();
						
		//3. Process
		calc= new Calculator(tmp1, tmp2); //Initialize		
		calc.sum();
		
		//4. Output
		bio.printMessage("SUM", calc.getNum3());
	}
}
