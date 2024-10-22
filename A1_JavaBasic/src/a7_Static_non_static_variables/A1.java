package a7_Static_non_static_variables;

public class A1 {
	
	static int a=12;
	       int b=15;
	       
	public static void main(String args[])
	{
	     // System.out.println(A1.a);// static variable calling....... method 1
	     // System.out.println(a);// static variable calling.......... method 2
	      
	      
		      A1 x= new A1();    // non static variable calling method both line
		System.out.println(x.b);	
		
		
		
  }

}
