package multithreding_pm;
class test1 extends Thread {
	
	public void run()
	{
		
		for(int i=1;i<=3;i++)
		{
			
			System.out.println(Thread.currentThread().activeCount());
		}
	}
	}

public class jul_23_2_count_thread {

	public static void main(String[] args) {
		test1 t1=new test1();
		t1.start();
		test1 t2=new test1();
		t2.start();
	}

}

