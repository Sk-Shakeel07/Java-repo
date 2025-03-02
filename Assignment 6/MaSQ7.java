package assignment6;
import java.util.*;
public class MaSQ7 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.next();
    int count = count(str);
    System.out.println("Number of Vowels in "+str+" is: "+count);
	}
	public static int count(String str) {
	int c = 0;
	for(int i = 0; i<str.length();i++) {
	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
	c++;
	}
	}
	return c;
	}
}
