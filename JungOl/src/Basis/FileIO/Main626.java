package Basis.FileIO;

import java.util.Scanner;

public class Main626 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int small = in.nextInt();
		int big = in.nextInt();
		
		int sum = 0;
		
		for(int k=small ; k<=big ;k++){
			
			sum +=  k;
			
		}
		
		System.out.println(sum);
		
		
		in.close();
		
	}

}
