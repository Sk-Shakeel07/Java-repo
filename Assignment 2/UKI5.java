package assignment2;
import java.util.*;
public class UKI5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Radius of Hemisphere");
        double r = sc.nextDouble();
        double pi = 3.14;
        double SA,V;
        SA = 3*Math.PI*Math.pow(r,2);
        V = (2.0/3)*Math.PI*Math.pow(r,3);
        System.out.println("The surface area of the Hemisphere is "+ SA);
        System.out.println("The volume of the Hemisphere is "+ V);
        
	}

}
