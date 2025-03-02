package assignment2;

public class CMDHMQ3 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int lastD = a%10;
		int firstD = a/1000;
		int sum = lastD + firstD;
		System.out.println("sum = "+sum);
		
		

	}

}
