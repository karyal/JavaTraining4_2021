package unit_1;

public class TypeConversion {

	public static void main(String[] args) {
		//Data Types
		//boolean, byte, char, short, int, long, float, double, String, Object
		//boolean, char, int, double, String
				
		// boolean - true/false
		
		// Whole number - Integer Number (byte, char, short, int, long)
		// Real number - float, double (float, double)
		
		// String - ""
		// Object - any type
		
		//Type Casting and Type Conversion
		
		//Type Casting - Numeric to Numeric
		
		// Widening : byte -> short -> int -> long -> float -> double - Auto Cast		
		/*
		byte bn = 9;
		short sn = bn;
		int in = sn;
		long ln = in;
		float fn = ln;
		double dn = fn;
		System.out.println(dn);
		
		// Narrowing : byte <- short <- int <- long <- float <- double - Type Cast
		dn = 123456789.987456321;
		System.out.println(dn);
		fn = (float) dn;
		System.out.println(fn);
		ln = (long) fn;
		System.out.println(ln);
		in = (int) ln;
		System.out.println(in);
		sn = (short) in;
		System.out.println(sn);
		bn = (byte) sn;
		System.out.println(bn);		
		
		//Type Conversion - Numeric to String/String to Numeric
		bn = 85; //byte - Numeric - Whole number - 8 bits - (-128 to 127)
		
		//Numeric to String		
		//String str1 = bn; //Type mismatch: cannot convert from byte to String
		*/
		
		//byte - basic type - helper class Byte (short - Short, int - Integer)
		/*
		String str1 = Byte.toString(bn); 
		System.out.println(str1);		
		
		
		//String to Numeric		
		str1 = "126";
		bn = Byte.parseByte(str1); //Type mismatch: cannot convert from String to byte
		System.out.println(bn);
		*/
		
		//Boolean 
		/*
		//String to boolean
		String str2 = "true";
		boolean res2 = Boolean.parseBoolean(str2); //Type mismatch: cannot convert from String to boolean
		System.out.println(res2);
		
		//Boolean to String
		res2 = false;
		str2 = Boolean.toString(res2);
		System.out.println(str2);
		
		//Boolean to int
		//int in2 = Integer.parseInt(res2); //Type mismatch: cannot convert from boolean to int
		*/
		
		//Character
		//Character to Boolean [x]
		//Boolean to Character [x]
		//Character to Byte
		
		/*
		char ch2 ='A';
		int int2 = ch2;
		System.out.println(ch2); // A  : Character Value 
		System.out.println(int2); // 65 : ASCII Value of A
		
		int2 = 102;
		ch2 = (char) int2; // Integer cast to char
		System.out.println(ch2); // A  : Character Value 
		System.out.println(int2); // 65 : ASCII Value of A
		*/
	}

}
