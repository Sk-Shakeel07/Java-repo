package assignment4;
import java.util.*;
public class IS1Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base: ");
		int b = sc.nextInt();
		System.out.print("Enter the power: ");
		int p = sc.nextInt();
        int pow = 1;
        for(int i=1; i<=p; i++ ) {
        pow = pow*b;
        }
        System.out.println(b+" to the power "+p+" is: "+pow);
	}

}
