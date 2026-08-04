package class_project;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		String name;
		int age;
		long mobno;
		float per ;
		double fees ;
		boolean Isregistered;
		char gender;
		short rno;
		byte luckyno ;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter name:");
		name=sc.nextLine();
		System.out.println("name="+name);
		
		System.out.println("Enter age:");
		age=sc.nextInt();
		System.out.println("age="+age);
		
		System.out.println("Enter mob no::");
		mobno=sc.nextLong();
		System.out.println("Enter mob no:"+ mobno );
		
		System.out.println("Enter per::");
		per=sc.nextFloat();
		System.out.println("Enter percentage:"+per);
		
		System.out.println("Enter fees:");
		fees=sc.nextDouble();
		System.out.println("Enter fees:"+fees);
		
		System.out.println("Enter Isregistered::");
		Isregistered=sc.hasNextBoolean();
		System.out.println("you are registered:"+Isregistered);

		System.out.println("Enter gender::");
		gender=sc.next().charAt(0);
		System.out.println("Enter gender:"+gender);
		
		System.out.println("Enter rno::");
		rno=sc.nextShort();
		System.out.println("Enter roll no:"+rno);

		System.out.println("Enter luckyno::");
		luckyno=sc.nextByte();
		System.out.println("Enter lucky no:"+luckyno);
		
		System.out.println("name="+name+"   "+"age="+age +"   "+"mobile no="+mobno+"   "+"percentage="+per+"  "+
		"enter fees="+fees+"  "+"you are registered="+Isregistered+	"  "+"your gender"+gender+"  "+
		"roll no="+rno+"  "+"lucky no="+luckyno);		
				

		


		

	}

}
