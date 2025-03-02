package assignment2;

public class CMDQ7 {

	public static void main(String[] args) {
		int a  = Integer.parseInt(args[0]);
		int b  = Integer.parseInt(args[1]);
		int c  = Integer.parseInt(args[2]);
		boolean b1 = a*b>=c||a*c>=b||b*c>=a?true:false;
		System.out.println(b1);
		/*int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		boolean val = (a<=b*c?true:(b<=a*c?true:(c<=a*b?true:false)));
		System.out.println(val);*/
		

	}

}
