package home_work;

public class Array1 {
	public static void main(String[] args) {
		int a[]= {23,4,24,64,23};
		System.out.println("one");
		
		System.out.println(a[3]);
		
		System.out.println("all ");
		
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("for each");
		
		for(int i:a)
		{
			System.out.println(i);
		}
	}

}
