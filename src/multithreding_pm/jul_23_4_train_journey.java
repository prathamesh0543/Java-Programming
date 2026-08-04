package multithreding_pm;
class train extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Train is started....");
			Thread.sleep(1000);
			System.out.println("Reached Satara....");
			Thread.sleep(2000);
			System.out.println("Reached Karad....");
			Thread.sleep(3000);
			System.out.println("Reached sangli....");
			Thread.sleep(4000);
			System.out.println("next station miraj...");
			
		}
		catch(Exception e)
		{
			System.out.println("Train is not comming...");
		}
	}
}

public class jul_23_4_train_journey {

	public static void main(String[] args) {
		train t=new train();
		t.start();
		

	}

}
