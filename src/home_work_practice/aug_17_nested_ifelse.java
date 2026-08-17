package home_work_practice;

public class aug_17_nested_ifelse {
	public static void main(String[] args) {
		int marks=20;
		if(marks>=80) {
			System.out.println("Topper");
		}
		else if(marks>=78){
			System.out.println("second topper");
		}
		else if(marks>=54)
		{
			System.out.println("third");
			
		}
		else if(marks>=35){
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}

}
