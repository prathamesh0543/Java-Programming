package multithreding_pm;

//thread implements runnable
//thread-> start,run
//runnable ->run
class test37 implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getClass());
	}
}

public class jul_27_implements_Runnabld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test37 t1=new test37();
		Thread t2=new Thread(t1);
		t2.start();
		

	}

}
