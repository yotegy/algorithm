package Basis.pointer;

import java.util.Scanner;

public class Main623 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		float num[] = new float[5];
		
		for(int k=0;k<num.length;k++){
			
			num[k] = in.nextFloat();
			
		}
		
		
		for(int k=0;k<num.length;k++){
			
			float temp = Math.round(num[k]*10)/10.0f;
			
			System.out.printf("%.1f ", temp);
			
		}
		
		
		in.close();
		
	}

}
