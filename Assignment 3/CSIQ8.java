package com.assignment3;
import java.util.*;
public class CSIQ8 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the co-ordinate x: ");
	double x = sc.nextDouble();
	System.out.print("Enter the co-ordinate y: ");
	double y = sc.nextDouble();
	if(x==0 && y==0)
	System.out.println("("+x+","+y+")is on the origin");
	else if(x==0)
	System.out.println("("+x+","+y+")is on the y-axis");
	else if(y==0)
	System.out.println("("+x+","+y+")is on the x-axis");
	else if(x>0 && y>0)
	System.out.println("("+x+","+y+")is on the Quadrant I");
	else if(x<0 && y>0)
	System.out.println("("+x+","+y+")is on the Quadrant II");
	else if(x<0 && y<0)
	System.out.println("("+x+","+y+")is on the Quadrant III");
	else
	System.out.println("("+x+","+y+")is on the Quadrant IV");

	}

}
