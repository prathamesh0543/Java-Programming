package exception_jm;

public class jul_29_1finally_keyword {

	public static void main(String[] args) {

//		String s=null;
//		try
//		{
//			System.out.println(s.length());
//		}
//		catch(NullPointerException e)
//		{
//			System.out.println(e);
//		}
//		finally
//		{
//		System.out.println("Finally Keyword");
//		}
		try {
			int n=20; int m=0;
			System.out.println(n/m);
		
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally Keyword");
		}
	}

}
