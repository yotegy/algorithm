package Basis.Func02;

import java.util.Scanner;

public class Main586 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		
		show1(a,b);
		show2(a,b);
		
		
		
		
		in.close();
		
	}

	private static void show1(int a, int b) {
		// TODO Auto-generated method stub
		
		System.out.printf("(%d - %d) ^ 2 = %d\n",a,b,(int)Math.pow(a-b,2) );
		
	}
	
	private static void show2(int a, int b) {
		// TODO Auto-generated method stub
		System.out.printf("(%d + %d) ^ 3 = %d\n",a,b,(int)Math.pow(a+b,3) );
	}

	

	

}
