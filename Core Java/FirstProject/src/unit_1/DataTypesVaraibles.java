package unit_1;

public class DataTypesVaraibles {
	
	//global variable
	static boolean globalRes=true; //Cannot make a static reference to the non-static field globalRes
	
	public static void main(String[] args) {
		//Data Types
		/*
		a. boolean
		b. byte
		c. short
		d. int
		e. long
		f. float
		g. double
		h. char
		i. string
		 */
		
		//a. boolean true/false
		/*
		boolean res = true; //store
		System.out.println(res);//true
		res = false;//store
		System.out.println(res);//false
		
		
		boolean res;
		res=true;
		System.out.println(res);//true
		res=false;
		System.out.println(res);//false				
		*/

		//b. byte
		/*
		byte bn;	// Declare
		bn = 15; 	// Assign - Store
		System.out.println(bn);//Access
		bn = 8; 	// Update value
		System.out.println(bn);//Access		
		
		//Helper Class
		//Byte		
		//bn = 123456789; 	// Range - Min to Max
		System.out.println(bn);
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		
		//-128 to 127
		bn = -129;
		bn = -128;
		bn = -127;
		bn = -1;
		bn = 0;
		bn = 125;
		bn = 126;
		bn = 127;
		bn = 128;
		
		//58+89
		 */
		
		//c. short
		/*
		short sn;
		System.out.println(Short.MIN_VALUE); //-32768
		System.out.println(Short.MAX_VALUE); //32767
		
		byte bn1 = 58; //byte
		byte bn2 = 89; //byte
		short sn1 = (short) (bn1 + bn2); //byte to short | first sum and convert to short
		System.out.println(sn1);
		*/
		
		//d. int default to whole number calculation
		/*
		System.out.println(Integer.MIN_VALUE); //-2147483648
		System.out.println(Integer.MAX_VALUE); //2147483647
		
		short sn1 = 32758;
		short sn2 = 32755;
		//short sn3 = (sn1+sn2);
		int in1 = (int)(sn1+sn2);
		System.out.println(in1);
		*/
		
		//e. long
		/*
		System.out.println(Long.MIN_VALUE); //-9223372036854775808
		System.out.println(Long.MAX_VALUE); //9223372036854775807
		int in1 = 327588547;
		int in2 = 327588547;
		long ln1 = (long)(in1*in2);
		System.out.println(ln1);
		
		//long ln2 = 45745745714575; //The literal 45745745714575 of type int is out of range 
		long ln2 = 45745745714575L;
		long ln3 = 45745745714575l;
		
		//user given value - int
		//calculated value - long				
		*/
		
		//f. float
		/*
		System.out.println(Float.MIN_VALUE); //1.4E-45
		System.out.println(Float.MAX_VALUE); //3.4028235E38
		
		float fn1 = 123.25478F;
		float fn2 = 123.25478f;
		double dn1 = (double)(fn1*fn2);
		System.out.println(dn1);
		*/
		
		//g. double default to decimal calculation
		/*
		System.out.println(Double.MIN_VALUE); //4.9E-324
		System.out.println(Double.MAX_VALUE); //1.7976931348623157E308
		*/
		
		//h. char single character with ''
		/*
		char ch = 'H';
		System.out.println(ch);
		ch = 'a';
		System.out.println(ch);
		ch = '1';
		System.out.println(ch);		
		*/
		
		//i. string
		/*
		String str1; //decalre
		str1 = "Accessing Global Variable"; //Assign
		System.out.println(str1); //Access
		*/
		
		//j. Object
		Object obj1  = true; //boolean
		System.out.println(obj1); //Access
		
		obj1  = 12; //byte
		System.out.println(obj1); //Access
		
		obj1  = 148; //short
		System.out.println(obj1); //Access
		
		obj1  = 45678947; //int
		System.out.println(obj1); //Access
				
		obj1  = 45678947355L; //long
		System.out.println(obj1); //Access
		
		obj1  = 45678947355.3555f; //float
		System.out.println(obj1); //Access
		
		obj1  = 45678947355.2514; //double
		System.out.println(obj1); //Access
		
		obj1  = 'b'; //char
		System.out.println(obj1); //Access
		
		obj1  = "Variables and Data Types"; //String
		System.out.println(obj1); //Access
		
		Object obj2 = obj1;
		System.out.println(obj2); //Access
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		/*
		//Accessing Global Variable
		globalRes = true; // true
		System.out.println(globalRes);//true
		globalRes = false; // false
		System.out.println(globalRes);//false
		
		*/
	}
}