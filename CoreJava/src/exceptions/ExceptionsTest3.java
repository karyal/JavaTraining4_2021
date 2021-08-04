package exceptions;

public class ExceptionsTest3 {
	public static void main(String[] args) {
		//Runtime Error
		int num1, num2, num3;//declare		
		try {
			num1 = 10;
			num2 = 0;
			num3 = num1/num2;
			System.out.println("Result : "+num3);
		}
		catch(Exception ex) {
			System.out.println("Error: "+ex.getMessage());
		}
		finally {
			System.out.println("Bye!");
		}
	}
}
