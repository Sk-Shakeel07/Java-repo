
public class Problem1_RotateRight {
	
		public static void printArray(String msg,int[] n){
		System.out.print(msg + ":");
		for(int a:n){
		System.out.print(a +"\t");
		}
		System.out.println();
		}
		public static void printArray(String msg,String[] n){
		System.out.print(msg + ":");
		for(String a:n){
		System.out.print(a +"\t");
		}
		System.out.println();
		}
		public static void main(String[] args) {
	    int[] n= {10,11,12,13};
		printArray("Input Int array",n);
		rotateRightBy2Bits(n);			
		}
		public static void rotateRightBy2Bits(int[] n) {
		String[] s = new String[n.length];
		String[] res = new String[n.length];
		for(int i=0;i<n.length;i++){
		s[i] =PrefixWithZeroes(Integer.toBinaryString(n[i]));
		res[i]=s[i];
			}
		printArray("Before Rotation", s); 
		for(int i=0;i<n.length;i++){
		int p=(i+1)%4;
		res[p] =  s[i].substring(30) + res[p].substring(0,30); 
		}
		printArray("After Rotation:", res);
		System.out.print("final Result :");
		for(String x : res){
		int a =(int)Long.parseLong(x,2);
		System.out.print(a +"\t");				
		}
		}
		public static String PrefixWithZeroes(String str) {
		while(str.length()!=32)
		str="0" + str;			
		return str;
		}

	}

	


