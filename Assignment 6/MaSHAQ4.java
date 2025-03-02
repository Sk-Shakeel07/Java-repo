package assignment6;
import java.util.*;
public class MaSHAQ4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		System.out.println("Number of words of "+str+" is "+wordCount(str));
	}
	public static int wordCount(String str)
	{
	int count = 0;
	for(int i=0;i<str.length();i++)
	{
	if(str.charAt(i)==' ')
	count++;
	}
	return count+1;
	}
}
