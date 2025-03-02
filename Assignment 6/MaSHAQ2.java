package assignment6;
import java.util.*;
public class MaSHAQ2 {
	public static double volume(int s)
	{
	return Math.pow(s, 3);
	}
	public static double volume(double r)
	{
	return (4.0/3)*Math.PI*Math.pow(r, 3);
	}
	public static int volume(int l, int b, int h)
	{
	return l*b*h;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("press 1 for cube, 2 for sphere, and 3 for cuboid: ");
		System.out.print("Enter your choice: ");
		int c = sc.nextInt();
		switch(c)
		{
		case 1: System.out.print("Enter the side of cube");
		int s = sc.nextInt();
		System.out.println("volume of cube is: "+volume(s));
		break;
		case 2: System.out.print("Enter the radius of sphere: ");
		double r = sc.nextDouble();
		System.out.println("volume of sphere is: "+volume(r));
		break;
		case 3: System.out.print("Enter the value of three sides of cuboid: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		System.out.println("volume of cuboid is: "+volume(x,y,z));
		break;
		default: System.out.println("Wrong Input");
		}
	}
}
