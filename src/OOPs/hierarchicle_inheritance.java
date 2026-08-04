package OOPs;

class b5
{
void h()
{
	System.out.println("hierarchicle");
}
}
class b extends b5
{
	void l()
	{
		System.out.println("One parent ");
	}
}
class g extends b5
{
	void m()
	{
		System.out.println("multiple child");
	}
}

public class hierarchicle_inheritance {

	public static void main(String[] args) {
    
		b a=new b();
		g i=new g();
		
		a.h();
		a.l();
		i.h();
		i.m();
	
	}

}
