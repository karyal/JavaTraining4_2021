package unit_2;

public class CUITestV2 {

	public static void main(String[] args) {
		//1. Declare
		int tmp1, tmp2, choice;
		BasicIO bio;
		Calculator calc;		
		bio=new BasicIO();		
		//2. Input		
		bio.printMenu();
		bio.printMessage("Enter your choice : ");
		choice = bio.readInt();
		bio.printMessage("----------------------------------");
		bio.newLine();
		
		bio.printMessage("Enter first no : ");
		tmp1= bio.readInt();
		
		bio.printMessage("Enter second no : ");
		tmp2= bio.readInt();

		//3. Process
		calc= new Calculator(tmp1, tmp2); //Initialize
		if(choice==1) {
			calc.sum();
			bio.printMessage("SUM", calc.getNum3());
		}
		else if(choice==2) {
			calc.sub();
			bio.printMessage("SUB", calc.getNum3());
		}
		else if(choice==3) {
			calc.prd();
			bio.printMessage("PRD", calc.getNum3());
		}
		else if(choice==4) {
			calc.div();
			bio.printMessage("DIV", calc.getNum3());
		}
		else if(choice==0) {
			System.exit(0);;
		}
		
		//4. Output
		//bio.printMessage("SUM", calc.getNum3());		
		bio.printMessage("----------------------------------");
		bio.newLine();
	}
}
