package class_project;
import java.util.Scanner;

public class radius_length_breadth {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		 double radius, length, breadth;
	        double circleArea, rectangleArea;



	        System.out.print("Enter the radius of the circle: ");
	        radius = sc.nextDouble();

	        
	        System.out.print("Enter the length of the rectangle: ");
	        length = sc.nextDouble();

	        System.out.print("Enter the breadth of the rectangle: ");
	        breadth = sc.nextDouble();

	       
	        circleArea = 3.14 * radius * radius;
	        rectangleArea = length * breadth;

	       
	        System.out.println("Area of Circle = " + circleArea);
	        System.out.println("Area of Rectangle = " + rectangleArea);

	}

}
