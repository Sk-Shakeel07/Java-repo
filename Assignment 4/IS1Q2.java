package assignment4;
import java.util.*;
public class IS1Q2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = sc.nextInt();
		int sum = 0;
		int n = number;
		while(n>0) {
		int rem = n%10;  
		n = n/10;
		sum = sum + rem;
		}
        if(sum%9==0) {
        System.out.println("The number "+number+" is divisible by 9.");
        } else {
        System.out.println("The number "+number+" is not divisible by 9.");
        }
        }

}
