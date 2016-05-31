package Basis.Func02;

import java.util.Scanner;

public class Main178 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		int result = square(num);
		
		System.out.println(result);
		
		in.close();
		
	}

	private static int square(int num) {
		// TODO Auto-generated method stub
		
		int result;
		
		
		result = (int)Math.pow(2, num);
		
		
		return result;
	}

	

}
