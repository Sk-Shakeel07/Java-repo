package assignment2;
import java.util.*;
public class UKIHA3 {

	public static void main(String[] args) {
	
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.println("Enter the coordinates of three points (x1, y1), (x2, y2), (x3, y3) of the triangle:");
		        
		        System.out.print("Enter x1: ");
		        double x1 = sc.nextDouble();
		        System.out.print("Enter y1: ");
		        double y1 = sc.nextDouble();
		        
		        System.out.print("Enter x2: ");
		        double x2 = sc.nextDouble();
		        System.out.print("Enter y2: ");
		        double y2 = sc.nextDouble();
		        
		        System.out.print("Enter x3: ");
		        double x3 = sc.nextDouble();
		        System.out.print("Enter y3: ");
		        double y3 = sc.nextDouble();
		        
		        
		        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

		        double s = (side1 + side2 + side3) / 2; // Semi-perimeter
		   
		        double area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
		        System.out.println("The area of the triangle is: " + area);		       	 
	}
}
