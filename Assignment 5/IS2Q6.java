package assignment5;
import java.util.*;
public class IS2Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int n = sc.nextInt();;
		for(int i = n; i>=1; i--) {
		for(int j = 1; j<=i; j++) {
		System.out.print(j+" ");
		}
		System.out.println();
		}
	}

}
