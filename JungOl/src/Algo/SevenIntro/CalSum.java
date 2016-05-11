package Algo.SevenIntro;

import java.util.Scanner;

public class CalSum {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int number = in.nextInt();
		
		
		long startTime = System.currentTimeMillis();
		
		System.out.println(findsum01(number));
		
		long endTime = System.currentTimeMillis();
		
		long measuredTime = endTime - startTime;
		
		System.out.println(measuredTime);
		
		startTime = System.currentTimeMillis();
		
		System.out.println(findsum02(number));
		
		endTime = System.currentTimeMillis();
		
		long measuredTime2 = endTime - startTime;

		System.out.println(measuredTime2);
		
		
		System.out.println(" Gap : "+(measuredTime-measuredTime2));
		
	}

	private static int findsum02(int number) {
		
		if(number == 0 ) return 0;
		
		if(number%2 > 0) return (findsum02(number-1)+number);
		
		return 2*findsum02(number/2)+number*number/4;
		
	}

	private static int findsum01(int num) {
		
		int sum = 0;
		
		for(int i=1;i<=num;i++){
			
			sum += i;
			
		}
		
		return sum;
	}

}
