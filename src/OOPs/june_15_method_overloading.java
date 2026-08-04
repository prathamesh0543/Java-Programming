package OOPs;
class ot{
	void set() {
		System.out.println("a");
	}
	void set(int id) {
		System.out.println("b");
	}
	void set(String name) {
		System.out.println("c");
	}
}
public class june_15_method_overloading {

	public static void main(String[] args) {
		
		ot ab=new ot();
		ab.set();
		ab.set(5);
		ab.set("prathamesh");

	}

}
