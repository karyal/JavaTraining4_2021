package unit_1;

public class NonStaticGlobalVarible {
	int MAX=9;
	
	public NonStaticGlobalVarible() {
		System.out.println(MAX);
	}
	
	public void f1() {
		System.out.println(MAX);
	}
	
	public static void main(String[] args) {
		//System.out.println(MAX); //Cannot make a static reference to the non-static field MAX
		//f1(); //Cannot make a static reference to the non-static method f1() from the type NonStaticGlobalVarible
		new NonStaticGlobalVarible().f1();
		new NonStaticGlobalVarible();
	}
}
