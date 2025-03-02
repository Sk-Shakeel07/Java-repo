package assignment6;
import java.util.*;
public class MaSQ6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.next();
		System.out.print("Enter the search character: ");
		char c = sc.next().charAt(0);
		System.out.println(c+" occur "+count(str,c)+" time(s) in the string "+str);
	}
	public static int count(String str, char a)
	{
	int count = 0;
	for(int i = 0;i<str.length();i++)
	{
	if(str.charAt(i)==a)
	count++;
	}
	return count;
	}

}
