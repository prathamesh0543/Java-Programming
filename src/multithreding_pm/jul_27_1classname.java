package multithreding_pm;
class test27 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getClass());
	}
}

public class jul_27_1classname {

	public static void main(String[] args) {
		
		test27 t1=new test27();
		t1.start();

	}

}
