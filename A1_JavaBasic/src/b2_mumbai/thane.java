package b2_mumbai;

public class thane {
	public static void main(String[] args) {
	
		
	/*	*********  static variable calling with access specifier within same package ************
		
		System.out.println(dadar.a);
		System.out.println(dadar.b);
   ////System.out.println(dadar.c); private can not call in another class.
		System.out.println(dadar.d);
	
	//   ************************************************************************
	*/	
		

	/*   ********* non static variable calling with access specifier ************
	     
	      dadar x=new dadar();    // non static public variable calling by object
		System.out.println(x.a);
		
		dadar y = new dadar();    // non static default variable calling by object
		System.out.println(x.b);       
  
   ////  dadar z=new dadar();  // non static private variable calling by object,but as per rule we can not call it in another class
    ////  System.out.println(z.c);
	   
		 dadar k=new dadar();  //  non static protected variable calling by object,no need of extend key word at start for same pakage.
	   System.out.println(k.d);
	   
	//   *****************************************************************************
	*/
		
		
  /*  //  *********  static method calling with access specifier *********************
		
		dadar.demo();
		
		dadar.demo1();
		
////	dadar.demo2(); // private method can not call in another class.
	 
	    dadar.demo3();
	 
	 
  //   *****************************************************************************
	*/ 
	
	/*	
	//  ********* non static method calling with access specifier *********************
		
		      dadar x= new dadar();
			        x.demo();
			
			  dadar y=new dadar();
			        y.demo1();
			        
	////	  dadar z=new dadar();// private method can not call in another class.
	////            z.demo2();
			        
			  dadar z1=new dadar();
			        z1.demo3();
			        
		 
	  //   *****************************************************************************
    */  
		
 /* //  *********  constructor calling with access specifier *********************
		
		          dadar x= new dadar();
		          dadar y=new dadar(65);
		          dadar z=new dadar($);
		        		  
		        		  
		        System.out.println(x.a);
		        System.out.println(y.d);
		        System.out.println(z.h);
		
		
	 
  //   *****************************************************************************
	
	*/
	
 }
	        
	
	
	}
	

