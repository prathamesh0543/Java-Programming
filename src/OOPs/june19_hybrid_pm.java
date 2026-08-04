package OOPs;

//single + hierarchicle 
//		class 1
//		
//		class 2
//		
//		
//class 3          class 4

class class1{
	void get() {
		System.out.println("get");
		
	}
}
class class2 extends class1

{
	void get1() {
		System.out.println("get1");

	}
}
class class3 extends class2
{
	void get2() {
		System.out.println("get2");

	}
}
class class4 extends class2
{
	void get3() {
		System.out.println("get3");

	}
}

public class june19_hybrid_pm {

	public static void main(String[] args) {

		class3 c1=new class3();
		c1.get();
		c1.get1();
		c1.get2();
		class4 c2=new class4();
		c2.get();
		c2.get1();
		c2.get3();
		
		
	}

}
