package class_project;

public class class_p_26 {

	public static void main(String[] args) {
//	int num = 12345;
//	System.out.println(num%10);
//     num=num/10;
//	System.out.println(num%10);
//	 num=num/10;
//	System.out.println(num%10);
//	 num=num/10;
//	System.out.println(num%10);
//	 num=num/10;
//	System.out.println(num%10);
		
		int days =500;
		int year=days/365;
		System.out.println("year ="+year);
		
		int rem=(days%365);
		
		int month=(days%365)/30;
		System.out.println("month ="+month);
		
		
		int week=((days%365)%30)/7;
		System.out.println("week ="+week);
		
		
		int day=(((days%365)%30))%7/1;
		System.out.println("day ="+day);
	
	}
	}
		