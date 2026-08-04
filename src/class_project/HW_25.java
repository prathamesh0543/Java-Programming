package class_project;

public class HW_25 {

	public static void main(String[] args) {
		
		int ticket =799;
		String maxticket=(ticket==250)?"bus available":(ticket==500)?"car available":(ticket==799)?"train available":"Invalid vehicle";
		
		System.out.println(maxticket);
		
		
//		String A = "yellow";
//		String B = A.equals("red")?"stop":A.equals("yellow")? "start":A.equals("green")?"go":"invalid signal";
//		System.out.println(B);
//		
		
//		int age=31;
//		String ans=(age<=18) ? "you are child" :(age>=30)?"you are adult":(age>=50)?"you are senior citizen":
//			"invalid";
//			
//			System.out.println(ans);
//			
			
	}
}