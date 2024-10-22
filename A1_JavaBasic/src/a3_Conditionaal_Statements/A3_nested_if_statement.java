package a3_Conditionaal_Statements;

public class A3_nested_if_statement {
	
	public static void main(String[]args)
	{
		int math =94;
		int pass =35;
		int good=85;
		int best=90;
		
		if(math>pass)
		{
			if(math>good)
			{
				if(math>best)
				{
					System.out.println("best student");
				}
				else
					
				System.out.println("good student");
			}
			else
			System.out.println("Student passed");
		}
		else
		System.out.println("Student Fail");
	}
	
	
	

}
