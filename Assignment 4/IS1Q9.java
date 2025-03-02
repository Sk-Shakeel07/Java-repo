package assignment4;
import java.util.*;
public class IS1Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter an integer number: ");
		int n = sc.nextInt();
		int n1 = n;
		String s = " ";
		while(n>0) {
		int rem = n%10;
		if(rem!=0) {
		s = rem + s;
		}
		n = n/10;
		}
        System.out.println("After removing 0 from "+n1+" ,the new number is: "+s);
	} 

}
