package unit_2;

public class CUITestV3 {

	public static void main(String[] args) {
		// 1. Declare
		int tmp1, tmp2, choice;
		BasicIO bio;
		Calculator calc;
		bio = new BasicIO();
		
		do {
			// 2. Input
			bio.printMenu();
			bio.printMessage("Enter your choice : ");
			choice = bio.readInt();
			bio.printMessage("----------------------------------");
			bio.newLine();			
			
			// 3. Process			
			if (choice == 1) {
				bio.printMessage("Enter first no : ");
				tmp1 = bio.readInt();
				bio.printMessage("Enter second no : ");
				tmp2 = bio.readInt();
				calc = new Calculator(tmp1, tmp2); // Initialize
				calc.sum();
				bio.printMessage("SUM", calc.getNum3());
			} else if (choice == 2) {
				bio.printMessage("Enter first no : ");
				tmp1 = bio.readInt();
				bio.printMessage("Enter second no : ");
				tmp2 = bio.readInt();
				calc = new Calculator(tmp1, tmp2); // Initialize
				calc.sub();
				bio.printMessage("SUB", calc.getNum3());
			} else if (choice == 3) {
				bio.printMessage("Enter first no : ");
				tmp1 = bio.readInt();
				bio.printMessage("Enter second no : ");
				tmp2 = bio.readInt();
				calc = new Calculator(tmp1, tmp2); // Initialize
				calc.prd();
				bio.printMessage("PRD", calc.getNum3());
			} else if (choice == 4) {
				bio.printMessage("Enter first no : ");
				tmp1 = bio.readInt();
				bio.printMessage("Enter second no : ");
				tmp2 = bio.readInt();
				calc = new Calculator(tmp1, tmp2); // Initialize
				calc.div();
				bio.printMessage("DIV", calc.getNum3());
			} else if (choice == 0) {
				bio.printMessage("Bye!");
				System.exit(0);
			}	
			// 4. Output
			// bio.printMessage("SUM", calc.getNum3());
			bio.printMessage("----------------------------------");
			bio.newLine();
		} while (choice != 0);
	}
}
