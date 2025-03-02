package assignment2;
import java.util.*;
public class UKI4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number between 0 to 1000:");
		int n = sc.nextInt();
		int lastdigit = n%10;
		int middigit = (n/10)%10;
		int firstdigit = n/100;
		int sum = firstdigit+middigit+lastdigit;
		System.out.println("The sum of the digits is"+ sum);
		

	}

}
