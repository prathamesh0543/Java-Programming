package OOPs;

class b0
{
void h()
{
	System.out.println("multilevel");
}
}
class k7 extends b0
{
	void u()
	{
		System.out.println("multiple parent ");
	}
}
class l extends k7
{
	void m()
	{
		System.out.println("multiple child");
	}
}
public class multilevel_inheritance {

	public static void main(String[] args) {
		l hn=new l();
		hn.h();
		hn.u();
		hn.m();

	}

}
