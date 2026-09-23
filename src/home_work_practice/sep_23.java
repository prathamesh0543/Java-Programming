package home_work_practice;


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

public class sep_23 {

	public static void main(String[] args) {


		get a=new get();
		a.get();
		get.get1();
		get.display(15,"prathamesh");

	}

}
