package assignment5;
import java.util.*;
public class IS2HAQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++)
		{
		for(int j=n;j>=1;j--)
		{
		if(j==i)
		System.out.print("* ");
		else
		System.out.print(j+" ");
		}
		System.out.println();
		}

	}

}
