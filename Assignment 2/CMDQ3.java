package assignment2;

public class CMDQ3 {

	public static void main(String[] args) {
		
		/*int min = 0;
		int max = 10;
		System.out.println((int) (Math.random()*(max-min)+min));*/
		int max  = Integer.parseInt(args[0]);
		int min  = Integer.parseInt(args[1]);
		int a = (int)(Math.random()*(max-min+1))+min;
		int b = (int)(Math.random()*(max-min+1))+min;
		int sum = a + b;
		System.out.println("a = "+a+", b = "+b);
		System.out.println("sum = "+sum);
		
		

	}

}
