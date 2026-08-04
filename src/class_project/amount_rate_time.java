package class_project;
import java.util.Scanner;

public class amount_rate_time {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter  Amount: ");
        double Amount = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        // Simple Interest Formula
        double si = (Amount * rate * time) / 100;

        System.out.println("Simple Interest = " + si);

}
	
}
