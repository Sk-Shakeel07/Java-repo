package assignment6;
import java.util.*;
public class MaSHAQ1 {
	public static char nonRepeatedChar(String str) {
    for (int i = 0; i < str.length(); i++) {
	char currentChar = str.charAt(i);        
	if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
	return currentChar;
	}
	}
	return ' '; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your password: ");
		String str = sc.next();
		System.out.println(nonRepeatedChar(str));
	}
}
