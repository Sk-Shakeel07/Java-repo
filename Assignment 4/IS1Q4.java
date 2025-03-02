package assignment4;
import java.util.*;
public class IS1Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: "); 
		int x = sc.nextInt();
		int y = sc.nextInt();
        int n1=x , n2=y;
        while(x%y!=0) {
        int temp = x%y;
        x = y;
        y = temp;
        }
        System.out.println("GCD of "+n1+" and "+n2+" is: "+y);
	}

}
