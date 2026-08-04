package class_project;

public class class25 {
	public static void main(String[] args) {
	int marks=80;
	String result =(marks<35 )? "fail":(marks>35 && marks<=50)? "pass":
		(marks>51 && marks<=60)?"second class" :
			(marks>61 && marks<=70)?"first class" :
				(marks>72 && marks<=100)?"dist": "invalid class";
 System.out.println(result);
	}
}
		
	