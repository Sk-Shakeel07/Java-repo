package assignment6;
import java.util.*;
public class MaSQ8 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string: ");
    String str = sc.next();
    if(isPalindrome(str)) {
    System.out.println(str+" is a palindrome string.");
    }
    else {
    System.out.println(str+" is not a palindrome string!");
    }
	}
	public static boolean isPalindrome(String str) {
	String s2 = "";
    for(int i = 0; i<str.length();i++) {	
    s2 = str.charAt(i)+s2;    
    }
    return str.equals(s2); 
	}

}
