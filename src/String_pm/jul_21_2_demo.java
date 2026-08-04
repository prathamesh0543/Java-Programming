package String_pm;
class demo12 extends Thread
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
		System.out.println(Thread.currentThread().getName());
		}
	}
}

public class jul_21_2_demo {

	public static void main(String[] args) {
		
		demo12 d1 = new demo12();
		d1.start();
	    d1.setName("first");
		
		
	}
}