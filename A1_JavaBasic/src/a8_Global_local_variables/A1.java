package a8_Global_local_variables;

public class A1 {

	
	int x=9;//global variable
	
	public void test() {
		int y=8;//local variable
		System.out.println("local:"+y);
	}
	
	public static void main(String[] args) {
		
		A1 obj=new A1();
		
		System.out.println("golobal:"+obj.x);
		obj.test();
	}
	
	
	
}
