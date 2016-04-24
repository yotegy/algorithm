package Basis.Debugging;

import java.util.Scanner;

public class Main527 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		int sum = a/b;
		
		float sum1 = ((float)a)/b;
		
		sum1 = (Math.round(sum1*100f))/100f;
				
		System.out.printf("%d %.2f",sum,sum1);
		
	}

}
