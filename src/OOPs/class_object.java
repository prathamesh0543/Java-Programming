package OOPs;

import java.util.Scanner;

class Addition{
	Scanner sc=new Scanner(System.in);
	int n1;
	int n2;
	void add() {
	
	System.out.println("Addition of two nos=");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int add=n1+n2;
		System.out.println("Addition is two numbers "+add);
	}
}

class Subtraction{
	Scanner sc=new Scanner(System.in);
	int n3;
	int n4;
	
	void sub() {
		System.out.println("Subtraction of two nos");
		int n3=sc.nextInt();
		int n4=sc.nextInt();
		int sub=n3-n4;
		System.out.println("Subtraction is two numbers= "+sub);
	}
}

//class student
//{
//	String name="Prathamesh Chavan";
//	int id=543;
//	 
//	void display()
//	{
//		System.out.println("name = "+name);
//		System.out.println("id = "+id);
//	}
//}
//
//class trainer{
//	
//	String name="chavan";
//	int trainer_no=105;
//	
//	void method() {
//		 
//		System.out.println("trainer name = "+name);
//		System.out.println("trainer_no = "+trainer_no);
//	}
//			}

public class class_object {

	public static void main(String[] args) {
//		student a=new student();
//		a.display();
//		
//		trainer t=new trainer();
//		t.method();

		
		Subtraction sb= new Subtraction();
		sb.sub();

	}

}
