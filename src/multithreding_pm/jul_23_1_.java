package multithreding_pm;
class test extends Thread {
	
	public void run()
	{
		get();
		for(int i=1;i<=3;i++)
		{
			show();
			System.out.println(Thread.currentThread().getName());
		}
	}
	void get(){
		System.out.println("get");
		
	}
	void show() {
		System.out.println("show");
	}
}

public class jul_23_1_ {

	public static void main(String[] args) {

		test t=new test();
		t.start();
	}

}
