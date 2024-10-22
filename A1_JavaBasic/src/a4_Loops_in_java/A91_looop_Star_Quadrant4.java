package a4_Loops_in_java;

public class A91_looop_Star_Quadrant4 {
	public static void main(String[]args)
	{
	for (int b=10; b>=1; b--) // this is use for line
	{
		
	for (int a=9; a>=b; a--)// this use for space
	{
		System.out.print(" ");
	}
	for (int a=1; a<=b; a++)// this is for star
	{
		 System.out.print("*");
	}
	
	    System.out.println();
	}  
	}

}
