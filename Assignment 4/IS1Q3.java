package assignment4;
import java.util.*;
public class IS1Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int min = 1, max = n;
		int i = 1;
		int sum = 0;
		double avg;
		do {
		int no = (int)(Math.random()*(max - min+1)+min);
		System.out.println(no+" ");
		sum += no;
		i++;
		}
        while(i<=n);
		avg = (double)sum/n;
		System.out.println("\nAverage of "+n+" random number is "+avg);
	}

}
