package OOPs;

class cp{
	void get() {
		set();
		System.out.println("get");
		data();
	}
	void set() {
		System.out.println("ste");
	}
	void data() {
		System.out.println("data");
	}
}
public class june16_pm_1 {

	public static void main(String[] args) {
		cp c=new cp();
		c.get();
	}

}
