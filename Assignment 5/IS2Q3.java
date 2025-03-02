package assignment5;
import java.util.*;
public class IS2Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter lower range: ");
		int lower = sc.nextInt();
		System.out.print("Enter upper range: ");
		int upper = sc.nextInt();
		System.out.print("List of prime number between "+lower+" and "+upper+" are: ");
		for(int n=lower;n<=upper;n++) {
		int c=0;
		for(int i=2; i<=n/2; i++) {
		if(n%i==0) {
		c=1;
		break;
		}
		}
		if(c==0) {
		System.out.print(n+" ");
		}
		}
	}

}
