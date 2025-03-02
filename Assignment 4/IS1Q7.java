package assignment4;
import java.util.*;
public class IS1Q7 {

	public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for which you want to find out the multiplication table: ");
		int n = sc.nextInt();
        System.out.println("The multiplication table of "+n+" is: ");
        for(int i=1; i<=10; i++) {
        System.out.println(n+"x"+i+"="+(n*i));
        }
	}

}
