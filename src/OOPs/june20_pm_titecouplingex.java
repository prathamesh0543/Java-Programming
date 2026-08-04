package OOPs;

class A1{
	void pc() {
		System.out.println("first");
	}
}
class B1{
	A1 a1=new A1();
	void cp(){
		System.out.println("second");
	}
}
class C1{
	B1 b1=new B1();
	
	void pn() {
		
		System.out.println("third");
	}
}
public class june20_pm_titecouplingex {

	public static void main(String[] args) {
		
		C1 c1=new C1();
		c1.pn();
		c1.b1.cp();
		c1.b1.a1.pc();
	}

}
