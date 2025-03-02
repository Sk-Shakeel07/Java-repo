package assignment5;
import java.util.*;
public class IS2Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i<=n; i++) {
		for(int j = 1; j<=i; j++) {
		sum+=j;
		}		
		}
		System.out.println("Sum of the series is: "+sum);
	}
}
