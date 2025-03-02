package assignment5;
import java.util.Scanner;
public class IS2Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int n = sc.nextInt();
		double sum = 0.0;
		for(int i = 1; i<=n; i++) {
		sum = sum+1/Math.pow(i, 2);
		}
        System.out.println("Sum of the series is: "+sum); 
	}
}
