package class_project;
import java.util.Scanner;

public class rupees_convert_to_doller {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		
		double Rupees;
		System.out.println("Enter amount");
		Rupees=sc.nextDouble();
		
		
		double dollar = Rupees / 83.0;
		System.out.println("US Dollars = " + dollar);
		

	}

}
