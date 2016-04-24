package Basis.Debugging;

import java.util.Scanner;

public class Main526 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double a = in.nextDouble();
		double b = in.nextDouble();
		
		int sum = Integer.parseInt(String.valueOf((long)Math.floor(a*b)));
		
		int sum1 = Integer.parseInt(String.valueOf((long)Math.floor(a))) * Integer.parseInt(String.valueOf((long)Math.floor(b)));
		
		System.out.printf("%d %d",sum,sum1);
		
	}

}
