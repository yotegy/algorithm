package Basis.String01;

import java.util.Scanner;

public class Main182 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		char a = in.next().charAt(0);
		char b = in.next().charAt(0);
		
		System.out.printf("%d %d\n", a+b,(int)Math.abs(a-b));
		
		
		in.close();
		
		
		
	}

}
