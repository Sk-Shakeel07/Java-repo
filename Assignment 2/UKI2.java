package assignment2;
import java.util.*;
public class UKI2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        System.out.println("Enter the distance between two cities = ");
       float meter,centimeter;
        double feet,inch;
        float km = sc.nextFloat();
        meter = km*1000;
        centimeter = km*100000;
        feet = km*3280.8399;
        inch = km*39370.0787;
        System.out.println(km + "km in other values = ");
        System.out.println("meter=" +meter);
        System.out.println("centimeter =" +centimeter);
        System.out.println("feet =" +feet);  
        System.out.println("inch =" + inch);
        
     
	}

}
