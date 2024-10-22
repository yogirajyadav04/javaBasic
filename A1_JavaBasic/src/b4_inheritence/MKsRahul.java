package b4_inheritence;

public class MKsRahul {
	public static void main(String[] args) {
		
		// normal call
		
		System.out.println(Manik.a);
		
		Manik x=new Manik();
	     System.out.println(x.b);
		
		
		//inheritance call
	 
		System.out.println(MKrushna.a);// static calling
		
		MKrushna y=new MKrushna();// non static call
		System.out.println(y.b);
		System.out.println(y.c);
	    System.out.println(y.d);
	}

}
