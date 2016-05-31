package Basis.Func03;

import java.util.Scanner;

public class Main232 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		callfunc(num);
		
		
		in.close();
		
	}

	private static void callfunc(int num) {
		// TODO Auto-generated method stub
		
		if(num/3 == 0) {
			System.out.printf("%d ", num);
			return;
		}
		
		
		callfunc(num-2);
		System.out.printf("%d ", num);
		
		
	}

	

}
