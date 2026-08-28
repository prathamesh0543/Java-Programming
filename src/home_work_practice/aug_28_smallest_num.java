package home_work_practice;

public class aug_28_smallest_num {

	public static void main(String[] args) {
		int a=29;
		int b=90;
		int c=56;
		int d=78;
		
		if(a<b && a<c && a<d)
		{
			System.out.println("a is smaller");
		}
		else if(b<c && b<d)
		{
			System.out.println("b is smaller");			
		}
		else if(c<d)
		{
			System.out.println("c is smaller");			
		}
		else
		{
			System.out.println("d is smaller");
		}

	}

}
