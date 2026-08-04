package OOPs;

class car{
	
	int modelno;
	String madelname;
	car(){
//		System.out.println("Default constructor: "+modelno+" "+madelname);

	}
	car(int no, String name){
		modelno=no;
//		madelname=name;
		System.out.println("Parameterized constructor: "+modelno+" "+madelname);
	}
	car(car ob){
//		System.out.println("Copy constructor: "+ob.modelno+" "+ob.madelname);

	}
	public String toString() {
	return"modelno"+modelno+"madelname"+madelname;
		
	}
}

public class June_16_jm {

	public static void main(String[] args) {
		
		car c1=new car();
		System.out.println(c1);
		car c2=new car(2,"thar");
		System.out.println(c2);

		car c3=new car(c2);
		System.out.println(c3);

	}

}
