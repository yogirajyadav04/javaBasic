package a2_Operators;

public class A2_logical {
public static void main (String[]args)

    {
	   int a=80;// math marks
	   int b=79;// science marks
	   
	   int c=80;// conditional marks (minimum required for bike)
	   
	   boolean d=a>=c;
	   boolean e=b>=c;
	   
	  // System.out.println(d);
	 //  System.out.println(e);
    
       boolean l = d&&e;
   
       boolean m= d||e;
       
      // boolean n= d!e; // need other example for "not ! symbol"
    
         System.out.println(l);
         System.out.println(m);
        // System.out.println(n);
    
    
    
    }
}
