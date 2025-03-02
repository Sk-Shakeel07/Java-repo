package assignment4;
import java.util.*;
public class IS1HAQ4 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		       /* System.out.print("For input, N = ");
		        int n = sc.nextInt();
		        int sE = 0;
		        int pO = 1;
		        for (int i = 1; i <= n; i++) {
		        if (i % 2 == 0) {
		        sE += i;
		        } 
		        else {
		        pO *= i;
		            }
		        }
		        System.out.println("Sum of all even numbers = " + sE);
		        System.out.println("Product of all odd numbers = " + pO);*/
		        System.out.print("Enter the number : ");
		        int n = sc.nextInt(); 
		        System.out.print("Sum of all even numbers = ");
		        int sum = 0, produce =1;
		        for(int i = 1;i<=n;i++)
		        {
		        if(i%2==0)
		        {
		        if(i==2)
		        System.out.print(i);
		        else
		        System.out.print(" + "+i);
		        sum += i;
		        }
		        }
		        System.out.print(" = "+sum);
		        System.out.print("\nProduct of all odd numbers = ");
		        for(int i = 1;i<=n;i++)
		        {
		        if(i%2==1)
		        {
		        if(i==1)
		        System.out.print(i);
		        else
		        System.out.print(" * "+i);
		        produce *= i;
		        }
		        }
		        System.out.print(" = "+produce);
		    }
		}
