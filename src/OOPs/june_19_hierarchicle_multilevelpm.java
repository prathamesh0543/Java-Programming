package OOPs;

class ns1{
	void m1()
	{
		System.out.println("m1");
	}
}
class ns2 extends ns1
{
	void m2()
	{
		System.out.println("m2");
	}
}
class ns3 extends ns1
{
	void m3()
	{
		System.out.println("m3");
	}
}
class ns4 extends ns3
{
	void m4()
	{
		System.out.println("m4");
	}
}
class ns5 extends ns4
{
	void m5()
	{
		System.out.println("m5");
	}
}

public class june_19_hierarchicle_multilevelpm {

	public static void main(String[] args) {
		
		
		 ns2 o=new ns2();
		 o.m2();
		 o.m1();
		 ns5 ob=new ns5();
		 ob.m5();
		 ob.m4();
		 ob.m3();
		 ob.m1();


	}

}
