package assignment5;
import java.util.*;
public class IS2Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.print("Enter the number of lines: ");
		int n = sc.nextInt();         //A
		for(int i = 1; i<=n; i++) {
		for(int j = 1; j<=i; j++) {
		System.out.print(i+" ");
		}
		System.out.println();
		}*/		
		/*System.out.print("Enter the number of lines: ");
		int n = sc.nextInt();              //B
		int k = 1;
		for(int i = 1; i<=n; i++) {
		for(int j = 1; j<=i; j++) {
		System.out.print(k+" ");
		k++;
		}
		System.out.println();
		}*/
		/*System.out.print("Enter the number of lines: ");
		int n = sc.nextInt();             //C
		for(int i = 1; i<=n; i++) {
		for(int j = 1; j<=i; j++) {
		System.out.print(j+" ");
		}
		System.out.println();
		}*/
		/*System.out.print("Enter the number of lines: ");
		int n = sc.nextInt();         //D
		for(int i = 1; i<=n; i++) {
		for(int j = 1; j<=i; j++) {
		System.out.print((char)(j+64)+" ");
		}
		System.out.println();
		}*/                        
		/*System.out.print("Enter the number of lines: ");
		int n = sc.nextInt();         //E
		for(int i = n; i>=1; i--) {
		for(int j = 1; j<=i; j++) {
		System.out.print("$ ");
		}
		System.out.println();
		}*/
		System.out.print("Enter the number of lines: ");
		int n = sc.nextInt();       //F
		for(int i = 1; i<=n; i++) {
		for(int j = 1; j<=n-i; j++) {
		System.out.print("  ");
		}
		for(int k= 1; k<=i; k++) {
		System.out.print(i+" "); 
		}
		System.out.println();
		}		
		}
	}
