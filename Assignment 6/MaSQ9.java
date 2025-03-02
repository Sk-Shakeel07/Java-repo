package assignment6;
import java.util.*;
public class MaSQ9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your password: ");
		String str = sc.next();
		if(passwordChecker(str))
		System.out.println("Valid password");
		else
		System.out.println("Invalid password");
	}
	public static boolean passwordChecker(String str)
	{
	boolean b = true;
	if(str.length()>=8)
	{
	int digit_count = 0;
	for(int i=0;i<str.length();i++)
	{
	if((str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='a'
	&& str.charAt(i)<='z') || (str.charAt(i)>='0' && str.charAt(i)<='9'))
	{
	if(str.charAt(i)>='0' && str.charAt(i)<='9')
	{
	digit_count++;
	}
	}
	else
	{
	b=false;
	break;
	}
	}
	if(digit_count>=2)
	b=true;
	else
	b=false;
	}
	else
	b=false;
	return b;
	}
}
