package a5_Methods;

public class A1_user_define_ex1 {
	
	static void test()
	{
		System.out.println("a");               //         Method Syntax  
		System.out.println("b");          
		System.out.println("c");             //        static void test()
	}                                       //          {
                                           //               }
	
	
	public static void main(String[]args)    //    public static void main(String[]args)
	{                                        //     {
	    test();                             //        test();
		System.out.println("@");              //         }
		System.out.println("@");
		test();
	}

}
