package a5_Methods;

public class A3_user_define_ex3 {
	

	static int add(int a, int b)
	{
		int c= a+b;   // this program is for addition of 4 numbers(5,6,7,8)
		return c;
	}
	
	public static void main(String[]args)
	{
		int result = add(5,6);
		
		result = add(result,7);
		
		result = add(result,8);
		
		System.out.println(result);
	}

}
