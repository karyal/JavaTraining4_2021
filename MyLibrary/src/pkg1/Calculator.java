package pkg1;

public class Calculator {
	//Instance Variables | Data Members
	int num1; //User input
	int num2; //User input
	int num3; //Result
	
	//Constructors | to initialize an object
	//Default  Constructor
	public Calculator() {
		this.num1=0;
		this.num2=0;
		this.num3=0;
	}
	//Parameterized Constructor
	public Calculator(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
		this.num3=0;
	}
	//Copy Constructor
	public Calculator(Calculator calc) {
		this.num1=calc.num1;
		this.num2=calc.num2;
		this.num3=calc.num3;
	}
	
	//Getters and Setters	
	//Getters
	public int getNum1() {
		return this.num1;
	}
	public int getNum2() {
		return this.num2;
	}
	public int getNum3() {
		return this.num3;
	}
	
	//Setters
	public void setNum1(int num1) {
		this.num1=num1;
	}
	public void setNum2(int num2) {
		this.num2=num2;
	}
	public void setNum3(int num3) {
		this.num3=num3;
	}
	
	//toString
	@Override
	public String toString() {
		return this.num1+", "+this.num2+", "+this.num3;
	}
	
	//Methods -  Processing functions
	public void sum() {
		this.num3=this.num1+this.num2;
	}
	public void sub() {
		this.num3=this.num1-this.num2;
	}
	public void prd() {
		this.num3=this.num1*this.num2;
	}
	public void div() {
		this.num3=this.num1/this.num2;
	}
}