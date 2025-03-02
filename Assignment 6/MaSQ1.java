package assignment6;
import java.util.*;
public class MaSQ1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter choice: ");
    int c = sc.next().charAt(0);
    System.out.print("Enter 1st number: ");
    int m = sc.nextInt();
    System.out.print("Enter 2nd number: ");
    int n = sc.nextInt();
    switch(c) {
    case '+' : System.out.println(sum(m,n));break;
    case '-' : System.out.println(difference(m,n));break;
    case '*' : System.out.println(multiplication(m,n));break;
    case '/' : System.out.println(division(m,n));break;
    case '%' : System.out.println(remainder(m,n));break;
    case 'r' : System.out.println(squareRoot(m));break;
    default : System.out.println("Wrong choice!");   		
    }
	}
    public static int sum(int a, int b) {
    return a+b; 
    }
    public static int difference(int a, int b) {
    return Math.abs(a-b); 
    }
    public static int multiplication(int a, int b) {
    return a*b;  
    }
    public static double division(int a, int b) {
    if(b!=0) {
    return (double)a/b;
    }
    else {
    return 0.0; 
    }
    }
    public static int remainder(int a, int b) {
    return a%b;  
    } 
    public static double squareRoot(int a) {
    return Math.sqrt(a);  
    }    
}
