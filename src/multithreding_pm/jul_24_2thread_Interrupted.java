package multithreding_pm;

class Back extends Thread
{
	public void run()
	{
		try {
			for(int i=1;i<=3;i++)
			{
				System.out.println(Thread.currentThread().getName());
			}
		}
			catch(Exception e){
				System.out.println(e);
			
		
		}
	
}

public class jul_24_2thread_Interrupted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Back b1=new Back();
		b1

	}

}
