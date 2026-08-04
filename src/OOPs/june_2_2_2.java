package OOPs;

class test2
{
	
	
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void mul(int a, int b) {
		System.out.println(a*b);
	}
}

public class june_2_2_2 {

	public static void main(String[] args) {
		test2 t1=new test2();
		t1.add(5, 6);
		test2 t2=new test2();
		t2.mul(5, 2);

	}

}
