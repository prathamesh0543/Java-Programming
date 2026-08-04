package multithreding_pm;
class test23 extends Thread
{
	public void run()
	{
		for(int i=1;i<=3;i++){
//			System.out.println(Thread.currentThread().getName());
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println("Exception error...!");
			}
			System.out.println(Thread.currentThread().getName());

		}
	}
}

public class jul_23_3sleepmethod {

	public static void main(String[] args) {
		test23 t2=new test23();
		t2.start();

		test23 t3=new test23();
		t3.start();

	}

}
