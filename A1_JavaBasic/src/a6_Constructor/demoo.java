package a6_Constructor;

public class demoo {
	
	// constructor overloading
	
		demoo ()// 1st constructor
		{
			System.out.println("mummy");
		}
		
		demoo (int f)// 2nd st constructor
		{
			System.out.println("papa");
		}
		
		demoo (int h,char a)// 3rd st constructor...No. of constructor can be call
		{
			System.out.println("sonu");
		}
		
		
		public static void main(String[]args)
		{
			new demoo ();
			new demoo (1);
			new demoo (2, '@');
		}
	
		

}
