package assignment6;
import java.util.*;
public class MaSQ3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	System.out.print("Enter a number: "); 
	int n = sc.nextInt();
	if(isPalindrome(n)) {
	System.out.println(n+" is a palindrome number.");
	}
	else {
	System.out.println(n+" is not a palindrome number.");
	}
	}
    public static int reverse(int number) {
    int rev = 0;
    for(int i = number; i>0; i=i/10) {
    rev = rev*10+i%10;
    }
    return rev;
    }
    public static boolean isPalindrome(int number) {
    if(number==reverse(number)) {
    return true;
    }
    else {
    return false; 
    }
    }
}
