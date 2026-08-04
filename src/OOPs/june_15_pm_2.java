package OOPs;

class get
{
	void get() {
		
	
	System.out.println("get");
	}
	static void get1() {
		System.out.println("get1");
		
	}
	static void display(int id,String name)
	{
		System.out.println("id "+id+" name "+name);
		
	}
}

public class june_15_pm_2 {

	public static void main(String[] args) {
		get a=new get();
		a.get();
		get.get1();
		get.display(15,"prathamesh");
	}

}
