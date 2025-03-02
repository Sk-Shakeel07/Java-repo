package assignment4;
import java.util.*;
public class IS1Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a = sc.nextInt();	
		System.out.print("Enter 2nd number: ");
		int b = sc.nextInt();
		System.out.print("Enter 3rd number: ");
		int c = sc.nextInt();	
		int sum = 0;
		for(int i = a; i <= b ; i += c ) {
			System.out.println(i);
		    sum += i;
		    }
		System.out.println("The sum of number displayed is "+sum);
	}

}
