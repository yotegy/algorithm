	package Basis.pointer;
	
	import java.util.Scanner;
	
	public class Main621 {
	
		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			
			int n1 = in.nextInt();
			int n2 = in.nextInt();
			
			System.out.printf("%d + %d = %d \n", n1,n2,(n1+n2));
			System.out.printf("%d - %d = %d \n", n1,n2,(n1-n2));
			System.out.printf("%d * %d = %d \n", n1,n2,(n1*n2));
			System.out.printf("%d / %d = %d \n", n1,n2,(n1/n2));
			
			
			
			in.close();
	
		}
	
	}
