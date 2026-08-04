package class_project;

import java.util.Scanner;

public class marks {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("marthi:");
		int marathi=sc.nextInt();
		System.out.println("marathi"+marathi);
		
		System.out.println("english:");
		int english=sc.nextInt();
		System.out.println("english"+english);
		
		System.out.println("hindi:");
		int hindi=sc.nextInt();
		System.out.println("hindi"+hindi);
		
		System.out.println("geography:");
		int geography=sc.nextInt();
		System.out.println("geography"+geography);
		
		System.out.println("science:");
		int science=sc.nextInt();
		System.out.println("science"+science);

		int sum = marathi+english+hindi+geography+science;
		System.out.println("sum of marks"+sum);
		
		double average = sum/5.0;
		System.out.println("average"+average);
		

	
	}

}
