import java.util.*;
public class Problem2_ConvertToAnyBase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Decimal integer: ");
		int dN = sc.nextInt();
		System.out.print("Enter the Base value: ");
		int b = sc.nextInt();
		String result = convertToAnyBase(dN,b);
		System.out.println("Decimal: "+dN+" in Base: "+b+" is: "+result);
		 }
		 public static String convertToAnyBase(int n , int b) {
		 if(n==0) {
		 return "0";
		 }
		 StringBuilder result = new StringBuilder();
		 char[] digits="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		 while(n>0) {
		 int remainder = n%b;
		 result.insert(0, digits[remainder]);
		 n/=b;
		 }
		 return result.toString(); 
	}
}
