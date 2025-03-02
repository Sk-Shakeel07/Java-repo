package com.assignment3;
import java.util.*;
public class CSIQ7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter unit = ");
		int unit = sc.nextInt();
		double amount = 0;
		if(unit<=50)
		amount = unit*3;
		else if(unit<=200)
		amount = (50*3)+(unit-50)*4.80;	
	    else if(unit<=400) 
	    amount = (50*3)+(150*4.80)+(unit-200)*5.80;	
	    else 
        amount = (50*3)+(150*4.80)+(200*5.80)+(unit-400)*6.20;		
	    System.out.print("Do you want to pay online (y/n): "); 
	    char ch = sc.next().charAt(0);
	    double discount = 0;
	    if(ch == 'y' || ch == 'Y')
	    discount = amount*0.03;
	    System.out.println("Total amount is: "+amount);
	    System.out.println("Discount is: "+discount);
	    System.out.println("Payable amount is: "+(amount - discount));

	}

}
