package assignment5;
import java.util.*;
public class IS2Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int c1=0,c2=0,rev=0;
        for(int i=2; i<=n/2; i++) {
        if(n%i==0) {
        c1=1;
        break;
        }
        }
        for(int i=n;i!=0;i=i/10)
        rev=rev*10+i%10;
        for(int i=2; i<=rev/2; i++)
        if(rev%i==0) {
        c2=1;
        break;
        }
        if(c1==0&&c2==0)
        System.out.println(n+" is twisted prime.");
        else
        System.out.println(n+" is not twisted prime.");
	}
}
