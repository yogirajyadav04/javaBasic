package a2_Operators;

public class A3_comparison_relational {
	public static void main (String [] args)
	{
		//Relational operators
		
		int a=1;
		int b=2;
		
		int c=3;
		
		boolean d=a<b; //1 true
		boolean e=b>c; //2 false
		boolean f=a<=b; //3 true
		boolean g=c>=a; //4 true
		boolean h=a==b; //5 false
		boolean i=c!=a; //6 true
		
		
		System.out.print("1.");
		System.out.println(d);
		
		System.out.print("2.");
		System.out.println(e);
		
		System.out.print("3.");
		System.out.println(f);
		
		System.out.print("4.");
		System.out.println(g);
		
		//System.out.print("5.");
		System.out.println("5."+ h); //see two methods of printing
		
		System.out.print("6.");// No need to define[ String s] to print any thing.
		System.out.println(i);
			
			
	}
}
