package Basis.Func03;

import java.util.Scanner;

public class Main231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		callfunc(num);
		
		
		in.close();
		
	}

	private static void callfunc(int num) {

		if(num == 1) {
			System.out.printf("%d ", num);
			return;
		}
		
		callfunc(num/2);
		System.out.printf("%d ", num);
		
		
		
		
	}

}
