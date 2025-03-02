package assignment6;
import java.util.*;
public class MaSHAQ3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.next();
		System.out.println("Middle character of "+str+" is "+middleCharacter(str));
	}
	public static char middleCharacter(String str)
	{
	return str.charAt(str.length()/2);
	}
}
