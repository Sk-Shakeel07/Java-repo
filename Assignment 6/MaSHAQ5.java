package assignment6;
import java.util.*;
public class MaSHAQ5 {
	public static boolean isConsecutive(int x, int y, int z)
	{
	if(x==y+1 && y==z+1)
	return true;
	else if(x==y-1 && y==z-1)
	return true;
	else
	return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the first number: ");
		int x = sc.nextInt();
		System.out.print("Input the second number: ");
		int y = sc.nextInt();
		System.out.print("Input the third number: ");
		int z = sc.nextInt();
		System.out.println("Check whether the three said numbers are consecutive or not!");
		System.out.println(isConsecutive(x, y, z));

	}

}
