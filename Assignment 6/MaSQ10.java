package assignment6;
import java.util.*;
public class MaSQ10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("press 1 for triangle, 2 for square, 3 for circle, and 4 for rectangle");
		System.out.print("Enter your choice: ");
		int c = sc.nextInt();
		int x, y, z;
		double r;
		switch(c)
		{
		case 1: System.out.print("Enter the value of three sides of triangle: ");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		System.out.println("Area of triangle is : "+area(x,y,z));
		break;
		case 2: System.out.print("Enter the side of square: ");
		x = sc.nextInt();
		System.out.println("Area of square is : "+area(x));
		break;
		case 3: System.out.print("Enter the radius of circle: ");
		r = sc.nextDouble();
		System.out.println("Area of circle is : "+area(r));
		break;
		case 4: System.out.print("Enter the value of length and breadth of rectangle: ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Area of rectangle is : "+area(x,y));
		break;
		default: System.out.println("Wrong Input");
		}
		}
	public static double area(int x, int y, int z)
	{
	double s = (x+y+z)/2.0;
	return Math.sqrt(s*(s-x)*(s-y)*(s-z));
	}
	public static int area(int x, int y)
	{
	return x*y;
	}
	public static int area(int x)
	{
	return x*x;
	}
	public static double area(double r)
	{
	return Math.PI*Math.pow(r,2);
	}
}
