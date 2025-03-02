package assignment2;
import java.util.*;
public class UKI1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a degree in Fahrenheit");
	double f = sc.nextDouble();
	double c = ((Double)5.0/9)*(f - 32);
	System.out.println(f + "Fahrenheit is "+c+" celcius");
	

	}

}
