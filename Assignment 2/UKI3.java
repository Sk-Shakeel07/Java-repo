package assignment2;
import java.util.*;
public class UKI3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter BS of an Employee:");
		double BS,DA,HRA,GS;
		int Basic = sc.nextInt();
	    double da = (40*Basic)/100;
        double hra = (20*Basic)/100;
        double gs = Basic + hra + da;
        System.out.println("BS is "+Basic);
        System.out.println("DA="+da);
        System.out.println("HRA="+hra);
        System.out.println("GS="+gs); 
        
        
	}

}
