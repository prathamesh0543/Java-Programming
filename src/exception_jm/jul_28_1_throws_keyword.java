package exception_jm;

class Hallo
{
	static void three() 
	{
		System.out.println("byy");
		System.out.println(20/0);
		
	}
	static void two()
	{
		three();
	}
	static void one()  
	{
		 two();
	}
}

public class jul_28_1_throws_keyword {

	public static void main(String[] args) {
		
		try {
			
			Hallo.one();
			
		}
		
		catch(ArithmeticException e) {
			System.out.println(e);
			
			
		}
		
		

		
	}

}
