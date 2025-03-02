package assignment5;
import java.util.*;
public class IS2Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter lower value: ");
		int m = sc.nextInt();
		System.out.print("Enter upper value: ");
		int n = sc.nextInt();
		for(int i = m; i<=n; i++) {
		int factorial = 1;
		for(int j = i; j>=1; j--) {
			factorial *= j;
		}
		System.out.println("Factorial of "+i+" is "+factorial);
		}
	}
}
