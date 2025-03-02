package assignment5;
import java.util.*;
public class IS2Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an 1st number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter an 2nd number: ");
		int n2 = sc.nextInt();
		int s1 = 0, s2 = 0;
		for(int i =1; i<=n1/2; i++) {
		if(n1%i==0) {
		s1 = s1 + i;
		}
		}
		for(int i =1; i<=n2/2; i++) {
		if(n2%i==0) {
		s2 = s2 + i;
		}
		}
		if(s2 == n1 && n2 == s1) {
		System.out.println(n1+" and "+n2+" are amplicable numbers.");
		}
		else {
			System.out.println(n1+" and "+n2+" are not amplicable numbers.");
		}
	}

}
