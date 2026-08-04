package multithreding_pm;

class order extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Order is placed...!");
			Thread.sleep(1000);
			System.out.println("Order request is accepted...");
			Thread.sleep(2000);
			System.out.println("your order is on the way...");
			Thread.sleep(3000);
			System.out.println("Order is delievered...");
			
		}
		catch(Exception e)
		{
			System.out.println("order is currupted...");
		}
	}
}

public class jul_23_4orderdemo {

	public static void main(String[] args) {
		order o=new order();
		o.start();
		

	}

}
