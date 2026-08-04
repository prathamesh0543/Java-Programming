package OOPs;

class A
{
	void get() {
		System.out.println("get");
	}
	void data() {
		System.out.println("data");
	}
	
}
class B extends A
{
	void get1() {
		
		System.out.println("get1");
	}
	
}
class C{
	C(){
		System.out.println("prathamesh");
	}
}
class D extends C
{
	void get1() {
		
		System.out.println("get1");
	}
	
}

public class june17_inheritance_pm {

	public static void main(String[] args) {
		
//		B t =new B();
//		t.get();
//		t.data();
//		t.get1();
		
		D p1=new D();
		
		
	}

}
