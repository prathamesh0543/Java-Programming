package oops2;

class stud 
{
	private int marks;

	public String getMarks() {
		if(marks<35)
		{
			return "fail";
			
		}
		else {
			return "pass";
			
		}
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}

public class encapsulation_june18_ {

	public static void main(String[] args) {

		stud ob =new stud();
		ob.setMarks(25);
		System.out.println("result = "+ob.getMarks());
	}

}
