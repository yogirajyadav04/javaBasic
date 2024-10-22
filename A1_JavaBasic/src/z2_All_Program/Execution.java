package z2_All_Program;

public class Execution{ 
	
	public static void main(String[] args) { 
		//int a=20,b=30,c;
		/*
		 * //1. Swaping Two Numbers
		 * 
		 * int a=1,b=3,c;
		 * 
		 * c=a; a=b; b=c;
		 * 
		 * System.out.println("a="+a); System.out.println("b="+b);
		 */
		
		/*
		 * //2.Approach
		 * 
		 * int a=1,b=3,c;
		 * 
		 * a=a+b; b=a-b; a=a-b; System.out.println("a="+a); System.out.println("b="+b);
		 */
		
		
		/*
		 * //3.Approach
		 * 
		 * a=a*b; b=a/b; a=a/b;
		 * 
		 * System.out.println("a="+a); System.out.println("b="+b);
		 */
		
		//4. Approach (single Statement)
		
		//--------------------------------------------------------------------------	
			// reverse Number
			
		/*int	num=1234,rev=0;
			
			while(num>0)
			{
			    rev=rev*10+num%10;
			    num=num/10;
			}
			System.out.println(rev);
		*/
		//--------------------------------------------------------------------------             
	
		  //REVERSE STRING
		
			/*
			 * String a="ABCD"; String x=""; int l=a.length();
			 * 
			 * for (int i=l-1;i>=0;i--) { x=x+a.charAt(i); }
			 * 
			 * System.out.println(x);
			 */
		         
		//--------------------------------------------------------------------------
		
		// PALINDROM NUMBER
		
		
		 int num=12321,rev=0; int org_num=num; 
		  while(num>0) 
		 { rev=rev*10+num%10;
		    num=num/10; 
		     } ;
		  
		  System.out.println(rev);
		  
		  if (org_num==rev) 
		  { 
		     System.out.println("yes,its palindrom number ");
		   	} 
		   else 
		   {
		      System.out.println("no, its not palindrom number");
		   	}
		
		//--------------------------------------------------------------------------
		
		// count no.of digit in a number
		
		/*
		 * long num= 1234565435; long count=0; while(num>0) { num=num/10; count++; }
		 * 
		 * System.out.println("Total number of digit in a number is:"+count);
		 */
		
		//--------------------------------------------------------------------------
		
		// number of even and odd digit in a number
		
		/*
		 * int num=123456,even=0,odd=0;
		 * 
		 * while (num>0) { int rem=num%10; if (rem%2==0) { even++; } else { odd++; }
		 * 
		 * num=num/10; }
		 * 
		 * System.out.println("number of even digit in a number:"+even);
		 * 
		 * System.out.println("number of odd digit in a number:"+odd);
		 */
		//--------------------------------------------------------------------------
		
		/*
		 * //sum of digit in a number int num=12345, rem=0;
		 * 
		 * while (num>0) { rem=rem+num%10; num=num/10; } System.out.println(rem);
		 */
		
		//--------------------------------------------------------------------------

		/*
		 * // Largest of three numbers int a=1121,b=5,c=3;
		 * 
		 * if (a>b && a>c) { System.out.println("a is the largest number"); } else if
		 * (b>c && b>a) { System.out.println("b is largest"); } else {
		 * System.out.println("c is largest"); }
		 */
		
		//--------------------------------------------------------------------------

		/*
		 * // Print Fibonacci Number
		 * 
		 * int n1=0,n2=1,sum=0; int upto=8-1;
		 * 
		 * System.out.print(n1+" "+n2); for(int i=2; i<upto;i++) { sum=n1+n2;
		 * System.out.print(" "+sum); n1=n2; n2=sum; }
		 */
		//--------------------------------------------------------------------------

		//prime no. or not
//		
//		int num=12;
//		
//		for(int i=2;i<num;i++)
//		{
//			if(num%i==0)
//			{
//				
//			}
//		}
//		System.out.println("this is prime no.");
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
