package assignment5;
import java.util.Scanner;
public class IS2Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int n = sc.nextInt();
		int a=0,b=1,c=1;
		System.out.print("Sequence is: "+a+" "+b+" "+c);
		for(int i = 1; i<=n; i++) {
		int sum = a+b+c;
		System.out.print(" "+sum); 
		a=b;
		b=c;
		c=sum;
		}      
	}
}
