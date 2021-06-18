package unit_1;

//Step: 1 //Import Library
import java.util.Scanner; //java - package , util-> package, Scanner-> Class

public class BasicIOTest {

	public static void main(String[] args) {
		//Input
		//Step : 2
		
		System.out.print("Enter String 1 : "); //Prompt for User
		// Read String from Keyboard and Return
		String str_1 = new Scanner(System.in).nextLine();
		
		System.out.print("Enter String 2 : "); //Prompt for User
		String str_2 = new Scanner(System.in).nextLine();

		System.out.println(str_1+" "+str_2);
		
		//System.out.println("Reading Value : "+str0);		
		//A, true, 10, 10.23, "Kathmandu"
		
		
		
		
		
		
		
		
		
		
		/*
		//Output		
		//Output - String Output
		System.out.println("Hello world of Java");//Print and Line Break
		System.out.print("Hi?");//Only Print
		System.out.print("How are you?");//Only Print
		System.out.println(); //Line Break
		
		//String output
		String str1 = "Value : ";
		System.out.println(str1);
		
		//boolean output
		boolean res1 = false;
		System.out.println(res1);
		
		//int output
		int in1 = 8547;
		System.out.println(in1);
		
		//double output
		double dn1 = 456.123;
		System.out.println(dn1);
		
		//char output
		char ch1 = 'v';
		System.out.println(ch1);
		
		//Mixed Output
		// System.out.println(str1res1); [X]
		//System.out.println(str1, res1); [X]
		System.out.println(str1+res1); //Concat
		System.out.println(str1+in1); //Concat
		System.out.println(str1+dn1); //Concat
		System.out.println(str1+ch1); //Concat		
		System.out.println(str1+res1+in1); //Concat //Value : false8547
		System.out.println(str1+res1+" "+in1); //Concat //Value : false 8547
		*/
		
	}

}
