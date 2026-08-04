package OOPs;

class single
{
	void s()
	{
		System.out.println("single");
	}
}
class Ac extends single 
{
	void c()
	{
		System.out.println("one parent one child");
	}
}

public class single_inheritance {

	public static void main(String[] args) {
		Ac p=new Ac();
		p.s();
		p.c();
		
	}

}
