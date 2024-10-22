package z2_All_Program;

public class AllProgram {
	
	//(All Progarm List: odd even, number addition,fabonnacci series,prime number
   //  largest number of four,
	// odd even
	
		public static void main(String[]args)
		{
			
		
	/*
      int a= 96;
		int b=a%2;
		
		if(b==0)
		 {
			System.out.println("even");
		 }
		
		else
		{
			System.out.println("odd");
		}
		
		--------------------------------------------------------------------------
		      addition of numbers
		
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		
		int e=a+b+c+d;
		
		System.out.println(e);
		
	--------------------------------------------------------------------------
	*/
			
/*	//fabonnacci series program practice

	//      Fibonacci series

	public static void main(String[] args) {
		
		int n1=0, n2=1,n3 ;
		int count =10;
		
		System.out.print(n1+ " " +n2);
		
		for(int i=2; i<=count; i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;	
		}	
	}                         // showing right output 1st program
	
*/	
/*	
	public static void main(String[]args) {
      
  int add=8,a=0,b=1,c;

  for(int i=1 ; i<=add ;i++)
    {
      System.out.println(a);
      c=a+b;
      a=b;
      b=c;
      
     }

	}
	
	*/                     // showing right output 2nd program 
		//--------------------------------------------------------------------------


	/*	// prime number program
	 public static void main(String args[]){
  
	  int i,m=0,flag=0;
	  
	  int n=3;//it is the number to be checked    

         m=n/2; 
	  
	  
         
   if(n==0||n==1)
	  {  
	   System.out.println(n+" is not prime number");      
	  }
	  else
	  {  
	   for(i=2;i<=m;i++)
	   {      
	    if(n%i==0){      
	     
	    	System.out.println(n+" is not prime number");      
	     
	    	flag=1;      
	    
	    	break;      
	    }      
	   }      
	  
	   if(flag==0)  { System.out.println(n+" is prime number"); }  
	  
	  }//end of else  
	}  
	*/
//***************************************************************
	 // find largest number of four numbers
	
		/*		int a=11,b=12,c=13,d=14;
				
				if (a>b)
				 {
				   if(a>c)
					{ 
					  if (a>d)
					  {
						  System.out.println("a is largest number");
					  }
			         else
				    {
					  if (b>c)
		  			 {
						if(b>d)
							{
								System.out.println("b is largest number");
							}
			else
			    {
				  if (c>d)
				  {
					  System.out.println("c is largest number");
				  }
		          
			         System.out.println("d is largest number");
		          
				
			    }
		     		}
				}
				 }                   // not showing output
				 }
		*/	
	//********************************************************************
				// find largest number of four numbers	
		
		/*	int a=18,b=45,c=65,d=74;
			
			if (a>b && a>c && a>d)
			  {
				System.out.println("a is largest number");
			  }
			
			else
			  {
			    if (b>c && b>d)
			      {
			        System.out.println("b is largest");
			      }
			  
			else
			  {
				if(c>d)
				{
					System.out.println("c is largest");
				}
				else
				{
				
				System.out.println("d is largest");
			   }
			  }
			  }                   // showing right output
		
			*/	//********************************************************************
			
			//Find ArmStrong Number
  	

        int number = 153, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        	}

        if(result == number)
        {
            System.out.println(number + " is an Armstrong number.");
       
        	}
        else {
            	System.out.println(number + " is not an Armstrong number.");
        		}
		  
	
	
	//reverse string
		
	
//	String l= "priyanka";
//	String x="";
//	for (int i=(l.length()-1);  i>=0 ; i--)
//	{
//	    x = x+ l.charAt(i);
//	}
//	
//	//l=x;
//		System.out.println(x);        
//	          
	          
	          
	}          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          

}
