package OOPs;

import java.util.Scanner;

class addition1{
	
	
	void cal(int n1,int n2) {
		int sum=n1+n2;
		System.out.println(sum);
		
	}
	
}

class circle{
	float pi=3.14f;
	void area(int r)
	{
		int a=(int)(pi*r*r);
		System.out.println("area of the circle="+a);
	}
}

public class class_object_2 {
	public static void main(String[] args) {
		Scanner scv=new Scanner(System.in);
		System.out.println("add radius=");
		int r=scv.nextInt();
	circle ab=new circle();
	ab.area(r);
	}

}
