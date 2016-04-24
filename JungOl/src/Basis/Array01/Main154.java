package Basis.Array01;

import java.util.Scanner;

public class Main154 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		float sum = 0;
		
		for(int i=0;i<6;i++){
			sum += in.nextFloat();
		}
		
		float avg = sum / 6.0f *10;
		
		avg = Math.round(avg);
		
		avg = avg/10;
		
		System.out.println(avg);
		
		in.close();
		
	}

}
