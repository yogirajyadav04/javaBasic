package b3_pune;

import b2_mumbai.dadar;

public class katraj extends dadar{
	
	public static void main(String[] args) {
	
		
 /*//******** static variable calling with access specifier out side the package******
		
		System.out.println(dadar.a);
		//System.out.println(dadar.b);// can not call default access specifier out side the package.
		//System.out.println(dadar.c);// can not call private access specifier out side the package
		System.out.println(dadar.d);  // can call only after using (import mumbai.dadar & extend dadar) at top. this is inheritance case
	*/
		
		//   ********* non static variable calling with access specifier ************
	     
	      dadar x=new dadar();    // non static public variable calling by object
		System.out.println(x.a);
		
	////  dadar y = new dadar();    // non static default variable calling by object.can not call out side the package
	////	System.out.println(x.b);       

 ////  dadar z=new dadar();  // non static private variable calling by object,but as per rule we can not call it in another class
  ////  System.out.println(z.c);
	   
		 dadar k=new dadar();  //  non static protected variable calling by object,no need of extend key word at start for same pakage.
	//   System.out.println(k.d);
	   
	//   *****************************************************************************
	
	}
	
	
}
