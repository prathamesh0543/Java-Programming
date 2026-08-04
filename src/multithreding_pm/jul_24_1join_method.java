package multithreding_pm;
class join extends Thread
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println(Thread.currentThread().getName());
//			try {
//				Thread.sleep(3000);
//			}
//			catch(Exception e)
//			{
//				System.out.println("Exception occur...");
//			}
			
		}
	}
}

public class jul_24_1join_method {

	public static void main(String[] args) {
		join j1= new join();
		j1.start();
//		j1.stop();
		//use to stop the execution of thread for while
		
//		j1.suspend();
		//use to suspend the thread
		
//		j1.resume();
		//use to resume those threads which are suspended
		
		
//		try {
//		j1.join();
//		}
//		catch( Exception e)
//		{
//			System.out.println("Exception occur...");
//		}
		join j2= new join();
		j2.start();

	}

}
