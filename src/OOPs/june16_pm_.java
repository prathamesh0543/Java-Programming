package OOPs;
class ab{
	static void get() {
		
		//method overloading
		//compile time overloading 
		//static method overloading
		
		System.out.println("P");
	}
	static void get(int no) {
		System.out.println("N");
	}
}

public class june16_pm_ {

	public static void main(String[] args) {
		ab.get();
		ab.get(5);

	}

}
