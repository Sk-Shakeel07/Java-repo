package assignment6;
import java.util.*;
public class MaSQ5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of sides: ");
    int n = sc.nextInt();
    System.out.print("Enter the length of side: ");
    double side = sc.nextDouble();
    double area = area(n,side);
    System.out.println("Area is "+area);
	}
    public static double area(int n, double side) {
    return (n*Math.pow(side,2))/(4*Math.tan(Math.PI/n));  
    }
}
