package Basis.Func03;

import java.util.Scanner;

public class Main588 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		showlist(num);
		
		in.close();
		
	}

	private static void showlist(int num) {

		if(num == 0 ) {
			System.out.println();
			return;
		}
		
		System.out.printf("%d ", num);
		showlist(num-1);
		
	}

}
