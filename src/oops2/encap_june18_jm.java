package oops2;

class en2
{
	private int num1,num2;
	 en2(int n1,int n2)
	{
		num1=n1;
		num2=n2;
		
	}
	 
	 int ok() {
		 return num1+num2;
	 }
}

public class encap_june18_jm {

	public static void main(String[] args) {
		en2 e=new en2(2,98);
		System.out.println("Addition= "+e.ok());

	}

}
