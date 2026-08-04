package OOPs;

class cs2{
	cs2(){
		this(2);
		System.out.println("first");
	}
	cs2(int a){
		System.out.println("second");
	}
}

public class june16_pm2 {

	public static void main(String[] args) {
		cs2 c=new cs2();
		cs2 c2=new cs2(2);

		
	}

}
