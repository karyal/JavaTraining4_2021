package arrays_basics;

public class ArrayTest {

	public static void main(String[] args) {
		//General Variable
		int num1=0; //declare and initialize - store
		//num1 = 9; //update (change) | replace - store
		//System.out.println(num1);
		
		//Array variable
		//variable which can holds multiple values
		final int MAX = 3; //read only - constant		
		int nums[]; //array declare
		
		char chars[]; //Character Array
		String names[];
		Object objs[];
		Person persons[];
		
		int nums2[] = {3, 4, 1, 2, 7,4,5,5,6,7,78,8,8,8,4,2,3,4,5,6,7,8,9,0,6,4,5,7,8,2, 7,4,5,5,6,7,78,8,8,8,4,2,3,4,5,6,7,8,9,0,6,4,3, 4, 1, 2, 7,4,5,5,6,7,78,8,8,8,4,2,3,4,5,6,7,8,9,0,6,4,5,7,8,2, 7,4,5,5,6,7,78,8,8,8,4,2,3,4,5,6,7,8,9,0,6,4}; //Array Declare and Initialize
		
		try {
			nums=new int[MAX];//initialize
			//nums[0], nums[1], nums[2]
			
			//0-2
			//index of array always start from 0 to MAX-1
			//assign values
			nums[0]=4;
			nums[1]=9;
			nums[2]=7;
			
			//nums[-1]=3;//Index -1 out of bounds for length 3
			//nums[3]=9; //Index 3 out of bounds for length 3
			//System.out.println(nums[0]);
			//System.out.println(nums[1]);
			//System.out.println(nums[2]);
			
			//nums - variable
			//[0] - index value
			//4 - value to store
			
			//Char Array
			chars = new char[MAX];
			chars[0]='A';
			chars[1]='z';
			chars[2]='m';
			
			//String Array
			names=new String[MAX];
			names[0]="Raj Rai";
			names[1]="Rosy Thapa";
			names[2]="ABC";
			
			//Object Array
			objs = new Object[MAX];
			objs[0]=num1;
			objs[1]=nums;
			objs[2]=chars;
			
			//Object Array
			persons = new Person[MAX];
			Person p1 = new Person(1,"Raj");
			Person p2 = new Person(2,"Kiran");
			persons[0]=p1;
			persons[1]=p2;
			persons[2]=new Person(3, "Keshor");	
			
			//length of an array
			System.out.println(persons.length);
			System.out.println(nums2.length);
			
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}		
	}
}
