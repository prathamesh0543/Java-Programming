package home_work_practice;

public class sep_13_fibboncci_series {

	public static void main(String[] args) {
		int n = 10;
		int a = 0;
		int b = 1;

		System.out.print(a + " " + b + " ");

		for(int i = 3; i <= n; i++)
		{
		    int c = a + b;
		    System.out.print(c + " ");

		    a = b;
		    b = c;
		}

	}

}
