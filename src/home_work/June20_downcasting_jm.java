package home_work;
class parent
{
	void display() {
		System.out.println("ok");
	}
}
class child extends parent
{
	void test()
	{
		System.out.println("successful casting");
	}
	static void show ( parent p)
	{
		if (p instanceof child)
		{
			child b1=(child)p;
					b1.test();
		}
		else {
			System.out.println("not cild object");
		}
	}
}

public class June20_downcasting_jm {

	public static void main(String[] args) {
		parent o=new child();
		child.show(o);

	}

}
